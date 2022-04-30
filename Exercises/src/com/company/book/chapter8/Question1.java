package com.company.book.chapter8;

/**
 * @ClassName Question1
 * @Author NineDollar
 * @Date 2022/4/27 11:59
 * @Version 1.0
 * @Description TODO
 */
public class Question1 {
    abstract static class Shape {
        public abstract double getArea();
    }

    static class Square extends Shape {
        private double height;

        public Square(double height) {
            this.height = height;
        }

        public double getArea() {
            return height * height;
        }
    }

    static class Circle extends Shape {
        private double r = 0;
        private static final double PI = 3.14;

        public Circle(double r) {
            this.r = r;
        }

        public double getArea() {
            return PI * r * r;
        }
    }

    public static void main(String[] args) {
        Shape square = new Square(3);
        Shape circle = new Circle(2);
        System.out.println(square.getArea());
        System.out.println(circle.getArea());
        //Square sq = (Square) circle;
        //System.out.println(sq.getArea());
    }
}
