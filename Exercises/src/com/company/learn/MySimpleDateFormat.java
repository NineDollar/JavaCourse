package com.company.learn;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;

/**
 * <p>日期类.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/8
 */
public class MySimpleDateFormat {

  public static void main(String[] args) {
    Date date = new Date();
    SimpleDateFormat fish = new SimpleDateFormat();
    System.out.println(fish.format(date));

    SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 EEE HH:mm:ss");
    System.out.println(format.format(date));
  }

  @Test
  public void test() {

  }
}
