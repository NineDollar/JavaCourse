package com.company.task3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * <p>.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/10
 */
public class task3_7 {

  public static void main(String[] args) {
    MyList<String> stringMyList = new MyList<String>();
    MyList<Integer> integerMyList = new MyList<Integer>();
    stringMyList.add("one");
    stringMyList.add("two");
    integerMyList.add(1);
    integerMyList.add(2);
    System.out.println(stringMyList);
    System.out.println(integerMyList);
    System.out.println("删除后：");
    stringMyList.remove("one");
    integerMyList.remove(2);
    System.out.println(stringMyList);
    System.out.println(integerMyList);
  }

  static class MyList<T> {

    private List<T> myList = new ArrayList<>();

    public void add(T t) {
      myList.add(t);
    }

    public void remove(T t) {
      myList.remove(t);
    }

    @Override
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      Iterator<T> iterator = myList.iterator();
      while (iterator.hasNext()) {
        T t = iterator.next();
        stringBuilder.append(t);
        stringBuilder.append("\t");
      }
      return stringBuilder.toString();
    }
  }
}
