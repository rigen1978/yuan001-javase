package com.yuan.quickstart;

/**
 * @className: Test
 * @package: com.yuan.quickstart
 * @description:
 * @author: liyuan
 * @create: 2024/01/21 15:45
 * @version: 1.0
 */
public class Test {
  /*
   Java はオブジェクト指向と呼ばれるプログラミング方法を行う言語のひとつです。
   オブジェクト指向では何か特定の役割を果たすモノ(＝オブジェクト)を作成し、
   そのオブジェクトに対して実行する処理を指示する形でプログラミングを行います。
  */
  public static void main(String[] args) {
    // オブジェクト指向快速入門
    Student s1 = new Student();
    s1.name = "田中";
    s1.score = 88.8;

    System.out.println(s1.name);
    s1.printScore();
  }
}
