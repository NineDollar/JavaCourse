package com.company.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @ClassName Task2_11 @Author NineDollar @Date 2022/4/4 19:24 @Version 1.0 @Description TODO
 */
public class Task2_11 {

  private static final String OK = "ok";
  private static final int SCORES = 10;

  public static void main(String[] args) {
    String id;
    // 检录对象
    DataPerson dataPerson = new DataPerson();
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入选手ID: ");
    id = scanner.next();
    while (!OK.equalsIgnoreCase(id)) {
      // 选手对象
      Person person = new Person();
      double[] score = new double[10];
      person.setId(id);
      System.out.println("请输入选手姓名: ");
      person.setName(scanner.next());
      System.out.println("请输入选手十次成绩: ");
      for (int i = 0; i < SCORES; i++) {
        score[i] = scanner.nextDouble();
      }
      person.setScore(score);
      dataPerson.add(person);
      System.out.println("请输入选手ID(ok结束输入): ");
      id = scanner.next();
    }
    // 评分统计对象
    FinalScore finalScore = new FinalScore();
    // 给每位选手打分
    for (Person person : dataPerson.getAllPersons()) {
      finalScore.setFinalScore(person);
    }
    // 分数显示对象
    ShowScore scoreShow = new ShowScore(dataPerson);
    System.out.println("按选手编号顺序: ");
    scoreShow.showById();
    System.out.println("按选手分数顺序: ");
    scoreShow.showByFinalScore();
  }

  /**
   * 选手对象
   */
  static class Person implements Comparable {

    private String id; // 选手编号
    private String name; // 选手姓名
    private double[] score; // 选手成绩
    private double finalScore; // 选手总分

    public Person() {
    }

    public Person(String id, String name, double[] score) {
      this.id = id;
      this.name = name;
      this.score = score;
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

    public double[] getScore() {
      return score;
    }

    public void setScore(double[] score) {
      this.score = score;
    }

    public double getFinalScore() {
      return finalScore;
    }

    public void setFinalScore(double finalScore) {
      this.finalScore = finalScore;
    }

    @Override
    public String toString() {
      return String.format("编号: %s, 姓名: %s, 成绩: %.1f", id, name, finalScore);
    }

    // 按照选手总分降序排序
    @Override
    public int compareTo(Object o) {
      if (o instanceof Person) {
        Person person = (Person) o;
        if (this.finalScore < person.finalScore) {
          return 1;
        } else if (this.finalScore > person.finalScore) {
          return -1;
        } else {
          return 0;
        }
      }
      throw new RuntimeException("参数类型错误");
    }
  }

  /**
   * 检录对象
   */
  static class DataPerson {

    // 存储多个选手对象
    List<Person> allPersons = new ArrayList<>();

    // 添加选手对象
    public void add(Person person) {
      allPersons.add(person);
    }

    // 移除选手对象
    public void remove(Person person) {
      allPersons.removeIf(x -> x == person);
    }

    // 获取所有选手对象
    public List<Person> getAllPersons() {
      return allPersons;
    }
  }

  /**
   * 评分统计对象
   */
  static class FinalScore {

    // 给选手打分
    public void setFinalScore(Person person) {
      double[] score = person.getScore();
      List<Double> scoreList = Arrays.stream(score).boxed().collect(Collectors.toList());
      scoreList.removeIf(x -> x.equals(Collections.max(scoreList)));
      scoreList.removeIf(x -> x.equals(Collections.min(scoreList)));
      person.setFinalScore(
          scoreList.stream().collect(Collectors.averagingDouble(Double::doubleValue)));
    }
  }

  /**
   * 分数显示对象
   */
  static class ShowScore {

    DataPerson dataPerson;

    public ShowScore(DataPerson dataPerson) {
      this.dataPerson = dataPerson;
    }

    // 按照选手编号显示
    public void showById() {
      // 指定比较
      dataPerson.getAllPersons().stream()
          .sorted(Comparator.comparing(Person::getId))
          .forEach(System.out::println);

//      dataPerson.getAllPersons().sort(Comparator.comparing(Person::getId));
    }

    // 按照选手总分降序显示
    public void showByFinalScore() {
      // 使用类里的比较
      dataPerson.getAllPersons().stream().sorted().forEach(System.out::println);
    }
  }
}
