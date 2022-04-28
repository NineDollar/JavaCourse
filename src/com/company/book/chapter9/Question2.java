package com.company.book.chapter9;

import java.util.Scanner;

/**
 * @ClassName Question2
 * @Author NineDollar
 * @Date 2022/4/27 13:21
 * @Version 1.0
 * @Description TODO
 */
public class Question2 {
    public static void main(String[] args) throws Exception {
        int score;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("请输入成绩: ");
            score = input.nextInt();
            if (score < 0 || score > 100) {
                throw new Exception("请正确输入成绩信息");
            }
            System.out.println("成绩: " + score);
        }
    }
}
