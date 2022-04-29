package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NineDollar
 * @version 1.0
 * @since 2022/4/29
 */
public class Main {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("c");
    list.add("d");
    test(list);

  }

  public static void test(List<String> list) {
    list.add("e");
    list.add("f");
    list.stream().forEach(System.out::println);
  }
}
