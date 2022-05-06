package com.company.learn;

import java.util.StringTokenizer;

/**
 * <p>字符串分析器.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/5
 */
public class MyStingTokenizer {

  public static void main(String[] args) {
    String s = "we are stud,ents";
    StringTokenizer fenxi = new StringTokenizer(s, ",");
    int num = fenxi.countTokens();
    while (fenxi.hasMoreTokens()) {
      String str = fenxi.nextToken();
      System.out.println(str);
      System.out.println("还剩" + fenxi.nextToken() + "个单词");
    }
    System.out.println("s共有单词：" + num + "个");
  }
}
