/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm.sales.message.processor.executor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author sucheth.shivakumar
 */
public class SalesMessageProcessorTest {

    public SalesMessageProcessorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of processSalesMessages method, of class SalesMessageProcessor.
     */
    @Test
    public void testProcessSalesMessages() throws Exception {
        SalesMessageProcessor instance = new SalesMessageProcessor();
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("2 sales of apples at 10p each");
        instance.processSalesMessages("2 sales of apples at 10p each");
        instance.processSalesMessages("2 sales of apples at 10p each");
        instance.processSalesMessages("2 sales of apples at 10p each");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("2 sales of oranges at 10p each");
        instance.processSalesMessages("2 sales of oranges at 10p each");
        instance.processSalesMessages("2 sales of oranges at 10p each");
        instance.processSalesMessages("2 sales of oranges at 10p each");
        instance.processSalesMessages("multiply 2p apples");
        instance.processSalesMessages("multiply 2p oranges");
        instance.processSalesMessages("add 2p apples");
        instance.processSalesMessages("add 2p oranges");
        instance.processSalesMessages("substract 2p apples");
        instance.processSalesMessages("substract 2p oranges");
        instance.processSalesMessages("add 2p apples");
        instance.processSalesMessages("add 2p oranges");
        instance.processSalesMessages("add 2p apples");
        instance.processSalesMessages("add 2p oranges");
        instance.processSalesMessages("add 2p oranges");
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("2 sales of apples at 10p each");
        instance.processSalesMessages("2 sales of apples at 10p each");
        instance.processSalesMessages("2 sales of apples at 10p each");
        instance.processSalesMessages("2 sales of apples at 10p each");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("2 sales of oranges at 10p each");
        instance.processSalesMessages("2 sales of oranges at 10p each");
        instance.processSalesMessages("2 sales of oranges at 10p each");
        instance.processSalesMessages("2 sales of oranges at 10p each");
        instance.processSalesMessages("multiply 2p apples");
        instance.processSalesMessages("multiply 2p oranges");
        instance.processSalesMessages("add 2p apples");
        instance.processSalesMessages("add 2p oranges");
        instance.processSalesMessages("substract 2p apples");
        instance.processSalesMessages("substract 2p oranges");
        instance.processSalesMessages("add 2p apples");
        instance.processSalesMessages("add 2p oranges");
        instance.processSalesMessages("add 2p apples");
        instance.processSalesMessages("add 2p oranges");
        instance.processSalesMessages("add 2p oranges");
        instance.processSalesMessages("add 2p apples");
        instance.processSalesMessages("add 2p oranges");
        instance.processSalesMessages("add 2p apples");
        instance.processSalesMessages("add 2p oranges");
        instance.processSalesMessages("add 2p oranges");
        instance.processSalesMessages("add 2p oranges");
        instance.processSalesMessages("add 2p oranges");
        instance.processSalesMessages("add 2p oranges");
    }

    /**
     * Test of processSalesMessages method, of class SalesMessageProcessor.
     */
    @Test
    public void testProcessSalesMessages1() throws Exception {
        SalesMessageProcessor instance = new SalesMessageProcessor();
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("watermelon at 10p");
        instance.processSalesMessages("watermelon at 10p");
        instance.processSalesMessages("watermelon at 10p");
        instance.processSalesMessages("watermelon at 10p");
        instance.processSalesMessages("watermelon at 10p");
        instance.processSalesMessages("watermelon at 10p");
        instance.processSalesMessages("watermelon at 10p");
        instance.processSalesMessages("watermelon at 10p");
        instance.processSalesMessages("watermelon at 10p");
        instance.processSalesMessages("watermelon at 10p");
        instance.processSalesMessages("pineapple at 10p");
        instance.processSalesMessages("pineapple at 10p");
        instance.processSalesMessages("pineapple at 10p");
        instance.processSalesMessages("pineapple at 10p");
        instance.processSalesMessages("pineapple at 10p");
        instance.processSalesMessages("pineapple at 10p");
        instance.processSalesMessages("pineapple at 10p");
        instance.processSalesMessages("pineapple at 10p");
        instance.processSalesMessages("pineapple at 10p");
        instance.processSalesMessages("pineapple at 10p");
        instance.processSalesMessages("grapes at 10p");
        instance.processSalesMessages("grapes at 10p");
        instance.processSalesMessages("grapes at 10p");
        instance.processSalesMessages("grapes at 10p");
        instance.processSalesMessages("grapes at 10p");
        instance.processSalesMessages("grapes at 10p");
        instance.processSalesMessages("grapes at 10p");
        instance.processSalesMessages("grapes at 10p");
        instance.processSalesMessages("grapes at 10p");
        instance.processSalesMessages("grapes at 10p");
    }
    
    /**
     * Test of processSalesMessages method, of class SalesMessageProcessor.
     */
    @Test
    public void testProcessSalesMessages2() throws Exception {
        SalesMessageProcessor instance = new SalesMessageProcessor();
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("apple at 10p");
        instance.processSalesMessages("10 sales of apples at 10p each");
        instance.processSalesMessages("Add 10p apples");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("orange at 10p");
        instance.processSalesMessages("10 sales of oranges at 10p each");
        instance.processSalesMessages("Add 10p oranges");
        instance.processSalesMessages("watermelon at 10p");
        instance.processSalesMessages("watermelon at 10p");
        instance.processSalesMessages("watermelon at 10p");
        instance.processSalesMessages("watermelon at 10p");
        instance.processSalesMessages("watermelon at 10p");
        instance.processSalesMessages("watermelon at 10p");
        instance.processSalesMessages("watermelon at 10p");
        instance.processSalesMessages("watermelon at 10p");
        instance.processSalesMessages("10 sales of watermelons at 10p each");
        instance.processSalesMessages("Add 10p watermelons");
        instance.processSalesMessages("pineapple at 10p");
        instance.processSalesMessages("pineapple at 10p");
        instance.processSalesMessages("pineapple at 10p");
        instance.processSalesMessages("pineapple at 10p");
        instance.processSalesMessages("pineapple at 10p");
        instance.processSalesMessages("pineapple at 10p");
        instance.processSalesMessages("pineapple at 10p");
        instance.processSalesMessages("pineapple at 10p");
        instance.processSalesMessages("10 sales of pineapples at 10p each");
        instance.processSalesMessages("Add 10p pineapples");
        instance.processSalesMessages("grape at 10p");
        instance.processSalesMessages("grape at 10p");
        instance.processSalesMessages("grape at 10p");
        instance.processSalesMessages("grape at 10p");
        instance.processSalesMessages("grape at 10p");
        instance.processSalesMessages("grape at 10p");
        instance.processSalesMessages("grape at 10p");
        instance.processSalesMessages("grape at 10p");
        instance.processSalesMessages("10 sales of grapes at 10p each");
        instance.processSalesMessages("Add 10p grapes");
        //error should be thrown
        //instance.processSalesMessages("Add 10p grapes");
    }
}
