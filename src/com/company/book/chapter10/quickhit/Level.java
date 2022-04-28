package com.company.book.chapter10.quickhit;

/**
 * @ClassName Level
 * @Author NineDollar
 * @Date 2022/4/27 17:34
 * @Version 1.0
 * @Description TODO 级别类
 */
public class Level {
    private int levelNo;
    private int strLength;
    private int strTimes;
    private int timeLimit;
    private int perScore;

    /**
     * @Author NineDollar
     * @param levelNo 级别编号
     * @param strLength 各级别输出字符串长度
     * @param strTimes 各级别输出字符串次数
     * @param timeLimit 各级别闯关的时间限制
     * @param perScore 各级别正确输入一次的积分
     */
    public Level(int levelNo, int strLength, int strTimes, int timeLimit, int perScore) {
        this.levelNo = levelNo;
        this.strLength = strLength;
        this.strTimes = strTimes;
        this.timeLimit = timeLimit;
        this.perScore = perScore;
    }

    public int getLevelNo() {
        return levelNo;
    }

    public int getStrLength() {
        return strLength;
    }

    public int getStrTimes() {
        return strTimes;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public int getPerScore() {
        return perScore;
    }
}
