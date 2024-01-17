package com.yuan.variable;

/**
 * @className: ASCIIDemo1
 * @package: com.yuan.variable
 * @description:
 * @author: liyuan
 * @create: 2024/01/18 1:48
 * @version: 1.0
 */
public class ASCIIDemo1 {
  public static void main(String[] args) {
    // ASCII
    System.out.println('a' + 10); // 97 + 10 = 107
    System.out.println('A' + 10); // 65 + 10 = 75
    System.out.println('0' + 10); // 48 + 10 = 58

    //
    int a1 = 0B01100001;
    System.out.println(a1);

    int a2 = 0141;
    System.out.println(a2);

    int a3 = 0XFA;
    System.out.println(a3);
  }
}
