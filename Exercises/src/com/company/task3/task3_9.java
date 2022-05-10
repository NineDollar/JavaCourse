package com.company.task3;

/**
 * <p>.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/10
 */
public class task3_9 {

  public static void main(String[] args) {
    Object[] objects = {new Addres(), new Rectangle(), new Length(), new Check()};
    for (Object o : objects) {
      System.out.println(o);
    }
  }

  static class Addres {

    @Override
    public String toString() {
      return "Addres";
    }
  }

  static class Rectangle {

    @Override
    public String toString() {
      return "Rectangle";
    }
  }

  static class Length {

    @Override
    public String toString() {
      return "Length";
    }
  }

  static class Check {

    @Override
    public String toString() {
      return "Check";
    }
  }
}
