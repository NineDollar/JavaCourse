package com.company.book.chapter10.quickhit;

import java.util.Scanner;

/**
 * @ClassName Player
 * @Author NineDollar
 * @Date 2022/4/27 17:27
 * @Version 1.0
 * @Description TODO 玩家类
 */

public class Player {
    public int levelNo = 1;
    public int curScore;
    public long startTime;
    public int elapsedTime;

    public Player() {
    }

    /**
     * @param levelNo     级别号
     * @param curScore    积分
     * @param startTime   开始时间
     * @param elapsedTime 结束时间
     */
    public Player(int levelNo, int curScore, long startTime, int elapsedTime) {
        this.levelNo = levelNo;
        this.curScore = curScore;
        this.startTime = startTime;
        this.elapsedTime = elapsedTime;
    }

    public Player(Player player) {
        this.levelNo = player.levelNo;
        this.curScore = player.curScore;
        this.startTime = player.startTime;
        this.elapsedTime = player.elapsedTime;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            startTime = System.currentTimeMillis();
            Game game = new Game(this);
            game.printResult(game.printStr(), scanner.next());
            levelNo++;
            curScore = 0;
            elapsedTime = 0;
        }
        System.out.println("恭喜闯关成功");
    }

    public int getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    public int getCurScore() {
        return curScore;
    }

    public void setCurScore(int curScore) {
        this.curScore += curScore;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public int getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(int elapsedTime) {
        this.elapsedTime = elapsedTime;
    }
}
