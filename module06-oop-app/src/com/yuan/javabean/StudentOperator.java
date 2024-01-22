package com.yuan.javabean;

/**
 * @className: StudentOperator
 * @package: com.yuan.javabean
 * @description:
 * @author: liyuan
 * @create: 2024/01/22 11:22
 * @version: 1.0
 */
public class StudentOperator {
  private Student student;

  public StudentOperator(Student student) {
    this.student = student;
  }

  public void printPass() {
    if (student.getScore() >= 60) {
      System.out.println(student.getName() + "合格です");
    } else {
      System.out.println("不合格です");
    }
  }
}
