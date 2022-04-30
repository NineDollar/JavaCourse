package com.company.task1;

/**
 * @ClassName Task1_17
 * @Author NineDollar
 * @Date 2022/4/4 13:37
 * @Version 1.0
 * @Description TODO
 */
public class Task1_17 {
    public static void main(String[] args) {
        double interest=0.0;
        double amount=10000.0;
        double rate=0.065;
        for (int i = 0; i < 10; i++) {
            interest = amount * rate / 100;
            amount += interest;
            System.out.printf("第%-2d年利息: %-20f 结余为: %f\n",(i+1),interest,amount);
        }
    }
}
