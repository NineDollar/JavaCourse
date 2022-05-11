package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Guess {

  ArrayList<int[]> cands = new ArrayList<>();

  public static void main(String[] args) {
    new Guess().play(6);
  }

  Guess() {
    for (int i = 1; i <= 6; i++) {
      for (int j = 1; j <= 6; j++) {
        for (int k = 1; k <= 6; k++) {
          for (int m = 1; m <= 6; m++) {
            int[] a = {i, j, k, m};
            cands.add(a);
          }
        }
      }
    }
  }

  void play(int n) {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      int idx = rand.nextInt(cands.size());
      System.out.print((i + 1) + " " + Arrays.toString(cands.get(idx)) + " ");
      int rn = sc.nextInt();
      int rp = sc.nextInt();
      sieve(cands.get(idx), rn, rp);
      if (rp == 4) {
        break;
      }
    }
  }

  void sieve(int[] b, int rn, int rp) {
    ArrayList<int[]> remain = new ArrayList<>();
    for (int[] a : cands) {
      int[] r = test(a, b);
      if (r[0] == rn && r[1] == rp) {
        remain.add(a);
      }
    }
    cands = remain;
//System.out.println("remain "+cands.size());
  }

  static int[] test(int[] a, int[] b) {
    a = a.clone();
    b = b.clone();
    int rp = 0, rn = 0;
    for (int i = 0; i < 4; i++) {
      if (a[i] == b[i]) {
        rp++;
        a[i] = b[i] = 0;
      }
    }
    for (int x : b) {
      if (x == 0) {
        continue;
      }
      int idx = indexOf(a, x);
      if (idx >= 0) {
        rn++;
        a[idx] = 0;
      }
    }
    return new int[]{rn, rp};
  }

  static int indexOf(int[] a, int x) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == x) {
        return i;
      }
    }
    return -1;
  }
}