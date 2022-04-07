package com.company.Task1;

/**
 * @ClassName Task1_6
 * @Author NineDollar
 * @Date 2022/4/1 19:39
 * @Version 1.0
 * @Description TODO
 */
public class Task1_6 {
    public static void main(String[] args) {
        String[] team1 = {"A", "B", "C"};
        String[] team2 = {"x", "y", "z"};
        for (String value : team1) {
            for (String s : team2) {
                if ("A".equals(value) && "x".equals(s)) {
                    continue;
                }
                if ("C".equals(value) && ("x".equals(s) || "z".equals(s))) {
                    continue;
                }
                System.out.println(value + "对手" + s);
            }
        }
    }
}

