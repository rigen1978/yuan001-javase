package com.yuan.operator;

import javax.swing.*;

/**
 * @className: OperatorDemo1
 * @package: com.yuan.operator
 * @description:
 * @author: liyuan
 * @create: 2024/01/18 0:37
 * @version: 1.0
 */

/*
演算子
	演算子（オペレーター）とは、与えられた変数やリテラルに対して演算を行うための記号のことです。
	演算子によって処理される対象のことを被演算子（オペレーター）と言います。
	（1）算術演算子、
		算術演算子
		算術演算子は加算、減算、乗算、除算などの四則演算を行う演算子です。
		ここでは Java で用意されている算術演算子の種類と使い方について解説します。
		+	A + B	AにBを加える
		-	A - B	AからBを引く
		*	A * B	AにBを掛ける
		/	A / B	AをBで割る
		%	A % B	AをBで割った余り
 */
public class OperatorDemo1 {
  public static void main(String[] args) {
    // それぞれの演算子の使い方は次の通りです
    int a = 10;
    int b = 2;
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);

    int i = 5;
    int j = 2;
    System.out.println(1.0 * i / j);
    System.out.println(a % b); // 0
    System.out.println(3 % 2); // 1
    System.out.println("---------------------------------------------------");

    // 文字列の連結(+演算子)
    int a2 = 5;
    System.out.println("abc" + a2); // "abc5"
    System.out.println(a2 + 5);
    System.out.println("java" + a2 + 'a');
    System.out.println(a2 + 'a' + "mysql");
  }
}
