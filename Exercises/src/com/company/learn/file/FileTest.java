package com.company.learn.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import org.junit.Test;

/**
 * <p>.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/31
 */
public class FileTest {

  @Test
  public void copyFileTest() {
    String str;
    File inFile = new File(
        "C:\\Users\\16896\\IdeaProjects\\JavaCourse\\Exercises\\src\\com\\company\\learn\\file\\test.txt");
    File toFile = new File(
        "C:\\Users\\16896\\IdeaProjects\\JavaCourse\\Exercises\\src\\com\\company\\learn\\file\\test1.txt");
    try {
      if (!toFile.createNewFile()) {
        System.out.println("创建文件失败");
      }
      FileReader reader = new FileReader(inFile);
      FileWriter writer = new FileWriter(toFile);
      BufferedReader buffRead = new BufferedReader(reader);
      BufferedWriter buffWriter = new BufferedWriter(writer);
      while ((str = buffRead.readLine()) != null) {
        buffWriter.write(str);
      }
      reader.close();
      buffRead.close();
      buffWriter.close();
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void copyImageTest() {
    File inFile = new File(
        "C:\\Users\\16896\\IdeaProjects\\JavaCourse\\Exercises\\src\\com\\company\\learn\\file\\test.txt");
    File toFile = new File(
        "C:\\Users\\16896\\IdeaProjects\\JavaCourse\\Exercises\\src\\com\\company\\learn\\file\\test1.txt");
    try {
      if (!toFile.createNewFile()) {
        System.out.println("创建文件失败");
      }
      FileInputStream in = new FileInputStream(inFile);
      FileOutputStream out = new FileOutputStream(toFile);
      byte[] b = new byte[1024];
      int len;
      while ((len = in.read(b)) != -1) {
        out.write(b, 0, len);
      }
      out.flush();
      in.close();
      out.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
