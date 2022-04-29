package com.company;


import java.lang.reflect.InvocationTargetException;

/**
 * @author NineDollar
 * @version 1.0
 * @since 2022/4/29
 */
public class Main {

  static class MyTest {

    private int id;
    private String name;
  }

  public static void main(String[] args) {
    System.out.println(myTest(MyTest.class));
  }

  private static <T> T myTest(Class<T> clazz) {
    try {
      return clazz.getDeclaredConstructor().newInstance();
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      e.printStackTrace();
    }
    return null;
  }
}
