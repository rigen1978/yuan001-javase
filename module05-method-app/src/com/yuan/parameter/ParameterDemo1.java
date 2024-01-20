package com.yuan.parameter;

/**
 * @className: ParameterDemo1
 * @package: com.yuan.parameter
 * @description:
 * @author: liyuan
 * @create: 2024/01/20 10:49
 * @version: 1.0
 */
public class ParameterDemo1 {
  public static void main(String[] args) {
    // 引数
    // メソッドに対して呼び出し元から渡せるパラメーター情報のことを引数と言います。引数は「データ型 仮引数名」の形式で指定します。
    int a = 10;
    change(a);
    // また、型名のうしろに「…」を付与することで、可変長引数を表すこともできます。
    // 可変長引数とは、呼び出し側で自由に引数の数を変えられる引数のことです。
    System.out.println("合計は： " + sum(11.1, 22.2, 33.3));
  }

  private static void change(int a) {
    System.out.println("change1： " + a);
    a = 20;
    System.out.println("change2： " + a);
  }

  // 可変長引数
  private static double sum(double... values) {
    double rs = 0;
    for (double value : values) {
      rs += value;
    }
    return rs;
  }
}
