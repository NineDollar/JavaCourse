package com.company.learn;

/**
 * <p>字符串操作.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/8
 */
public class MyStringBuffer {

  public static void main(String[] args) {
    StringBuffer str = new StringBuffer();
    str.append("大家好");
    System.out.println("str:" + str);
    System.out.println("length:" + str.length());
    System.out.println("capacity:" + str.capacity());
    str.append("我们大家都很愿意学习java语言");
    System.out.println("str:" + str);
    System.out.println("length:" + str.length());
    System.out.println("capacity:" + str.capacity());

    StringBuffer strs = new StringBuffer("he like Java");
    strs.setCharAt(0, 'w');
    strs.setCharAt(1, 'e');
    System.out.println(strs);
    strs.insert(2, "all");
    int index = strs.indexOf("Java");
    strs.replace(index, strs.length(), "apple");
    System.out.println(strs);

  }

}
