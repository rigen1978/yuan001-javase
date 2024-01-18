package com.yuan.branch;

/**
 * @className: SwitchDemo3
 * @package: com.yuan.branch
 * @description:
 * @author: liyuan
 * @create: 2024/01/18 11:28
 * @version: 1.0
 */
public class SwitchDemo3 {
  public static void main(String[] args) {
    // break 文は switch 文を強制的に終了させるために記述しているものなので、ラベル毎に実行する最後の処理として記述します。
    // 複数のラベルに対して同じ処理を行う
    // switch 文におけるラベルは、どこから処理を始めるのかの目印のようなものです。
    // ラベル毎に別々の処理を記述する必要はなく、複数のラベルを続けて記述することもできます。
    String week = "火曜日";
    switch (week) {
      case "月曜日":
        System.out.println("gitを勉強する");
        break;
      case "火曜日":
        System.out.println("mavenを勉強する");
        break;
      case "水曜日":
      case "木曜日":
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
