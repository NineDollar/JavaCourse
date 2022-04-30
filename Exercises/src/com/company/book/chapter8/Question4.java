package com.company.book.chapter8;

/**
 * @ClassName Question4
 * @Author NineDollar
 * @Date 2022/4/27 12:56
 * @Version 1.0
 * @Description TODO
 */
public class Question4 {
    interface PCI {
        void start();

        void stop();
    }

    /**
     * 显卡类
     */
    static class GPU implements PCI {
        @Override
        public void start() {
            System.out.println("GPU start");
        }

        @Override
        public void stop() {
            System.out.println("GPU stop");
        }
    }

    /**
     * 声卡类
     */
    static class Audio implements PCI {
        @Override
        public void start() {
            System.out.println("Audio start");
        }

        @Override
        public void stop() {
            System.out.println("Audio stop");
        }
    }

    /**
     * 网卡类
     */
    static class Network implements PCI {
        @Override
        public void start() {
            System.out.println("Network start");
        }

        @Override
        public void stop() {
            System.out.println("Network stop");
        }
    }

    /**
     * 装配类
     */
    static class Computer {
        private PCI pci;

        public Computer(PCI pci) {
            this.pci = pci;
        }

        public void start() {
            pci.start();
        }

        public void stop() {
            pci.stop();
        }
    }

    public static void main(String[] args) {
        Computer[] computer = new Computer[]{new Computer(new GPU()), new Computer(new Audio()),
                new Computer(new Network())};
        for (Computer c : computer) {
            c.start();
        }
        for (Computer c : computer) {
            c.stop();
        }
    }
}
