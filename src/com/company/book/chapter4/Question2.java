package com.company.book.chapter4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName Question2
 * @Author NineDollar
 * @Date 2022/4/26 23:48
 * @Version 1.0
 * @Description TODO
 */
public class Question2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, -1, 5, -2};
        System.out.println("原数组：\n" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("排序后数组：\n" + Arrays.toString(array));
    }
}
