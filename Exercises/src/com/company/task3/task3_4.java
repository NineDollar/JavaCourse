package com.company.task3;

/**
 * <p>.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/9
 */
public class task3_4 {

  public static void main(String[] args) {
    System.out.println(new Pupil("李一"));
    System.out.println(new MiddleSchoolStudent("王二"));
    System.out.println(new FirstYearOfUniversity("张三"));
    System.out.println(new SecondYearOfUniversity("李四"));
    System.out.println(new CollegeIsInTheThirdYear("王五"));
    System.out.println(new TheUniversityIsInTheFourthYear("赵六"));
    System.out.println(new MasterStudent("陈七"));
    System.out.println(new DocterStudent("宋八"));
  }

  /**
   * 学生类.
   */
  static class Student {

    private String name;

    public Student(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }
  }

  /**
   * 小学生.
   */
  static class Pupil extends Student {

    private final String stage = "小学生";

    public Pupil(String name) {
      super(name);
    }

    @Override
    public String toString() {
      return super.getName() + "是" + stage;
    }
  }

  /**
   * 中学生.
   */
  static class MiddleSchoolStudent extends Student {

    private final String stage = "中学生";

    public MiddleSchoolStudent(String name) {
      super(name);
    }

    @Override
    public String toString() {
      return super.getName() + "是" + stage;
    }
  }

  /**
   * 大学生.
   */
  static class Undergraduate extends Student {

    private final String stage = "大学生";

    public Undergraduate(String name) {
      super(name);
    }
  }

  static class FirstYearOfUniversity extends Undergraduate {

    private final String year = "一年级";

    public FirstYearOfUniversity(String name) {
      super(name);
    }

    @Override
    public String toString() {
      return super.getName() + "是" + super.stage + year;
    }
  }

  static class SecondYearOfUniversity extends Undergraduate {

    private final String year = "二年级";

    public SecondYearOfUniversity(String name) {
      super(name);
    }

    @Override
    public String toString() {
      return super.getName() + "是" + super.stage + year;
    }
  }

  static class CollegeIsInTheThirdYear extends Undergraduate {

    private final String year = "三年级";

    public CollegeIsInTheThirdYear(String name) {
      super(name);
    }

    @Override
    public String toString() {
      return super.getName() + "是" + super.stage + year;
    }
  }

  static class TheUniversityIsInTheFourthYear extends Undergraduate {

    private final String year = "四年级";

    public TheUniversityIsInTheFourthYear(String name) {
      super(name);
    }

    @Override
    public String toString() {
      return super.getName() + "是" + super.stage + year;
    }
  }

  /**
   * 研究生.
   */
  static class GradateStudent extends Student {

    private final String stage = "研究生";

    public GradateStudent(String name) {
      super(name);
    }
  }

  static class MasterStudent extends GradateStudent {

    private final String type = "硕士";

    public MasterStudent(String name) {
      super(name);
    }

    @Override
    public String toString() {
      return super.getName() + "是" + type + super.stage;
    }
  }

  static class DocterStudent extends GradateStudent {

    private final String type = "博士";

    public DocterStudent(String name) {
      super(name);
    }

    @Override
    public String toString() {
      return super.getName() + "是" + type + super.stage;
    }
  }
}
