package com.company.learn;

import java.util.Scanner;

/**
 * <p>解析字符串.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/5
 */
public class MyScanner {

  public static void main(String[] args) {
    String cost = "话费清单：市话费76.89，长途话费179.38，短信费用12.68元。";
    Scanner scanner = new Scanner(cost);
    scanner.useDelimiter("[^0123456789.]+");
    double sum = 0;
    while (scanner.hasNext()) {
      try {
        double price = scanner.nextDouble();
        sum += price;
        System.out.println(price);
      } catch (Exception e) {
        String t = scanner.next();
      }
    }
    System.out.println("总费用:" + sum + "元");
  }

}
