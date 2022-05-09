package com.company.learn;

/**
 * <p>和接口有关的匿名类.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/5
 */
public class InterfaceAnonymous {

  interface Cubic {

    double getCubic(double x);
  }

  static class A {

    void f(Cubic cubic) {
      double result = cubic.getCubic(3);
      System.out.println("result=" + result);
    }
  }

  public static void main(String[] args) {
    Cubic cu = new Cubic() {
      @Override
      public double getCubic(double x) {
        return x * x * x;
      }
    };
    double m = cu.getCubic(5);
    System.out.println("m=" + m);

    A a = new A();
    a.f(new Cubic() {
      @Override
      public double getCubic(double x) {
        return x * x * x;
      }
    });
  }
}
