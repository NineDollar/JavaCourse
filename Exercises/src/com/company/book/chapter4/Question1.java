package com.company.book.chapter4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName Question1
 * @Author NineDollar
 * @Date 2022/4/26 23:17
 * @Version 1.0
 * @Description TODO
 */
public class Question1 {
    public static void main(String[] args) {
        List<String> talk = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入5句话: ");
        for (int i = 0; i < 5; i++) {
            talk.add(scanner.nextLine());
        }
        Collections.reverse(talk);
        System.out.println("逆序输出5句话: ");
        for (String s : talk) {
            System.out.println(s);
        }
    }
}
