package com.yuan.variable;

/**
 * @className: VariableDemo1 変数
 * @package: com.yuan.variable
 * @description:
 * @author: liyuan
 * @create: 2024/01/17 12:04
 * @version: 1.0
 */
/*
1. 利用できる文字はUnicode文字すべて（ただし、先頭に数字は利用できない）
2. 大文字／小文字は区別される
3. Javaの予約文字ではないこと
*/
public class VariableDemo1 {
  public static void main(String[] args) {
    // 変数は値を格納したり格納した値を参照したりして利用します。変数を宣言せずに変数に値を代入するとエラーとなります。
    int age = 23;
    System.out.println(age);

    // 変数型は、宣言時に決まるので、これに他の型の値を代入することはできません。
    // age = 23.5 //エラー

    // 初期値は省略不可
    int money;
    // System.out.println(money); //エラー

    // 複数の変数を列挙できない

    //
  }
}
