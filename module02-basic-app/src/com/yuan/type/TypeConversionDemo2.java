package com.yuan.type;

/**
 * @className: TypeConversionDemo2
 * @package: com.yuan.type
 * @description:
 * @author: liyuan
 * @create: 2024/01/18 1:59
 * @version: 1.0
 */
public class TypeConversionDemo2 {
  public static void main(String[] args) {
    // 型変換
    byte a = 10;
    int b = 20;
    long c = 30;
    long rs = a + b + c;
    System.out.println(rs);

    double rs2 = a + b + 1.0;
    System.out.println(rs2);

    byte i = 10;
    short j = 30;
    int rs3 = i + j;
    System.out.println(rs3);

    // test
    byte b1 = 110;
    byte b2 = 80;
    int b3 = b1 + b2;
    System.out.println(b3);
  }
}
