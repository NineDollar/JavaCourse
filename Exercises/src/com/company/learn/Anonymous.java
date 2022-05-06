package com.company.learn;

/**
 * <p>匿名类.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/5
 */
public class Anonymous {

  abstract static class Speak {

    public abstract void speakHello();
  }

  static class Student {
    void f(Speak speak) {
      speak.speakHello();
    }
  }

  public static void main(String[] args) {
    Speak speak = new Speak() {
      @Override
      public void speakHello() {
        System.out.println("Hello world");
      }
    };
    speak.speakHello();

    Student student = new Student();
    student.f(new Speak() {
      @Override
      public void speakHello() {
        System.out.println("I am is Student.");
      }
    });
  }
}
