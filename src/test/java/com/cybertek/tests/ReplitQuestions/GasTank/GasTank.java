package com.cybertek.tests.ReplitQuestions.GasTank;

public class GasTank {

    double amount = 0;
    double capacity;

    public GasTank(double capacity) {
        this.capacity = capacity;
    }
    public void addGas(double a){
        amount += a;
        if(amount>capacity){
            amount=capacity;
        }
    }
    public void useGas(double b){
        amount-=b;
        if(amount<0){
            amount=0;

        }
    }
    public boolean isEmpty(){
        if(amount<0.1){
            return true;
        }else{
            return false;
        }

    }
    public boolean isFull(){
        if(amount>capacity-0.1){
            return true;
        }else {
            return false;
        }
    }
    public double getGasLevel(){
        return amount;
    }
    public double fillUp(){
        double difference = capacity-amount;
        amount= capacity;
        return difference;
    }
}
