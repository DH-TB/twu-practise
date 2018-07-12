package com.example.twu;

public class TriangleExercises {
    public static void main(String[] args) {
        EasiestExerciseEver();
        DrawAHorizontalLine(8);
        DrawAVerticalLine(3);
        DrawARightTriangle(3);
    }

    private static void EasiestExerciseEver(){
        System.out.print("*");

    }

    private static void DrawAHorizontalLine(int n){
        System.out.println();
        for (int i = 0; i < n; ++i) {
            System.out.print("*");
        }
    }

    private static void DrawAVerticalLine(int n){
        System.out.println();
        for (int i = 0; i < n; ++i) {
            System.out.println("*");
        }
    }

    private static void DrawARightTriangle(int n){
        System.out.println();
        String str = "*";
        for (int i = 0; i < n; ++i) {
            System.out.println(str);
            str+="*";
        }
    }

}
