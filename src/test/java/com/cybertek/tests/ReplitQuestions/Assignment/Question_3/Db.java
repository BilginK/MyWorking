package com.cybertek.tests.ReplitQuestions.Assignment.Question_3;

public class Db {
    private String data;
    private int yint;

    public Db(String data, int yint) {
        this.data = data;
        this.yint = yint;
    }

    public String getData() {
        return data;
    }

    public int getYint() {
        return yint;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setYint(int yint) {
        this.yint = yint;
    }

    public static void main(String[] args) {
        Db db = new Db("aaa",123);

        System.out.println("db.getData() = " + db.getData());
        System.out.println("db.getYint() = " + db.getYint());

        db.setData("zzz");
        db.setYint(200);

        System.out.println("db.getData() = " + db.getData());
        System.out.println("db.getYint() = " + db.getYint());
    }
}
