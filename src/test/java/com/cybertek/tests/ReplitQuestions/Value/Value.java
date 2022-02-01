package com.cybertek.tests.ReplitQuestions.Value;

public class Value {
    int val;
    boolean modified;

    public Value() {

    }

    public Value(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public boolean wasModified() {
        return modified;
    }

    public void setVal(int val) {
        if(this.val != val) {
            modified = true;
            this.val = val;
        }
    }
}

