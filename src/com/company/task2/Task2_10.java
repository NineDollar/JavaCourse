package com.company.task2;

import java.util.Arrays;

/**
 * @ClassName Task2_10
 * @Author NineDollar
 * @Date 2022/4/4 19:18
 * @Version 1.0
 * @Description TODO
 */
public class Task2_10 {
    public static void main(String[] args) {
        Object[] object = new Object[]{new Address(), new Rectangle(), new Length(), new Check()};
        Arrays.stream(object).forEach(System.out::println);
    }

    static class Address {
        @Override
        public String toString() {
            return "Address{}";
        }
    }

    static class Rectangle {
        @Override
        public String toString() {
            return "Rectangle{}";
        }
    }

    static class Length {
        @Override
        public String toString() {
            return "Length{}";
        }
    }

    static class Check {
        @Override
        public String toString() {
            return "Check{}";
        }
    }
}
