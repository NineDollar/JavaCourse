package com.company.book.chapter10.quickhit;

import java.util.Random;

/**
 * @ClassName Game
 * @Author NineDollar
 * @Date 2022/4/27 17:43
 * @Version 1.0
 * @Description TODO 游戏类
 */
public class Game extends Player {
    /**
     * @param levelNo     级别号
     * @param curScore    积分
     * @param startTime   开始时间
     * @param elapsedTime 结束时间
     */
    public Game(int levelNo, int curScore, long startTime, int elapsedTime) {
        super(levelNo, curScore, startTime, elapsedTime);
    }

    public Game(Player player) {
        super(player);
    }

    /**
     * 输出字符串，返回字符串中用于和玩家的输入进行比较
     */
    public String printStr() {
        StringBuffer buffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < LevelParam.LEVEL[levelNo].getStrLength(); i++) {
            int rand = random.nextInt(LevelParam.LEVEL[levelNo].getStrLength());
            switch (rand) {
                case 0:
                    buffer.append(">");
                    break;
                case 1:
                    buffer.append("<");
                    break;
                case 2:
                    buffer.append("*");
                    break;
                case 3:
                    buffer.append("&");
                    break;
                case 4:
                    buffer.append("%");
                    break;
                case 5:
                    buffer.append("#");
                    break;
                default:
                    break;
            }
        }
        System.out.println(buffer);
        return buffer.toString();
    }

    /**
     * 比较游戏输出out和玩家输入in，根据比较结果输出相应信息
     *
     * @param out
     * @param in
     */
    public void printResult(String out, String in) {
        for (int i = 0; i < out.length(); i++) {
            if (out.charAt(i) != in.charAt(i)) {
                System.out.println(" 输入错误，退出！");
                System.exit(1);
            }
        }
        //如果超时
        long endTime = System.currentTimeMillis();
        elapsedTime = ((int) ((endTime - startTime) / 1000));
        if (elapsedTime > LevelParam.LEVEL[levelNo].getTimeLimit()) {
            System.out.println("你输入太慢了，已经超时，退出！");
            System.exit(2);
        }
        //计算积分
        curScore = LevelParam.LEVEL[levelNo].getPerScore();
        System.out.println("输入正确，您的级别为：" + levelNo + "，积分为：" + curScore +
                "，用时：" + elapsedTime + "秒");
    }
}
