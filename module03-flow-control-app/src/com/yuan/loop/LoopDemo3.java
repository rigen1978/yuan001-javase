package com.yuan.loop;

/**
 * @className: LoopDemo3
 * @package: com.yuan.loop
 * @description:
 * @author: liyuan
 * @create: 2024/01/19 10:26
 * @version: 1.0
 */
public class LoopDemo3 {
  // while命令は、与えられた条件式がtrueである間、配下の処理を繰り返し実行します。
  // たとえば以下は、変数valが5未満である間、メッセージを表示する例です。
  public static void main(String[] args) {
    int i = 0;
    while (i < 5) {
      System.out.println("Hello World");
      i++;
    }
  }
}
