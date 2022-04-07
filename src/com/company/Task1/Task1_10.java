package com.company.Task1;

/**
 * @ClassName Task1_10
 * @Author NineDollar
 * @Date 2022/4/1 20:53
 * @Version 1.0
 * @Description TODO
 */
public class Task1_10 {
    public static void main(String[] args) {
        System.out.println(p(3,5));
    }

    public static float p(int n, int x) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return x;
        } else {
            return (2 * n - 1) * x * p(n - 1, x) - (n - 1) * p(n - 2, x) / 2;
        }
    }
}
