package com.example;


import java.util.concurrent.TimeUnit;

public class Calculator {

    public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
    public int div(int n1,int n2){
        return n1/n2;
    }

    public int complexCalc(int n1,int n2) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        return n1/n2;
    }

}
