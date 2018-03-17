/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm.sales.message.processor.model;

/**
 *
 * @author sucheth.shivakumar
 */
public class SalesInfo {

    String productType;
    int salesCount;
    int salesValue;
    int totalSalesValue;

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public int getSalesCount() {
        return salesCount;
    }

    public void setSalesCount(int salesCount) {
        this.salesCount = salesCount;
    }

    public int getSalesValue() {
        return salesValue;
    }

    public void setSalesValue(int salesValue) {
        this.salesValue = salesValue;
    }

    public int getTotalSalesValue() {
        return totalSalesValue;
    }

    public void setTotalSalesValue(int totalSalesValue) {
        this.totalSalesValue = totalSalesValue;
    }

}
