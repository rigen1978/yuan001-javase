package com.yuan.thisdemo;

/**
 * @className: Test
 * @package: com.yuan.thisdemo
 * @description:
 * @author: liyuan
 * @create: 2024/01/22 12:04
 * @version: 1.0
 */
public class Test {
  public static void main(String[] args) {

    Student s1 = new Student();
    System.out.println(s1);
    s1.test();

    Student s2 = new Student();
    System.out.println(s2);
    s2.test();

    System.out.println("----------------------------");

    Student s3 = new Student();
    s3.name = "播仔";
    s3.score = 2;
    s3.printPass(256);
  }
}
