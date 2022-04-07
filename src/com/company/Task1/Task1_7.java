package com.company.Task1;

/**
 * @ClassName Task1_7
 * @Author NineDollar
 * @Date 2022/4/1 19:54
 * @Version 1.0
 * @Description TODO
 */
public class Task1_7 {
    public static void main(String[] args) {
        int[] E = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] G = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] L = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int valueE : E) {
            for (int valueG : G) {
                for (int valueA : A) {
                    for (int valueL : L) {
                        int x1 = valueE * 1000;
                        int x2 = valueG * 100;
                        int x3 = valueA * 10;
                        int sum = x1 + x2 + x3 + valueL;
                        int y1 = valueL * 1000;
                        int y2 = valueG * 10;
                        int y3 = valueA * 1000;
                        int end = y1 + y2 + y3 + valueE;
                        if (sum == end * valueL) {
                            System.out.println("'E': " + valueE + "    'G': " + valueG + "    'A': " + valueA + "  "
                                    + "    'L': " + valueL);
                        }
                    }
                }
            }
        }
    }
}
