package com.yuan.branch;

/**
 * @className: SwitchDemo1
 * @package: com.yuan.branch
 * @description:
 * @author: liyuan
 * @create: 2024/01/18 11:27
 * @version: 1.0
 */
/*
switch文を使った条件分岐
	Java で条件分岐を行う時に利用できる switch 文の使い方について解説します。
	switch 文は対象の式を評価した値を、複数の値の候補と比較して一致するラベルの位置へ処理を移すために使います。
	if 文でも同じことが可能ですが、対象の値を数多くの値の候補と比較したい場合に簡潔に記述できます。
*/
public class SwitchDemo1 {
  public static void main(String[] args) {
    String week = "火曜日";
    switch (week) {
      case "月曜日":
        System.out.println("gitを勉強する");
        break;
      case "火曜日":
        System.out.println("mavenを勉強する");
        break;
      case "水曜日":
        System.out.println("springを勉強する");
        break;
      case "木曜日":
        System.out.println("htmlを勉強する");
        break;
      case "金曜日":
        System.out.println("mysqlを勉強する");
        break;
      case "土曜日":
        System.out.println("javaを勉強する");
        break;
      case "日曜日":
        System.out.println("phpを勉強する");
        break;
      default:
        System.out.println("入力エラー");
    }
  }
}
