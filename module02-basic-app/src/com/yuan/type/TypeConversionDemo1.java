package com.yuan.type;

/**
 * @className: TypeConversionDemo1
 * @package: com.yuan.type
 * @description:
 * @author: liyuan
 * @create: 2024/01/18 1:52
 * @version: 1.0
 */
/*
キャスト演算子と型変換ルール
Java は変数に格納できる型が決まっていますが、数値型の場合には異なる型であっても代入できる場合があります。
またそのまま代入できない場合にもキャスト演算子と呼ばれる型を変換する演算子を使用することで代入できる場合っがあります。
 */
public class TypeConversionDemo1 {
  public static void main(String[] args) {
    // 型を変換する
    byte a = 12;
    int b = a; // 型を変換する
    System.out.println(a);
    System.out.println(b);

    int c = 100; // 4
    double d = c; // 8 型を変換する
    System.out.println(d);

    char ch = 'a'; // 'a' 97 => 00000000 01100001
    int i = ch; // 型を変換する =>  00000000 00000000  00000000 01100001
    System.out.println(i);
  }
}
