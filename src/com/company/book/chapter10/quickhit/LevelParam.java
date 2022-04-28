package com.company.book.chapter10.quickhit;

/**
 * @ClassName LevelParam
 * @Author NineDollar
 * @Date 2022/4/27 17:53
 * @Version 1.0
 * @Description TODO 关卡参数
 */
public class LevelParam {
    public static final Level[] LEVEL = new Level[7];

    static {
        LEVEL[0] = null;
        LEVEL[1] = new Level(1, 2, 10, 30, 1);
        LEVEL[2] = new Level(2, 3, 9, 26, 2);
        LEVEL[3] = new Level(3, 4, 8, 22, 5);
        LEVEL[4] = new Level(4, 5, 7, 18, 8);
        LEVEL[5] = new Level(5, 6, 6, 15, 10);
        LEVEL[6] = new Level(6, 7, 5, 12, 15);
    }

}
