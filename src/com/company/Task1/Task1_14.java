package com.company.Task1;

import java.util.Scanner;
/**
 * @ClassName Task1_14
 * @Author NineDollar
 * @Date 2022/4/1 21:43
 * @Version 1.0
 * @Description TODO
 */
public class Task1_14 {
    public static void main(String[] args) {
        double conx = 0;
        double x = 0;
        int n = 0;
        int factorial=1;
        Scanner sc = new Scanner(System.in);
        x = sc.nextDouble();
        double radian = Math.toRadians(x);
        double accuracy = 0;
        do {
            n++;
            accuracy = Math.pow(radian, 2 * n - 2) / factorial(2*n-2);
            conx += Math.pow(-1, n - 1) * accuracy;
        } while (accuracy > 10e-4);
        System.out.println(x + "=" + conx);
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
