package com.example;

public class Ex {
    public static void main(String[] args) {

        String ssn = "123-23-6456";
        String pattern="\\d{3}-\\d{2}-\\d{4}";
        if(ssn.matches(pattern)){
            System.out.println("Test Pass");
        }else{
            System.out.println("Test Fail");
        }

    }
}
