package com.company.book.chapter6;

import java.util.Scanner;

/**
 * @ClassName Question2
 * @Author NineDollar
 * @Date 2022/4/27 7:53
 * @Version 1.0
 * @Description TODO
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入贷款金额：");
        double loan = scanner.nextDouble();
        System.out.println("请输入贷款年限：");
        int year = scanner.nextInt();
        Loan l = new Loan();
        System.out.println("***月供为："+l.loan(loan, year));
    }

    static class Loan {
        private int money;
        private int year;

        public Loan() {
        }

        public Loan(int money, int year) {
            this.money = money;
            this.year = year;
        }

        public double loan(double loan, int yearchoice) {
            double rate = 0;
            if (yearchoice > 0 && yearchoice <= 3) {
                rate = 0.0603;
            } else if (yearchoice > 3 && yearchoice <= 5) {
                rate = 0.0612;
            } else if (yearchoice > 5 && yearchoice <= 20) {
                rate = 0.0639;
            }
            return (loan + loan * rate) / (yearchoice*12);
        }
    }
}
