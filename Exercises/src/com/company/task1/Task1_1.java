package com.company.task1;


/**
 * @ClassName Task1_1
 * @Description TODO
 * @Author NineDollar
 * @Date 2022/4/1 10:50
 * @Version 1.0
 */
public class Task1_1 {
    public static void main(String[] args) {
        new Task1_1().getInfo(2000);
    }

    public void getInfo(int year) {
        String[] tianGanString = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};
        String[] diZhiString = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
        String[] shenXiaString = {"鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪"};
        int tianGan = (year - 3) % 10 - 1;
        int diZhi = (year - 3) % 12 - 1;
        System.out.println(year + "是" + tianGanString[tianGan] + diZhiString[diZhi] + "年," +
                "生肖是" + shenXiaString[diZhi]);
    }
}
