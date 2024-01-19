package com.yuan.define;

/**
 * @className: ArrayDemo2
 * @package: com.yuan.define
 * @description:
 * @author: liyuan
 * @create: 2024/01/20 0:48
 * @version: 1.0
 */
public class ArrayDemo2 {
  public static void main(String[] args) {
    // Java では配列の宣言を行う
    // 1、配列の宣言が終わりましたら、今度は配列そのものを作成します。
    // 変数の場合は宣言するだけで値を保管する場所が確保されますが、配列の場合は複数の値を管理するため、いくつの値を管理するのかを指定して配列を作成する必要があります。
    // 書式は次のとおりです。
    int[] ages = new int[] {12, 24, 36};
    double[] scores = new double[] {11.1, 22.2, 33.3};

    // 2、配列の宣言と配列の作成をまとめて次のように記述しても構いません。
    int[] ages2 = {12, 24, 22};

    int ages3[] = {12, 11, 22};
  }
}
