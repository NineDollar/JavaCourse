package com.company.Task1;

import java.util.Arrays;
import java.util.Collection;

/**
 * @ClassName Task1_15
 * @Author NineDollar
 * @Date 2022/4/2 7:47
 * @Version 1.0
 * @Description TODO
 */
public class Task1_15 {

    public static void main(String[] args) {
        int[] m = {1, 2, 3, 4};
        findValueForArrays(m,5);
        findValueForArrays(m,4);
    }

    public static void findValueForArrays(int[] arrays, int value) {
        for (int val : arrays
        ) {
            if (val == value) {
                System.out.println("已找到" + value);
                return;
            }
        }
        System.out.println("未找到" + value);
    }
}


