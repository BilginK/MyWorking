package com.cybertek.tests.ReplitQuestions.Assignment.Question_10;

public class Calculator {

    public static int a;
    public static int b;

    public static int plus(int a, int b){
                return a+b;
    }
    public static int minus(int a, int b){
        if((a-b)<0){
            return 0;
        }else{
            return a-b;
        }

    }

    public static void main(String[] args) {
        System.out.println(Calculator.plus(5, 10));
        System.out.println(Calculator.minus(1, 4));
    }

}

