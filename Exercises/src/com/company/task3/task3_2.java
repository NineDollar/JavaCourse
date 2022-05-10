package com.company.task3;

/**
 * <p>.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/9
 */
public class task3_2 {

  static class Vehicle {

    private int wheels;
    private int weight;

    @Override
    public String toString() {
      return "Vehicle{" +
          "wheels=" + wheels +
          ", weight=" + weight +
          '}';
    }
  }

  static class Car extends Vehicle {

    private int passenger_load;

    @Override
    public String toString() {
      System.out.println(super.toString());
      return "Car{" +
          "passenger_load=" + passenger_load +
          '}';
    }
  }

  static class Truch extends Vehicle {

    // 核载人数
    private int passenger_load;
    // 载重量
    private int payload;

    @Override
    public String toString() {
      System.out.println(super.toString());
      return "Truch{" +
          "passenger_load=" + passenger_load +
          ", payload=" + payload +
          '}';
    }
  }
}
