package com.company.learn;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * <p>数字格式化.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/8
 */
public class MyDeclimalFormat {

  public static void main(String[] args) {
    DecimalFormat format = new DecimalFormat("00000.00");
    String result = format.format(6789.8765);
    System.out.println(result);

    DecimalFormat format1 = new DecimalFormat("#,##,###,##00.00");
    String result1 = format1.format(123456789.99);
    System.out.println(result1);

    DecimalFormat df = new DecimalFormat("####,#00.000$");
    try {
      Number num = df.parse("3,521,563.345$");
      double d = num.doubleValue();
      System.out.println(d);
    } catch (ParseException e) {
      e.printStackTrace();
    }


  }

}
