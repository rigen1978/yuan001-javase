package com.yuan.continuedemo;

/**
 * @className: ContinueDemo
 * @package: com.yuan.continuedemo
 * @description:
 * @author: liyuan
 * @create: 2024/01/20 0:29
 * @version: 1.0
 */
public class ContinueDemo {
  public static void main(String[] args) {
    // continue命令
    // 現在の周回をスキップする – continue命令
    for (int i = 1; i < 10; i++) {
      if (i % 2 == 0) {
        continue;
      }
      System.out.print(i + "/");
    } // 結果：1/3/5/7/9/
  }
}
