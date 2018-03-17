/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm.sales.message.processor.executor;

import com.jpm.sales.message.processor.constant.Constants;
import com.jpm.sales.message.processor.model.SalesInfo;
import com.jpm.sales.message.processor.util.MessageUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author sucheth.shivakumar
 */
public class SalesMessageProcessor {

    private int messageCount = 0;

    public int getMessagesCount() {
        return messageCount;
    }

    //sales adjustments  w.r.t each product type.
    Map<String, List<String>> salesAdjustmentsMap = new HashMap();

    //stores all the sales information.
    Map<String, List<SalesInfo>> salesDetailsMap = new HashMap();

    public void processSalesMessages(String salesMessage) throws Exception {

        if (salesMessage == null || salesMessage.isEmpty() == true) {
            throw new IllegalArgumentException("Invalid SalesMessage");
        }

        messageCount = messageCount + 1;

        if (messageCount > 50) {
            throw new Exception("Application is busy, cannot process messages now..");
        }

        String[] messageSplitArray = salesMessage.split(" ");

        if (MessageUtil.MESSAGE_TYPE_3.matcher(messageSplitArray[0]).find()) {
            String productType = MessageUtil.getSubString(messageSplitArray[2]);
            int adjustmentValue = MessageUtil.getInt(messageSplitArray[1], true);

            String operation = messageSplitArray[0];
            if (operation.equalsIgnoreCase(Constants.ADD)) {
                processAdjustments(Constants.ADD, productType, adjustmentValue);
            } else if (operation.equalsIgnoreCase(Constants.SUBSTRACT)) {
                processAdjustments(Constants.SUBSTRACT, productType, adjustmentValue);
            } else if (operation.equalsIgnoreCase(Constants.MULTIPLY)) {
                processAdjustments(Constants.MULTIPLY, productType, adjustmentValue);
            } else {
                throw new IllegalArgumentException("Invalid Message Type-3");
            }

            if (salesAdjustmentsMap.containsKey(productType)) {
                List<String> adjustmentList = salesAdjustmentsMap.get(productType);
                adjustmentList.add(messageSplitArray[0] + " " + messageSplitArray[1]);
                salesAdjustmentsMap.put(productType, adjustmentList);
            } else {
                List<String> adjustmentList = new ArrayList<>();
                adjustmentList.add(messageSplitArray[0] + " " + messageSplitArray[1]);
                salesAdjustmentsMap.put(productType, adjustmentList);
            }

        } else if (MessageUtil.MESSAGE_TYPE_2.matcher(messageSplitArray[0]).find()) {
            String productType = MessageUtil.getSubString(messageSplitArray[3]);
            int salesCount = MessageUtil.getInt(messageSplitArray[0], false);
            int salesValue = MessageUtil.getInt(messageSplitArray[5], true);
            processMessages(productType, salesCount, salesValue);

        } else if (MessageUtil.MESSAGE_TYPE_1.matcher(messageSplitArray[0]).find()) {
            // apple at 10p
            String productType = messageSplitArray[0];
            int salesValue = MessageUtil.getInt(messageSplitArray[2], true);
            processMessages(productType, 1, salesValue);

        } else {
            throw new IllegalArgumentException("Invalid message format");
        }

        if (messageCount % 10 == 0) {
            printEachProductSaleValue();
        }

        if (messageCount % 50 == 0) {
            printAdjustments();
        }

    }

    public void processAdjustments(String adjustmentType, String productType, int adjustmentValue) {
        int newValue = 0;
        List<SalesInfo> salesInfoList = salesDetailsMap.get(productType);
        for (SalesInfo salesInfo : salesInfoList) {
            int oldValue = salesInfo.getSalesValue();
            switch (adjustmentType) {
                case Constants.ADD:
                    newValue = oldValue + adjustmentValue;
                    break;
                case Constants.SUBSTRACT:
                    newValue = oldValue - adjustmentValue;
                    break;
                case Constants.MULTIPLY:
                    newValue = oldValue * adjustmentValue;
                    break;
            }
            salesInfo.setSalesValue(newValue);
            salesInfo.setTotalSalesValue(salesInfo.getSalesCount() * newValue);
        }
    }

    public void processMessages(String producType, int salesCount, int salesValue) {
        SalesInfo salesInfo = new SalesInfo();
        salesInfo.setProductType(producType);
        salesInfo.setSalesCount(salesCount);
        salesInfo.setSalesValue(salesValue);
        salesInfo.setTotalSalesValue(salesInfo.getSalesCount() * salesInfo.getSalesValue());
        if (salesDetailsMap.containsKey(salesInfo.getProductType())) {
            List salesInfoList = salesDetailsMap.get(salesInfo.getProductType());
            salesInfoList.add(salesInfo);
            salesDetailsMap.put(salesInfo.getProductType(), salesInfoList);
        } else {
            List salesInfoList = new ArrayList();
            salesInfoList.add(salesInfo);
            salesDetailsMap.put(salesInfo.getProductType(), salesInfoList);
        }
    }

    private void printEachProductSaleValue() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, List<SalesInfo>> entry : salesDetailsMap.entrySet()) {
            int totalSalesCount = 0;
            int totalSalesValue = 0;
            for (SalesInfo salesInfo : entry.getValue()) {
                totalSalesCount = totalSalesCount + salesInfo.getSalesCount();
                totalSalesValue = totalSalesValue + salesInfo.getTotalSalesValue();
            }
            builder.append(entry.getKey()).append("\n");
            builder.append("--------------").append("\n");
            builder.append("totalSalesCount:").append(totalSalesCount);
            builder.append(" totalSalesValue:").append(totalSalesValue).append("\n");
            builder.append("\n");

        }
        System.out.println(builder.toString());
    }

    private void printAdjustments() {
        StringBuilder builder = new StringBuilder();
        builder.append("Application is Pausing, It will stop accepting new messages");
        builder.append("\n");
        for (Map.Entry<String, List<String>> entry : salesAdjustmentsMap.entrySet()) {
            builder.append(entry.getKey());
            builder.append("\n");
            builder.append("-----------------");
            for (String adjustmentMessage : entry.getValue()) {
                builder.append("\n");
                builder.append(adjustmentMessage);
                builder.append("\n");
            }
            builder.append("\n");
        }
        System.out.println(builder.toString());
    }

}
