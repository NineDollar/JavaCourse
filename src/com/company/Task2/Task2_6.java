package com.company.Task2;

/**
 * @ClassName Task2_6
 * @Author NineDollar
 * @Date 2022/4/4 16:24
 * @Version 1.0
 * @Description TODO
 */
public class Task2_6 {

    public static void main(String[] args) {
        User user = new User("1234", "张三", "西华大学", 23439);
        User.setRate(0.065);
        System.out.println(user);
        System.out.println("十年后利息为: "+user.getUserRateSum(10));
    }

    static class User {
        private final String id;
        private final String name;
        private final String address;
        private final double money;
        private static double minMoney;
        private static double rate;

        public User(String id, String name, String address, double money) {
            this.id = id;
            this.name = name;
            this.address = address;
            this.money = money;
        }

        public double getUserRate() {
            return money * rate / 100;
        }

        public double getUserRateSum(int year) {
            double interest = 0;
            for (int i = 0; i < year; i++) {
                interest += money * rate / 100;
            }
            return interest;
        }

        public static void setMinMoney(double minMoney) {
            User.minMoney = minMoney;
        }

        public static double getRate() {
            return rate;
        }

        public static void setRate(double rate) {
            User.rate = rate;
        }

        @Override
        public String toString() {
            return String.format("账户: %s, 姓名: %s, 地址: %s, 余额: %.2f", id, name, address, money);
        }
    }
}
