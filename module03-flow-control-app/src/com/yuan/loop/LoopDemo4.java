package com.yuan.loop;

/**
 * @className: LoopDemo4
 * @package: com.yuan.loop
 * @description:
 * @author: liyuan
 * @create: 2024/01/19 10:28
 * @version: 1.0
 */
public class LoopDemo4 {
  // do…while命令も、while命令と同じく、与えられた条件式がtrueである間、配下の処理を繰り返し実行します。
  // ただし、最初から条件式がfalseであった場合の挙動が異なります。
  // その場合、while命令は一度も処理を実行しないのに対して、do…while命令は一度はかならず処理を実行します。
  // while命令を前置判定、do…while命令を後置判定とも言います。
  public static void main(String[] args) {
    int i = 0;
    do {
      System.out.println("Hello World");
      i++;
    } while (i < 3);
  }
}
