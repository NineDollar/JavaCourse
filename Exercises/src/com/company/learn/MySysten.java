package com.company.learn;

/**
 * <p>系统类.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/8
 */
public class MySysten {

  public static void main(String[] args) {
    String javaVersion = System.getProperty("java.version");
    System.out.println("java的version:" + javaVersion);
    String javaHome = System.getProperty("java.home");
    System.out.println(javaHome);
  }

}
