package com.company.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Task2_8
 * @Author NineDollar
 * @Date 2022/4/4 19:03
 * @Version 1.0
 * @Description TODO
 */
public class Task2_8 {
    public static void main(String[] args) {
        List<School> schoolList = new ArrayList<School>(Arrays.asList(
                new School("Java州立大学", "张三", "120"),
                new School("Java州立大学", "王五", "345"),
                new School("Java州立大学", "老二", "545")
        ));
        System.out.println(schoolList.get(1));
    }

    static class School {
        private String schoolName;
        private String studentName;
        private String cardUserTime;
        private final double costIn = 75;
        private final double costOut = 200;
        private static int bill = 0;

        public School(String schoolName, String studentName, String cardUserTime) {
            this.schoolName = schoolName;
            this.studentName = studentName;
            this.cardUserTime = cardUserTime;
            bill++;
        }

        public String getSchoolName() {
            return schoolName;
        }

        public void setSchoolName(String schoolName) {
            this.schoolName = schoolName;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public String getCardUserTime() {
            return cardUserTime;
        }

        public void setCardUserTime(String cardUserTime) {
            this.cardUserTime = cardUserTime;
        }

        public int getBill() {
            return bill;
        }

        @Override
        public String toString() {
            return String.format("学校: %s, 姓名: %s, 行用卡使用时间: %s, 账单: %d", schoolName, studentName,
                    cardUserTime, bill);
        }
    }
}
