package com.yuan.operator;

import javax.swing.*;

/**
 * @className: OperatorDemo2
 * @package: com.yuan.operator
 * @description:
 * @author: liyuan
 * @create: 2024/01/18 0:40
 * @version: 1.0
 */

/*
インクリメント演算子とデクリメント演算子
  インクリメント演算子とデクリメント演算子はそれぞれ演算の対象が 1 つの単項演算子です。
  インクリメント演算子は対象の値を 1 つ増やし、デクリメント演算子は対象の値を 1 つ減らします。

*/
public class OperatorDemo2 {
  public static void main(String[] args) {
    int a = 10;
    ++a;
    System.out.println(a);

    --a;
    System.out.println(a);

    System.out.println("-------------------------------------------------");
    int i = 10;
    int rs = ++i;
    System.out.println(rs);
    System.out.println(i);

    int j = 10;
    int rs2 = j++;
    System.out.println(rs2);
    System.out.println(j);
    System.out.println("-------------------------------------------------");

    // 練習
    int c = 10;
    int d = 5;
    // c 10 11 12 11
    // d 5  4  5
    //        10  + 12  -  4  -  5  + 1 + 12
    int rs3 = c++ + ++c - --d - ++d + 1 + c--;
    System.out.println(rs3); // 26
    System.out.println(c); // 11
    System.out.println(d); // 5
  }
}
