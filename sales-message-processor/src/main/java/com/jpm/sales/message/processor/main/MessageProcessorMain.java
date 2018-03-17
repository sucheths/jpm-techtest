/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm.sales.message.processor.main;

import com.jpm.sales.message.processor.executor.SalesMessageProcessor;
import java.util.Scanner;

/**
 *
 * @author sucheth.shivakumar
 */
public class MessageProcessorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SalesMessageProcessor processor = new SalesMessageProcessor();
        while (true) {
            String message = sc.nextLine();
            if (message == null || message.isEmpty() == true) {
                throw new IllegalArgumentException("Invalid SalesMessage");
            }
            try {
                processor.processSalesMessages(message);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }

    }
}
