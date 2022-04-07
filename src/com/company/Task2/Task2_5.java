package com.company.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Task2_5
 * @Author NineDollar
 * @Date 2022/4/4 15:56
 * @Version 1.0
 * @Description TODO
 */
public class Task2_5 {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student("3320190993426", "宋元双", 78, 89, 86),
                new Student("3320190993427", "张三", 56, 78, 78)
        ));
        for (Student value :
                studentList) {
            System.out.println(value.getName() + ", 总分: " + value.getScore());
        }
    }

    static class Student {
        private String id;
        private String name;
        private int math;
        private int english;
        private int program;

        public Student(String id, String name, int math, int english, int program) {
            this.id = id;
            this.name = name;
            this.math = math;
            this.english = english;
            this.program = program;
        }

        public int getScore() {
            return math + english + program;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public float getMath() {
            return math;
        }

        public void setMath(int math) {
            this.math = math;
        }

        public float getEnglish() {
            return english;
        }

        public void setEnglish(int english) {
            this.english = english;
        }

        public float getProgram() {
            return program;
        }

        public void setProgram(int program) {
            this.program = program;
        }
    }
}
