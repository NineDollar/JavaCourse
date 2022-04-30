package com.company.book.chapter6;

import java.util.Scanner;

/**
 * @ClassName Question3
 * @Author NineDollar
 * @Date 2022/4/27 9:35
 * @Version 1.0
 * @Description TODO
 */
public class Question3 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        do {
            System.out.println("请输入第一条边：");
            a = scanner.nextInt();
            System.out.println("请输入第二条边：");
            b = scanner.nextInt();
            System.out.println("请输入第三条边：");
            c = scanner.nextInt();
            System.out.println("这是一个" + triangle.shape(a, b, c));
            System.out.println("继续？（y/n）");
        } while ("y".equalsIgnoreCase(scanner.next()));
        System.out.println("谢谢使用！");
    }

    static class Triangle {
        private int a;
        private int b;
        private int c;

        public Triangle() {
        }

        public Triangle(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public boolean isTriangle(int a, int b, int c) {
            return a + b > c && a + c > b && b + c > a;
        }

        public String shape(int a, int b, int c) {
            if (isTriangle(a, b, c)) {
                double v = Math.pow(a, 2) + Math.pow(b, 2);
                double v1 = Math.pow(a, 2) + Math.pow(c, 2);
                double v2 = Math.pow(b, 2) + Math.pow(c, 2);
                if (v == Math.pow(c, 2) ||
                        v1 == Math.pow(b, 2) ||
                        v2 == Math.pow(a, 2)) {
                    return "直角三角形";
                } else if (v < Math.pow(c, 2) ||
                        v1 < Math.pow(b, 2) ||
                        v2 < Math.pow(a, 2)) {
                    return "钝角三角形";
                } else if (a == b && b == c) {
                    return "等边三角形";
                } else {
                    return "锐角三角形";
                }
            }
            return "这不构成三角形";
        }
    }
}
