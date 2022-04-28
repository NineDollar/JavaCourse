package com.company.book.chapter4;

import java.util.Scanner;

/**
 * @ClassName Question3
 * @Author NineDollar
 * @Date 2022/4/27 0:03
 * @Version 1.0
 * @Description TODO
 */
public class Question3 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int timesOf1 = 0, timesOf2 = 0, timesOf3 = 0, times = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入10个数");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
            switch (numbers[i]) {
                case 1:
                    timesOf1++;
                    break;
                case 2:
                    timesOf2++;
                    break;
                case 3:
                    timesOf3++;
                    break;
                default:
                    times++;
            }
        }
        System.out.print("输入的10个数为: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("数字1的个数: " + timesOf1);
        System.out.println("数字2的个数: " + timesOf2);
        System.out.println("数字3的个数: " + timesOf3);
        System.out.println("非法数字的个数: " + times);
    }
}
