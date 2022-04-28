package com.company.book.chapter9;

/**
 * @ClassName Question1
 * @Author NineDollar
 * @Date 2022/4/27 13:17
 * @Version 1.0
 * @Description TODO
 */
public class Question1 {
    public static void main(String[] args) {
        String a = null;
        try {
            System.out.println(a.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
