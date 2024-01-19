package com.yuan.breaktest;

/**
 * @className: BreakDemo
 * @package: com.yuan.breaktest
 * @description:
 * @author: liyuan
 * @create: 2024/01/19 12:23
 * @version: 1.0
 */
public class BreakDemo {
  public static void main(String[] args) {
    // break命令
    // ループを脱出する – break命令
    // breakは、現在のループを脱出するための命令です。
    // 一般的には、ifなどの条件分岐とセットで利用します。
    // たとえば以下は、変数valが5より大きくなったところで、ループを強制終了する例です。
    int val = 0;
    while (val < 10) {
      System.out.println(val + "/");
      val++;
      if (val > 5) {
        break;
      }
    }

    // ラベル構文を利用することで、入れ子になったループをまとめて脱出することもできます。
    // たとえば、以下のサンプルでは変数i、jの積が初めて50を超えたところで、ループを終了します。
    // ラベルは脱出したいループの先頭に付与します（この場合は「ext」）。
    OUT:
    for (int i = 1; i < 10; i++) {
      for (int j = 1; j < 10; j++) {
        if (i * j > 50) {
          break OUT;
        }
        System.out.print((i * j) + "/");
      }
      System.out.println();
    }
  }
}
