package com.company.learn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.junit.Test;

/**
 * <p>集合框架.</p>
 *
 * @author NineDollar
 * @version 1.0
 * @since 2022/5/8
 */
public class MyList {

  public static void main(String[] args) {

  }

  @Test
  public void testArrayList() {
    List<String> all = new ArrayList<String>();
    all.add("hello");
    all.add("_");
    all.add("world");
    all.removeIf("_"::equals);
    Iterator<String> it = all.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

  @Test
  public void testHashSet() {
    Set<String> allSet = new HashSet<String>();
    allSet.add("A");
    allSet.add("B");
    allSet.add("C");
    allSet.add("C");
    allSet.add("C");
    allSet.add("D");
    allSet.add("E");
    allSet.add("F");
    System.out.println(allSet);
  }

  @Test
  public void testHashMap() {
    Map map = new HashMap();
    map.put(1, "one");
    map.put(2, "two");
    map.put(3, "three");
    System.out.println(map);
  }

  @Test
  public void nameTreeSet() {
    //会自动排序
    TreeSet ts = new TreeSet();
    ts.add(1);
    ts.add(-1);
    ts.add(0);
    ts.add(2);
    System.out.println(ts);
  }
}
