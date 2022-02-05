package com.cybertek.tests.ReplitQuestions.Assignment.Question_2;

public class LameCalculator {
    public int plus(int a, int b){
        return a+b;
    }

    public int minus (int a, int b){
        return a-b;
    }
    public int multiply (int a, int b){
        return a*b;
    }
    public int divide (int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        LameCalculator lc = new LameCalculator();
        System.out.println("lc.plus(1,1) = " + lc.plus(1, 1));
        System.out.println("lc.minus(1,1) = " + lc.minus(1, 1));
        System.out.println("lc.multiply(2,1) = " + lc.multiply(2, 1));
        System.out.println("lc.divide(10,2) = " + lc.divide(10, 2));
    }

}
