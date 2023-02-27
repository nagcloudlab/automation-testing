package com.example;

public class ConditionalStatements {
    public static void main(String[] args) {
        /*
            1. if,else
            2. switch-case
         */
        double expected = 1000.00;
        double actual = 500.00;

        if (expected == actual) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }

        int x = 10;
        int y = 20;

        if (x > 5 && y > 10) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        /**
         *  java => room-1
         *  python => room-2
         *  testing => room-3
         */

        String trainingName = "python";
        switch (trainingName) {
            case "java": {
                System.out.println("You are in room-1");
                break;
            }
            case "python": {
                System.out.println("You are in room-2");
                break;
            }
            case "testing": {
                System.out.println("You are in room-3");
                break;
            }
            default:
                System.out.println("No room for your training");
        }


    }
}
