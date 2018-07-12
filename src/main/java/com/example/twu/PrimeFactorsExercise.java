package com.example.twu;

public class PrimeFactorsExercise {

    public static void main(String[] args) {
        String str = "";
        findFactors(str, 30);

    }

    public static void findFactors(String str, int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                str += i + " ";
                n = n / i;
                findFactors(str, n);
                return;
            }
        }
        if (n != 1) {
            str += n;
        }
        System.out.println(str);
    }
}
