package com.company.task2;

/**
 * @ClassName Task2_3
 * @Author NineDollar
 * @Date 2022/4/4 14:48
 * @Version 1.0
 * @Description TODO
 */
public class Task2_3 {

    public static void main(String[] args) {
        Retangle retangle = new Retangle(new int[]{1, 4}, new int[]{10, 20});
        System.out.println("宽: " + retangle.getWide());
        System.out.println("高: " + retangle.getHigh());
        System.out.println("面积: " + retangle.getArea());
    }

    private static class Retangle {
        private final int[] left;
        private final int[] right;

        public Retangle(int[] left, int[] right) {
            this.left = left;
            this.right = right;
        }

        public int getWide() {
            return Math.abs(left[0] - right[0]);
        }

        public int getHigh() {
            return Math.abs(left[1] - right[1]);
        }

        public int getArea() {
            return getWide() * getHigh();
        }
    }
}
