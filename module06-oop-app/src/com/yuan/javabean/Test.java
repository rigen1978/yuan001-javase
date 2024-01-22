package com.yuan.javabean;

/**
 * @className: Test
 * @package: com.yuan.javabean
 * @description:
 * @author: liyuan
 * @create: 2024/01/22 11:22
 * @version: 1.0
 */
public class Test {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.setName("tanaka");
    s1.setScore(99);
    System.out.println(s1.getName());
    System.out.println(s1.getScore());

    StudentOperator operator = new StudentOperator(s1);
    operator.printPass();
  }
}
