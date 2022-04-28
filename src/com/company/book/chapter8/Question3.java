package com.company.book.chapter8;

/**
 * @ClassName Question3
 * @Author NineDollar
 * @Date 2022/4/27 12:18
 * @Version 1.0
 * @Description TODO
 */
public class Question3 {
    static abstract class Printer {
        abstract void print();
    }

    static class DotMatrixPrinter extends Printer {
        @Override
        void print() {
            System.out.println("DotMatrixPrinter");
        }
    }

    static class InkperPrinter extends Printer {
        @Override
        void print() {
            System.out.println("InkperPrinter");
        }
    }

    static class LaserPrinter extends Printer {
        @Override
        void print() {
            System.out.println("LaserPrinter");
        }
    }

    public static void main(String[] args) {
        DotMatrixPrinter dotMatrixPrinter = new DotMatrixPrinter();
        InkperPrinter inkperPrinter = new InkperPrinter();
        LaserPrinter laserPrinter = new LaserPrinter();
        dotMatrixPrinter.print();
        inkperPrinter.print();
        laserPrinter.print();
    }
}
