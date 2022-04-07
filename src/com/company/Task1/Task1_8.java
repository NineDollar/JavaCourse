package com.company.Task1;

/**
 * @ClassName Task1_8
 * @Author NineDollar
 * @Date 2022/4/1 20:18
 * @Version 1.0
 * @Description TODO
 */
public class Task1_8 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 20; i++) {
            if (i < 5){
                total += 1;
            }
            if (i > 4){
                total += i - 3;
            }
        }
        System.out.println(total);
    }
}
