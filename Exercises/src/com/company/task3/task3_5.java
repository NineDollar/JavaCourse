package com.company.task3;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/10
 */
public class task3_5 {

  public static void main(String[] args) {
    BillySystem billySystem = new BillySystem("Java州立大学", "张三",
        new Date(System.currentTimeMillis()), 0, 20);
    System.out.println(billySystem);
  }

  /**
   * 账单属性.
   */
  static class Billy {

    private String schoolName;
    private String studentName;
    private Date useTimeForCar;
    private static int billyTotal;

    public Billy(String schoolName, String studentName, Date useTimeForCar) {
      this.schoolName = schoolName;
      this.studentName = studentName;
      this.useTimeForCar = useTimeForCar;
      billyTotal++;
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

    public Date getUseTimeForCar() {
      return useTimeForCar;
    }

    public void setUseTimeForCar(Date useTimeForCar) {
      this.useTimeForCar = useTimeForCar;
    }

    @Override
    public String toString() {
      SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 EEE HH:mm:ss");
      String date = format.format(useTimeForCar);
      return "学校：" + schoolName + "\n姓名：" + studentName + "\n使用卡使用时间:" + date + "\n第"
          + billyTotal + "张账单";
    }
  }

  static class BillySystem extends Billy {

    private static final int in = 75;
    private static final int out = 75;
    private int inOrOut;
    private int credit;
    private int money;

    public BillySystem(String schoolName, String studentName, Date useTimeForCar, int inOrOut,
        int credit) {
      super(schoolName, studentName, useTimeForCar);
      this.inOrOut = inOrOut;
      this.credit = credit;
      money = inOrOut >= 0 ? credit * in : credit * out;
    }

    @Override
    public String toString() {
      System.out.println(super.toString());
      String inOrOut = this.inOrOut >= 0 ? "州内" : "州外";
      return inOrOut + "学生" + credit + "学时" + money + "元";
    }
  }
}
