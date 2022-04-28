package com.company.book.chapter8;

/**
 * @ClassName Question2
 * @Author NineDollar
 * @Date 2022/4/27 12:12
 * @Version 1.0
 * @Description TODO
 */
public class Question2 {
      abstract static class Animal {
        public abstract void printInfo();
    }

    static class Bird extends Animal {
        @Override
        public void printInfo() {
            System.out.println("我是一只红色的鸟！");
            System.out.println("我今年4岁了！");
        }
    }

    static class Fish extends Animal {
        @Override
        public void printInfo() {
            System.out.println("我是一条5斤重的鱼！");
            System.out.println("我今年2岁了！");
        }
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.printInfo();
        Fish fish = new Fish();
        fish.printInfo();
    }
}
