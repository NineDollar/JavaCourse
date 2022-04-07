package com.company.Task1;

/**
 * The type Task 1 2.
 *
 * @ClassName Task1_2
 * @Description TODO
 * @Author NineDollar
 * @Date 2022 /4/1 10:52
 * @Version 1.0
 */
public class Task1_2 {
    public static void main(String[] args) {
        int[] arrays = {5, 60, 61, 119};
        Task1_2 task1_2 = new Task1_2();
        for (int array : arrays) {
            task1_2.calcFee(array);
        }
    }

    public void calcFee(int iSeconds) {
        int min = 60;
        int seconds = 6;
        int minMoney = 40;
        int secondsMoney = 7;
        int moneyOfMin = 0;
        int moneyOfSeconds = 0;
        int money = 0;
        int minTimes = Math.floorDiv(iSeconds, min);
        if (minTimes != 0) {
//            大于或等于1分钟
            moneyOfMin = minTimes * minMoney;
            int secondsTimes = Math.floorDiv(Math.floorMod(iSeconds, min), seconds);
            int secondsTimesMod = Math.floorMod(Math.floorMod(iSeconds, min), seconds);
//            大于或等于6秒
            if (secondsTimes != 0) {
                moneyOfSeconds = secondsTimes * secondsMoney;
            }
//            小于6秒
            if (secondsTimesMod != 0) {
                moneyOfSeconds += secondsMoney;
            }
        } else {
//            小于1分钟
            moneyOfMin = minMoney;
        }
        money = moneyOfMin + moneyOfSeconds;
        System.out.println(iSeconds + "秒，需支付" + money + "分");
    }
}