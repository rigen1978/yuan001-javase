package com.yuan.literral;

/**
 * @className: LiteralDemo
 * @package: com.yuan.literral
 * @description:
 * @author: liyuan
 * @create: 2024/01/17 11:57
 * @version: 1.0
 */

/*
リテラル
	Java のけるリテラルとは文字や数値といった値そのもののことです。
	リテラルには文字リテラルや文字列リテラル、数値リテラルなどがあります。
*/
public class LiteralDemo {
  public static void main(String[] args) {
    // .整数リテラル
    System.out.println(666);
    System.out.println(10);

    // .浮動小数点数リテラル
    System.out.println(3.14);
    // .文字リテラルと文字コード
    System.out.println('a');
    System.out.println('日');
    System.out.println('0');
    // .エスケープシーケンスを使った特殊な文字の表現
    System.out.println('\n'); // 改行
    System.out.println('\t'); // tab
    // .文字列リテラル
    System.out.println("");
    System.out.println("   ");
    System.out.println("javaの入門");

    // .論理値リテラル
    System.out.println(true);
    System.out.println(false);
  }
}
