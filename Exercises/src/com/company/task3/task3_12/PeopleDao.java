package com.company.task3.task3_12;

import com.company.task3.task3_12.amateur.LoveDao;
import com.company.task3.task3_12.amateur.Research;

/**
 * <p>人类.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/10
 */
public abstract class PeopleDao extends Research {

  private String name;
  private String gender;
  private int age;
  private String address;

  public PeopleDao(String name, String subject, String name1, String gender, int age,
      String address) {
    super(name, subject);
    this.name = name1;
    this.gender = gender;
    this.age = age;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public String getGender() {
    return gender;
  }

  public int getAge() {
    return age;
  }

  public String getAddress() {
    return address;
  }
}
