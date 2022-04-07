package com.company.Task1;

/**
 * @ClassName Task1_13
 * @Author NineDollar
 * @Date 2022/4/1 21:39
 * @Version 1.0
 * @Description TODO
 */
public class Task1_13 {
    public static void main(String[] args) {
        int x1 = 0;
        int x2 = 0;
        for (int i = 0; i < 10; i++) {
            x1 = 30 + i;
            x2 = i * 10 + 3;
            if (x1 * 8256 == x2 * 6528) {
                System.out.println(i+" ");
            }
        }
    }
}
