/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpm.sales.message.processor.util;

import java.util.regex.Pattern;

/**
 *
 * @author sucheth.shivakumar
 */
public class MessageUtil {

    //Message type-1 Pattern
    public static final Pattern MESSAGE_TYPE_1 = Pattern.compile("^[a-zA-Z]+$");
    //Message type-2 Pattern
    public static final Pattern MESSAGE_TYPE_2 = Pattern.compile("^[0-9]+$");
    //Message type-3 Pattern
    public static final Pattern MESSAGE_TYPE_3 = Pattern.compile("^(Add|Substract|Multiply)$", Pattern.CASE_INSENSITIVE);

    public static int getInt(String inputString, boolean isSubStringRequired) {
        if (isSubStringRequired) {
            inputString = inputString.substring(0, inputString.length() - 1);
        }
        return Integer.valueOf(inputString);
    }

    public static String getSubString(String inputString) {
        String subString = inputString.substring(0, inputString.length() - 1);
        return subString;
    }

}
