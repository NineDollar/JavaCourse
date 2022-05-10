package com.company.task3;

/**
 * <p>.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/10
 */
public class task3_11 {

  public static void main(String[] args) {
    Show show = new Show();
    show.show();
  }

  interface A {

    String str = "string of A";
  }

  interface B extends A {

    String str = A.str + "\tstring of B";
  }

  interface C extends B {

    String str = B.str + "\tstring of C";
  }

  static class Show implements A, B, C {

    public void show() {
      System.out.println(A.str);
      System.out.println(B.str);
      System.out.println(C.str);
    }
  }
}
