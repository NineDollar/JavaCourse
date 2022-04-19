package com.company.task1;

import java.util.Scanner;

/**
 * @ClassName Task1_12
 * @Author NineDollar
 * @Date 2022/4/1 21:34
 * @Version 1.0
 * @Description TODO
 */
public class Task1_12 {
    public static void main(String[] args) {
        double total = 1;
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            total += (double) 1 / (n * (n + 1));
        }
        System.out.println(total);
    }
}
