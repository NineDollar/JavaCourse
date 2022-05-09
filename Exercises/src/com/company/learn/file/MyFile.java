package com.company.learn.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import org.junit.Test;

/**
 * <p>文件操作.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/9
 */
public class MyFile {

  public static void main(String[] args) {
    File f1 = new File(
        "C:\\Users\\16896\\IdeaProjects\\JavaCourse\\Exercises\\src\\com\\company\\learn\\file",
        "test.txt");
    File f2 = new File(
        "C:\\Users\\16896\\IdeaProjects\\JavaCourse\\Exercises\\src\\com\\company\\learn\\file");
    System.out.println(f1.getName() + "可读吗" + f1.canRead());
    System.out.println(f1.getName() + "的长度" + f1.length());
    System.out.println(f1.getName() + "绝对路径：" + f1.getAbsolutePath());
    System.out.println(f2.getName() + "是目录吗？" + f2.isDirectory());

  }

  /**
   * 遍历指定的拓展名文件.
   */
  class FileAccept implements FilenameFilter {

    private String extendName;

    public void setExtendName(String extendName) {
      this.extendName = "." + extendName;
    }

    @Override
    public boolean accept(File dir, String name) {
      return name.endsWith(extendName);
    }
  }

  /**
   * 遍历指定的拓展名文件.
   */
  @Test
  public void testFile() {
    File dir = new File(
        "C:\\Users\\16896\\IdeaProjects\\JavaCourse\\Exercises\\src\\com\\company\\learn\\file");
    FileAccept fileAccept = new FileAccept();
    fileAccept.setExtendName("txt");
    String[] fileName = dir.list(fileAccept);
    for (String name : fileName) {
      System.out.println(name);
    }
  }

  /**
   * 不懂.
   */
  @Test
  public void nameRuntime() {
    Runtime ce = Runtime.getRuntime();
    File file = new File("C:/Program Files/JetBrains/IntelliJ IDEA 2021.3.2/bin",
        "idea64.exe");
    try {
      ce.exec(file.getAbsolutePath());
    } catch (IOException e) {
      System.out.println(e);
    }
  }

  /**
   * 第一种文件读取.
   */
  @Test
  public void testReadFile1() {
    int b;
    byte[] tom = new byte[18];
    File f = new File("src/com/company/learn/file/test.txt");
    try {
      FileInputStream in = new FileInputStream(f);
      while ((b = in.read(tom, 0, 18)) != -1) {
        String s = new String(tom, 0, b);
        System.out.println(s);
      }
      in.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * 第二种文件读取.
   */
  @Test
  public void testReadFile2() {
    try {
      File f = new File("src/com/company/learn/file/test.txt");
      FileInputStream in = new FileInputStream(f);
      byte[] tom = new byte[in.available()];
      in.read(tom);
      String s = new String(tom);
      System.out.println(s);
      in.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testWriteFile() {
    byte[] tom = "你好，近来忙吗？".getBytes();
    try {
      FileOutputStream out = new FileOutputStream("src/com/company/learn/file/test.txt");
      out.write(tom);
      out.write(tom, 0, tom.length);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void test() {
    File file = new File("src/com/company/learn/file/student.txt");
    String[] content = {"天气预报:", "北京晴", "上海多云,有小雨", "大连晴,有时多云"};
    try {
      FileWriter outOne = new FileWriter(file);
      BufferedWriter outTwo = new BufferedWriter(outOne);
      for (String str : content) {
        outTwo.write(str);
        outTwo.newLine();
      }
      outTwo.close();
      outOne.close();
      FileReader inOne = new FileReader(file);
      BufferedReader inTwo = new BufferedReader(inOne);
      String s = null;
      while ((s = inTwo.readLine()) != null) {
        System.out.println(s);
      }
      inOne.close();
      inTwo.close();
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
