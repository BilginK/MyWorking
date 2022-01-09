package com.cybertek.tests.ReplitQuestions.Carpet;

public class Carpet {
    public double width;
    public double length;
    public double unitPrice;
    public double totalPrice;
    public boolean isPersian;

    public Carpet() {
        width=300;
        length=300;
        unitPrice=0;
        isPersian=false;
        totalPrice=200;
        System.out.println("It is not a Persian carpet");

    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

        totalPrice= (width+length)*unitPrice;
        if(this.isPersian==true){
            totalPrice=totalPrice+200;


        }
    }
}
