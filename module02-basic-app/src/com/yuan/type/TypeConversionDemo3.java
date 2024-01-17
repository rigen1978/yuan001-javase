package com.yuan.type;

/**
 * @className: TypeConversionDemo3
 * @package: com.yuan.type
 * @description:
 * @author: liyuan
 * @create: 2024/01/18 2:00
 * @version: 1.0
 */
public class TypeConversionDemo3 {
  public static void main(String[] args) {
    // キャスト演算子
    int a = 20;
    byte b = (byte) a; // ALT + ENTER
    System.out.println(a);
    System.out.println(b);

    int i = 1500;
    byte j = (byte) i;
    System.out.println(j);

    double d = 99.5;
    int m = (int) d; // キャスト演算子
    System.out.println(m);
  }
}
