package com.cybertek.tests;

public class PIQ {
    //Reverse String – For Loop
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("reverseString(str) = " + reverseString(str));
    }
    public static String reverseString(String str) {
        String reverse= "";
        for(int i = str.length()-1; i >=0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
