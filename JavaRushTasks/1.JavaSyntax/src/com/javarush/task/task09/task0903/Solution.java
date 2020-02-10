package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

import javax.lang.model.util.Elements;
import javax.swing.text.html.parser.Element;

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();

/*        System.out.println(stack[2].getLineNumber());
        for (StackTraceElement s: stack) {
            System.out.println(s.getMethodName());
        }*/
        return stack[2].getLineNumber();
    }

    public static int method2() {
        method3();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return  stack[2].getLineNumber();
    }

    public static int method3() {
        method4();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();

        return  stack[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();

        return  stack[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();

        return  stack[2].getLineNumber();
    }
}
