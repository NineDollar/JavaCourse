package com.company;

public class Main {
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void test() throws Exception {
        throw new Exception("自定义的抛出异常");
    }
}
