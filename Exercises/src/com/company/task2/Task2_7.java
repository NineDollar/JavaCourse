package com.company.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Task2_7
 * @Author NineDollar
 * @Date 2022/4/4 16:50
 * @Version 1.0
 * @Description TODO
 */
public class Task2_7 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student("3320190993426", "宋元双", "男", 21, 4),
                new Student("3320190993427", "李四", "男", 22, 4),
                new Student("3320190993428", "张三", "女", 23, 3),
                new Student("3320190993412", "王五", "女", 21, 3),
                new Student("3320190993438", "王二", "女", 20, 3)
        ));
//        (1)增加学生
        studentList.add(new Student("3320190993434", "王麻子", "男", 23, 1));
//        (2)根据学号删除学生
        studentList.removeIf(x -> "3320190993426".equals(x.getId()));
//        (3)将所有学生年龄增加一岁
        studentList.stream().peek(x -> x.setAge(x.getAge() + 1)).forEach(System.out::println);
//        (4)将某个学生转到另一个班
        studentList.stream().filter(x -> {
            if ("3320190993426".equals(x.getId())) {
                x.setClassId(1);
                return true;
            }
            return false;
        }).forEach(System.out::println);
//        (5)输入班号、列出该班所有学生
        studentList.stream().filter(x -> x.getClassId() == 4).forEach(System.out::println);
    }

    static class Student {
        String id;
        String name;
        String gender;
        int age;
        int classId;

        public Student(String id, String name, String gender, int age, int classId) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.classId = classId;
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

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getClassId() {
            return classId;
        }

        public void setClassId(int classId) {
            this.classId = classId;
        }

        @Override
        public String toString() {
            return String.format("学号: %s, 姓名: %s, 性别: %s, 年龄: %d, 班级: %d", id, name, gender, age,
                    classId);
        }
    }
}
