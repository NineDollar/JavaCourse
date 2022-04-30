package com.company.task1;

/**
 * @ClassName Task1_3
 * @Author NineDollar
 * @Date 2022/4/1 13:54
 * @Version 1.0
 * @Description TODO
 */
public class Task1_3 {
    public static void main(String[] args) {
        byte[] m = new byte[2];
        int r = 0;
        for (int i = 16; i <= 55; i++) {
            for (int j = 1; j <= 94; j++) {
                if (i == 55 && j >= 90) {
                    break;
                }
                m[0] = (byte) (i+160);
                m[1] = (byte) (j+160);
                r++;
                System.out.printf("%-5s%-10s", i+""+j,new String(m));
                if(Math.floorMod(r,8)==0){
                    System.out.println();
                }
            }
        }
    }
}
