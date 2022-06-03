package com.company.task3.task3_12;

/**
 * <p>渤海大学生.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/10
 */
public final class BoHaiStudent extends Student {

  /**
   * @param name        小组名称
   * @param subject     科研课题
   * @param name1       姓名
   * @param gender      性别
   * @param age         年龄
   * @param address     家庭住址
   * @param schoolName  学校名字
   * @param id          学号
   * @param departments 系部
   * @param className   班级
   */
  public BoHaiStudent(String name, String subject, String name1, String gender, int age,
      String address, String schoolName, String id, String departments, String className) {
    super(name, subject, name1, gender, age, address, schoolName, id, departments, className);
  }

  @Override
  public String physical() {
    return "篮球";
  }

  @Override
  public String entertainment() {
    return "唱歌";
  }

  @Override
  public String otherLove() {
    return "韩剧";
  }

  @Override
  public String toString() {
    String[] header = {"姓名", "性别", "年龄", "家庭住址", "学校名字",
        "学号", "系部", "班级", "小组名称", "科研课题", "体育", "文艺", "其他爱好"
    };
    String[][] rows = {
        {
            super.getName(), super.getGender(), String.valueOf(super.getAge()), super.getAddress(),
            super.getSchoolName(), super.getId(), super.getDepartments(), super.getClassName(),
            super.getGroupName(), super.getSubject(), physical(), entertainment(), otherLove()
        }
    };
    return new TextTable(header, rows).toString();
  }
}
