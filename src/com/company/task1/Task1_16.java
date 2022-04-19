package com.company.task1;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @ClassName Task1_16
 * @Author NineDollar
 * @Date 2022/4/2 9:21
 * @Version 1.0
 * @Description TODO
 */
public class Task1_16 {
    public static void main(String[] args) {
        double[][] arrays = {
                {34.0, 563.0, 44.0, 7.0},
                {565.0, 43.0, 56.0, 2.0},
                {687.0, 4633.0, 6867.0, 54222.0},
                {5.0, 78.0, 35.0, 896.0, 343.0}
        };
        method(arrays, 3, 1);
    }

    public static void method(double[][] arrays, int row, int col) {
        List<Double> rowList = Arrays.stream(arrays[row - 1]).boxed().collect(Collectors.toList());
        List<Double> colList =
                Arrays.stream(arrays).map(x -> x[col - 1]).collect(Collectors.toList());
        double arraysMax =
                Arrays.stream(arrays).flatMapToDouble(Arrays::stream).max().orElse(-1);
        List<Double> diagonal = new ArrayList<>();
        List<Double> subdiagonal = new ArrayList<>();
        for (int i = 0; i < arrays.length; i++) {
            diagonal.add(arrays[i][i]);
            subdiagonal.add(arrays[i][arrays.length - i - 1]);
        }
        System.out.println("第" + row + "行的最大值为: " + Collections.max(rowList));
        System.out.println("第" + col + "列的最大值为: " + Collections.max(colList));
        System.out.println("主对角线的最大值为: " + Collections.max(diagonal));
        System.out.println("副对角线的最大值为: " + Collections.max(subdiagonal));
        System.out.println("二维数组中最大值为: " + arraysMax);
    }
}
