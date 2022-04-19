package com.company.task1;

/**
 * @ClassName Task1_11
 * @Author NineDollar
 * @Date 2022/4/1 21:00
 * @Version 1.0
 * @Description TODO
 */
public class Task1_11 {
    public static void main(String[] args) {
        int month = 8;
        int ticket = 21;
        switch (month) {
            case 7:
            case 8:
            case 9:
                if (ticket >= 20) {
                    System.out.println("优惠10%");
                } else {
                    System.out.println("优惠5%");
                }
                break;
            default:
                if (ticket >= 20) {
                    System.out.println("优惠20%");
                } else {
                    System.out.println("优惠10%");
                }
        }
    }
}
