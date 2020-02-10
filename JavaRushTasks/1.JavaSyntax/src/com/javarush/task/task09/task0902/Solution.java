package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

import javax.lang.model.element.Element;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
/*        for (StackTraceElement x: stack) {
            System.out.println(x.getMethodName());
        }
        System.out.println(stack.length);
        System.out.println(stack[stack.length-1].getMethodName());*/
        //System.out.println(stack[2].getMethodName());
        //System.out.println(stack[stack.length-3].getMethodName());
        return stack[2].getMethodName();
    }

    public static String method2() {
        method3();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        //System.out.println(stack[2].getMethodName());
        return stack[2].getMethodName();
    }

    public static String method3() {
        method4();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack[2].getMethodName();
    }

    public static String method4() {
        method5();
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack[2].getMethodName();
    }

    public static String method5() {
        StackTraceElement[] stack = Thread.currentThread().getStackTrace();
        return stack[2].getMethodName();
    }
}
