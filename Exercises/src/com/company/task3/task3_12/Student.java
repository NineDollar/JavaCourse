package com.company.task3.task3_12;

import com.company.task3.task3_12.amateur.LoveDao;

/**
 * <p>学生类.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/10
 */
public abstract class Student extends PeopleDao implements LoveDao {

  private String schoolName;
  private String id;
  private String departments;
  private String className;

  public Student(String name, String subject, String name1, String gender, int age,
      String address, String schoolName, String id, String departments, String className) {
    super(name, subject, name1, gender, age, address);
    this.schoolName = schoolName;
    this.id = id;
    this.departments = departments;
    this.className = className;
  }

  public String getSchoolName() {
    return schoolName;
  }

  public String getId() {
    return id;
  }

  public String getDepartments() {
    return departments;
  }

  public String getClassName() {
    return className;
  }
}
