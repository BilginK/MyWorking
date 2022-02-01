package com.cybertek.tests.Question8;

public class Main {


    public static void main(String[] args) {
        Value v = new Value();
        Value v1 = new Value(67);
        System.out.println("v1.getVal() = " + v1.getVal());
        v.setVal(23);
        v1.setVal(56);
        System.out.println("v.wasModified() = " + v.wasModified());

        System.out.println("v1.getVal() = " + v1.getVal());
        System.out.println("v.getVal() = " + v.getVal());

    }

}
