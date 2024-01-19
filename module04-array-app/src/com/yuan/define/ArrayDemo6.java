package com.yuan.define;

import java.util.Scanner;

/**
 * @className: ArrayDemo6
 * @package: com.yuan.define
 * @description:
 * @author: liyuan
 * @create: 2024/01/20 1:18
 * @version: 1.0
 */
public class ArrayDemo6 {
  public static void main(String[] args) {
    // 練習 配列のすべての要素の値の加算
    double[] scores = new double[6];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < scores.length; i++) {
      System.out.println("第" + (i + 1) + "の成績： ");
      double score = sc.nextDouble();
      scores[i] = score;
    }

    double sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    System.out.println("平均成績： " + sum / scores.length);
  }
}
