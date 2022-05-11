package com.company.task3.task3_12.amateur;

/**
 * <p>研究类.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022 /5/10
 */
public class Research  {

  private String groupName;
  private String subject;

  /**
   * @param name    小组名称
   * @param subject 科研课题
   */
  public Research(String name, String subject) {
    this.groupName = name;
    this.subject = subject;
  }


  /**
   * Gets name.
   *
   * @return the name
   */
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  /**
   * Gets subject.
   *
   * @return the subject
   */
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }
}
