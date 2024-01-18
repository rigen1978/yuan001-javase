package com.yuan.branch;

/**
 * @className: SwitchDemo2
 * @package: com.yuan.branch
 * @description:
 * @author: liyuan
 * @create: 2024/01/18 11:28
 * @version: 1.0
 */
public class SwitchDemo2 {
  public static void main(String[] args) {
    // 注意事項
    // 式で評価した値は整数型( char, byte, short, int )か
    // JDK５からENUM
    // JDK7からStirng 型か列挙型である必要があります。
    // double 型や整数型でも long 型の値となるような式は利用できません。

    int a = 10;
    double b = 0.1;
    double b2 = 0.2;
    double c = b + b2;
    System.out.println(c);

    switch (a) {
    }

    int i = 20;
    int d = 20;
    switch (i) {
      case 10:
        break;
      case 20:
        break;
    }

    // case のあとに記述するラベル名は定数式である必要があります。変数は指定できないのでご注意ください。

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
        // break;
      case "木曜日":
        System.out.println("htmlを勉強する");
        break;
      case "金曜日":
        System.out.println("mysqlを勉強する");
        // break;
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
