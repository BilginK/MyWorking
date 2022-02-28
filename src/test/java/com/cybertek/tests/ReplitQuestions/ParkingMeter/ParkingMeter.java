package com.cybertek.tests.ReplitQuestions.ParkingMeter;

public class ParkingMeter {
    int timeLeft = 0;
    int maxTime;

    public ParkingMeter(int maxTime) {
        this.maxTime = maxTime;
    }

    public boolean add(int num){
        boolean flag = false;
        if (num == 25) {  // Quarters in the USA, you throw into the parking meters
            if(!(timeLeft+30>maxTime)){
                timeLeft+=30;
                flag = true;
            }
        }
        return flag;
    }

    public void tick(){
        if(timeLeft>0){
            timeLeft-=1;
        }
    }
    public boolean isExpired(){
        return (timeLeft == 0);
    }
}

