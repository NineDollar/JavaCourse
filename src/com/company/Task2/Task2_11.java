package com.company.Task2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @ClassName Task2_11
 * @Author NineDollar
 * @Date 2022/4/4 19:24
 * @Version 1.0
 * @Description TODO
 */
public class Task2_11 {
    public static void main(String[] args) {
        String id = null;
        DataPerson dataPerson = new DataPerson();
        System.out.println("请输入选手信息: ");
        Scanner scanner = new Scanner(System.in);
        id = scanner.next();
        while (!"ok".equals(id)) {
            Person person = new Person();
            double[] score = new double[10];
            person.setId(id);
            person.setName(scanner.next());
            for (int i = 0; i < 10; i++) {
                score[i] = scanner.nextDouble();
            }
            person.setScore(score);
            dataPerson.add(person);
            id = scanner.next();
        }
        System.out.println(dataPerson);
        ScoreFinal scoreFinal = new ScoreFinal(dataPerson);
        scoreFinal.setScore();
        ShowScore scoreShow = new ShowScore(dataPerson);
        System.out.println("按选手编号顺序: ");
        scoreShow.showById();
        System.out.println("按选手分数顺序: ");
        scoreShow.showByScore();
    }

    //    选手对象
    static class Person {
        private String id;
        private String name;
        private double[] score;
        private double scoreFinal;

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

        public double getScoreFinal() {
            return scoreFinal;
        }

        public void setScoreFinal(double scoreFinal) {
            this.scoreFinal = scoreFinal;
        }

        @Override
        public String toString() {
            return String.format("编号: %s, 姓名: %s, 成绩: %.1f", id, name, scoreFinal);
        }
    }

    //        检录对象
    static class DataPerson {
        List<Person> personsList = new ArrayList<>();

        public void add(Person person) {
            personsList.add(person);
        }

        public void remove(Person person) {
            personsList.removeIf(x -> x == person);
        }

        public List<Person> getPersonsList() {
            return personsList;
        }
    }

    //   评分统计对象
    static class ScoreFinal {

        DataPerson dataPerson;

        public ScoreFinal(DataPerson dataPerson) {
            this.dataPerson = dataPerson;
        }

        public void setScore() {
            for (Person person : dataPerson.getPersonsList()) {
                double[] score = person.getScore();
                List<Double> scoreList =
                        Arrays.stream(score).boxed().collect(Collectors.toList());
                scoreList.removeIf(x -> x.equals(Collections.max(scoreList)));
                scoreList.removeIf(x -> x.equals(Collections.min(scoreList)));
                person.setScoreFinal(scoreList.stream().collect(Collectors.averagingDouble(Double::doubleValue)));
            }
        }
    }

    static class ShowScore {
        DataPerson dataPerson;

        public ShowScore(DataPerson dataPerson) {
            this.dataPerson = dataPerson;
        }

        public void showById() {
            dataPerson.getPersonsList().stream().sorted(Comparator.comparing(Person::getId)).forEach(System.out::println);
        }

        public void showByScore() {
            dataPerson.getPersonsList().stream().sorted(Comparator.comparing(Person::getScoreFinal).reversed())
                    .forEach(System.out::println);
        }
    }
}
