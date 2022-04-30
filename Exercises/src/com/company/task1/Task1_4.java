package com.company.task1;

/**
 * @ClassName Task1_4
 * @Author NineDollar
 * @Date 2022/4/1 15:18
 * @Version 1.0
 * @Description TODO
 */
public class Task1_4 {
    public static void main(String[] args) {
        String[] game = {"A", "B", "C", "D", "E", "F", "G", "H"};
        int number = 194310057;
        int direction = Math.floorMod((number - 1) / 7 + 1,2);
        int which = Math.floorMod(number, game.length-1);
        int index = 0;
        if (direction == 1) {
            index = which-1;
        }else{
            if (which == 0) {
                which = 7;
            }
            index = game.length - which;
        }
        System.out.println(game[index]+" 先报出: "+number);
    }
}
