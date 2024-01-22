package com.yuan.constructor;

/**
 * @className: Student
 * @package: com.yuan.constructor
 * @description:
 * @author: liyuan
 * @create: 2024/01/22 11:12
 * @version: 1.0
 */
public class Student {
  // デフォルトコンストラクター
  // コンストラクターが明示的に定義されなかった場合、Javaは引数なしの空のコンストラクターを暗黙的に生成します。
  // これをデフォルトコンストラクターと言います。
  String name;
  double score;

  public Student() {
    System.out.println("引数なしのコンストラクタ is running~~");
  }

  public Student(String name, double score) {
    this.name = name;
    this.score = score;
    System.out.println("引数ありのコンストラクタ is running~~");
  }
}
