package com.yuan.overload;

/**
 * @className: OverLoadDemo
 * @package: com.yuan.overload
 * @description:
 * @author: liyuan
 * @create: 2024/01/20 11:54
 * @version: 1.0
 */
public class OverLoadDemo {
  public static void main(String[] args) {
    // メソッドのオーバーロード
    // 広告
    // メソッドを引数を付けて呼び出す時、引数に記述する値のデータ型はメソッドで決められたものしか指定できません。
    // その為、同じような機能を持つメソッドであっても引数のデータ型が異なれば別々のメソッドを用意する必要があります。
    int n = plusInt(10, 7);
    System.out.println(n);

    double d = plusDouble(3.14, 7.4);
    System.out.println(d);
  }

  private static int plusInt(int n1, int n2) {
    return n1 + n2;
  }

  private static double plusDouble(double d1, double d2) {
    return d1 + d2;
  }

  // 引数の数が異なっている場合:
  private static void test(int n1) {
    // ...
  }

  private static void test(int n1, int n2) {
    // ...
  }

  // 引数の種類が異なっている場合:
  private static void test1(int n1) {
    // ...
  }

  private static void test1(double d1) {
    // ...
  }

  // 引数のデータ型と数は同じでも順番が異なっている場合:
  private static void test2(int n1, double d1) {
    // ...
  }

  private static void test2(double d1, int n1) {
    // ...
  }

  // オーバーロードができない場合
  // 引数の変数名だけが異なっている場合:
  //   private static void test3(int a){
  //     // ...
  //   }
  //
  // private static void test3(int b){
  //   // ...
  // }

  // 戻り値だけが異なっている場合:
  // private static void test4(int n){
  //   // ...
  // }
  //
  // private static int test4(int n){
  //   // return n;
  // }

}
