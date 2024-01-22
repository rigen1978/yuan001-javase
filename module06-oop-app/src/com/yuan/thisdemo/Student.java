package com.yuan.thisdemo;

/**
 * @className: Student
 * @package: com.yuan.thisdemo
 * @description:
 * @author: liyuan
 * @create: 2024/01/22 12:04
 * @version: 1.0
 */
public class Student {
  String name;
  double score;

  public void test(Student this) {
    System.out.println(this);
  }

  public void printPass(double score) {
    if (this.score >= score) {
      System.out.println("おめでとうございます~~");
    } else {
      System.out.println("残念~~");
    }
  }
}
