package com.example.twu;

public class TriangleExercises {
    public static void main(String[] args) {
        EasiestExerciseEver();
        System.out.println();

        DrawAHorizontalLine(8);
        System.out.println();

        DrawAVerticalLine(3);
        System.out.println();

        DrawARightTriangle(3);
    }

    private static void EasiestExerciseEver(){
        System.out.print("*");

    }

    private static void DrawAHorizontalLine(int n){
        for (int i = 0; i < n; ++i) {
            System.out.print("*");
        }
    }

    private static void DrawAVerticalLine(int n){
        for (int i = 0; i < n; ++i) {
            System.out.println("*");
        }
    }

    private static void DrawARightTriangle(int n){
        String str = "*";
        for (int i = 0; i < n; ++i) {
            System.out.println(str);
            str+="*";
        }
    }

}
