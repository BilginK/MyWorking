package com.cybertek.tests.ReplitQuestions.Color;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Color color = new Color();
        System.out.println(color.toString());

        Color color2 = new Color(in.nextInt(), in.nextInt(),in.nextInt());
        System.out.println(color2.toString()) ;

    }
}
