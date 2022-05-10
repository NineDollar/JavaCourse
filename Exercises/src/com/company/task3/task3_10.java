package com.company.task3;

/**
 * <p>.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/10
 */
public class task3_10 {

  public static void main(String[] args) {
    Shape[] shapes = new Shape[]{
        new Rectangle(2, 4),
        new Circle(3),
        new Triangle(8, 6, 4)
    };
    for (Shape shape : shapes) {
      System.out.println(shape);
      System.out.println("面积：" + shape.getArea());
      System.out.println("周长：" + shape.getPerimeter());
    }
  }

  /**
   * 声明方法.
   */
  abstract static class Shape {

    abstract int getArea();

    abstract int getPerimeter();
  }

  /**
   * 长方形.
   */
  static class Rectangle extends Shape {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
      this.a = a;
      this.b = b;
    }

    @Override
    int getArea() {
      return a * b;
    }

    @Override
    int getPerimeter() {
      return 2 * (a + b);
    }

    @Override
    public String toString() {
      return "长方形：";
    }
  }

  /**
   * 圆.
   */
  static class Circle extends Shape {

    private int r;

    public Circle(int r) {
      this.r = r;
    }

    @Override
    int getArea() {
      return (int) Math.PI * r * r;
    }

    @Override
    int getPerimeter() {
      return (int) Math.PI * 2 * r;
    }

    @Override
    public String toString() {
      return "圆：";
    }
  }

  static class Triangle extends Shape {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
      this.a = a;
      this.b = b;
      this.c = c;
    }

    /**
     * 海伦公式.
     *
     * @return 面积.
     */
    @Override
    int getArea() {
      int p = (a + b + c) / 2;
      return (int) Math.sqrt((p * (p - a) * (p - b) * (p - c)));
    }

    @Override
    int getPerimeter() {
      return a + b + c;
    }

    @Override
    public String toString() {
      return "三角形：";
    }
  }
}
