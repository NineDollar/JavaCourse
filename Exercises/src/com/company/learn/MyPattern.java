package com.company.learn;

import java.util.regex.Pattern;

/**
 * <p>模式对象.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/8
 */
public class MyPattern {

  public static void main(String[] args) {
    Pattern p = Pattern.compile("hello\\d");
    System.out.println(p);
  }

}
