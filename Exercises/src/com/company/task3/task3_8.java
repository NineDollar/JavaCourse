package com.company.task3;

import org.junit.Test;

/**
 * <p>.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/10
 */
public class task3_8 {

  public static void main(String[] args) {
    PolyTester polyTester = new PolyTester();
    polyTester.test();
  }

  static class PolyTester {
    public void test() {
      SuperClass[] superClass = new SuperClass[]{new SubClassA(), new SubClassB()};
      for (SuperClass aClass : superClass) {
        aClass.display();
      }
    }
  }

  abstract static class SuperClass {

    abstract void display();
  }

  static class SubClassA extends SuperClass {

    @Override
    void display() {
      System.out.println("display of SubClassA");
    }
  }

  static class SubClassB extends SuperClass {

    @Override
    void display() {
      System.out.println("display of SubClassB");
    }
  }
}
