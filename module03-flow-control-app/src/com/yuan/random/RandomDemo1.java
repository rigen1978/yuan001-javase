package com.yuan.random;

import java.util.Random;

/**
 * @className: RandomDemo1
 * @package: com.yuan.random
 * @description:
 * @author: liyuan
 * @create: 2024/01/19 1:07
 * @version: 1.0
 */
public class RandomDemo1 {
  // Java で正数の乱数を生成するときは、Random クラスの nextInt() を使います。
  // ここでは、nextInt() の使い方について説明します。
  public static void main(String[] args) {
    // 1: nextInt() は 0 から引数に指定した値未満の整数を返します。
    Random r = new Random();
    for (int i = 1; i < 20; i++) {
      int data = r.nextInt(10);
      System.out.println(data);
    }

    // 2: 1から10乱数,aからb乱数
    // (b-a+1)+a
    System.out.println("-------------------------------");
    for (int i = 1; i < 20; i++) {
      int data2 = r.nextInt(10 - 1 + 1) + 1;
      System.out.println(data2);
    }
  }
}
