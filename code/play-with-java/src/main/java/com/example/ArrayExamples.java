package com.example;

public class Ex1 {
    public static void main(String[] args) {

        int[] numbers = {12, 13, 15, 98, 17, 18, 20, 21};

        // 1. print even number(s) in console from above array

//        for (int i = 0; i < numbers.length; i++) {
//            int n=numbers[i];
//            if(n%2==0){
//                System.out.println(n);
//            }
//        }

        // 2. print total of array-elements

//        int total = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            int n = numbers[0];
//            total = total + n;
//        }
//        System.out.println(total);


        // 3. print max number from above array
        int max=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            int n=numbers[i];
            if(n>max){
                max=n;
            }
        }
        System.out.println(max);

    }
}
