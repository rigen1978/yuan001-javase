package com.yuan.operator;

/**
 * @className: OperatorDemo4
 * @package: com.yuan.operator
 * @description:
 * @author: liyuan
 * @create: 2024/01/18 0:42
 * @version: 1.0
 */
/*
関係演算子と等価演算子
  関係演算子は主に条件分岐や繰り返し処理の条件式で使用されるもので、演算子の左辺と右辺の値を比較して結果として true または flase の値を返します。
   2 つの値が等しい、または大きいか小さいかなどの比較を行うことができます。
 */
public class OperatorDemo4 {
  public static void main(String[] args) {
    int a = 10;
    int b = 5;
    boolean rs = a > b;
    System.out.println(rs);

    System.out.println(a >= b);
    System.out.println(2 >= 2);
    System.out.println(a <= b);
    System.out.println(a == b);

    System.out.println(false ^ true ^ false);
  }
}
