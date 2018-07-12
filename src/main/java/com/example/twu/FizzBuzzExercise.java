package com.example.twu;

public class FizzBuzzExercise {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String str = "";

            str += threeMultiple(i) + fiveMultiple(i);
            if(str.equals("")){
                str +=i;
            }
            System.out.println(str);

        }
    }

    private static String threeMultiple ( int i){
        return i % 3 == 0 ? "Fizz" : "";
    }

    private static String fiveMultiple ( int i){
        return i % 5 == 0 ? "Buzz" : "";
    }
}
