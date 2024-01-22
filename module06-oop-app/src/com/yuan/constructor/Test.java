package com.yuan.constructor;

/**
 * @className: Test
 * @package: com.yuan.constructor
 * @description:
 * @author: liyuan
 * @create: 2024/01/22 11:12
 * @version: 1.0
 */
public class Test {
  public static void main(String[] args) {
    // コンストラクタとは
    // コンストラクタとは、クラスからオブジェクトを作成した際に、自動的に実行されるメソッドのことで、メンバ変数の初期化などの主に行います。
    Student s = new Student();
    Student s1 = new Student("tanaka", 88);

    System.out.println(s1.name);
    System.out.println(s1.score);

    Teacher t = new Teacher();
  }
}
