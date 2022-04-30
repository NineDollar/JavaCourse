package com.company.book.chapter7;

/**
 * @ClassName Question3
 * @Author NineDollar
 * @Date 2022/4/27 11:50
 * @Version 1.0
 * @Description TODO
 */
public class Question3 {
    static class Phones {
        public void call() {
            System.out.println("call");
        }
    }

    static class IPhone extends Phones {
        @Override
        public void call() {
            System.out.println("IPhone call");
        }
    }

    static class APhone extends Phones {
        @Override
        public void call() {
            System.out.println("APhone call");
        }
    }

    static class WPhone extends Phones {
        @Override
        public void call() {
            System.out.println("WPhone call");
        }
    }

    public static void main(String[] args) {
        Phones iphone = new IPhone();
        Phones aPhone = new APhone();
        Phones windowsPhone = new WPhone();
        iphone.call();
        aPhone.call();
        windowsPhone.call();
    }
}
