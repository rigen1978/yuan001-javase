package com.yuan.javabean;

/**
 * @className: Student
 * @package: com.yuan.javabean
 * @description:
 * @author: liyuan
 * @create: 2024/01/22 11:23
 * @version: 1.0
 */
public class Student {
  // javabeanの特徴
  // 1、フィールドがあり，フィールドのget setメソッドを提供する
  private String name;
  private double score;

  // 2、からなず引数なしの空のコンストラクターがあり

  public Student() {}

  public Student(String name, double score) {
    this.name = name;
    this.score = score;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getScore() {
    return score;
  }

  public void setScore(double score) {
    this.score = score;
  }
}
