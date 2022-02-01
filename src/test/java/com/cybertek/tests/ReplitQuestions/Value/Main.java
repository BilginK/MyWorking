package com.cybertek.tests.ReplitQuestions.Value;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Value v = new Value(in.nextInt());
        System.out.println(v.getVal());
        System.out.println(v.wasModified());
        v.setVal(in.nextInt());
        System.out.println(v.getVal());
        System.out.println(v.wasModified());

    }
}
