package com.company.task1;

/**
 * @ClassName Task1_5
 * @Author NineDollar
 * @Date 2022/4/1 18:50
 * @Version 1.0
 * @Description TODO
 */
public class Task1_5 {
    public static void main(String[] args) {
        int number = 2;
        sqrt(number, number / 2);
    }

    public static void sqrt(int a, double x) {
        double x1 = 0.5 * (x + a / x);
        if (Math.abs(x - x1) < 10e-5) {
            System.out.println(a+"的平方根是: "+x1);
        } else {
            sqrt(a, x1);
        }
    }
}