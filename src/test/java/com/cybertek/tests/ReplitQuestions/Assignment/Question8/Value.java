package com.cybertek.tests.ReplitQuestions.Assignment.Question8;

public class Value {
    /*
Write a class definition of a class named 'Value' with the following:
a constructor accepting a single integer parameter
a constructor with no parameters
a method 'setVal' that accepts a single parameter,
a boolean method, 'wasModified' that returns true if setVal was ever called for the object.
a method 'getVal' that returns an integer value as follows: if setVal has ever been called,
it getVal returns the last value passed to setVal.
Otherwise if the "single int parameter" constructor was used to create the object,
getVal returns the value passed to that constructor. Otherwise getVal returns 0.
     */
    int val;
    boolean modified;
    int counter1=0;
    int counter2=0;

    public Value() {
    }
    public Value(int val) {
        this.val=val;
        counter1++;
    }
    public void setVal(int val) {
        this.val=val;
        modified=true;
        counter2++;
    }
    public boolean wasModified() {
        return modified;
    }
    public int getVal() {
        if(counter1>0){
           return val;
        }else if(counter2>0) {
            return val;
        }else{
            return 0;
        }
    }

}

