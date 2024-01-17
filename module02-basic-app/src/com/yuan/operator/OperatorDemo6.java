package com.yuan.operator;

/**
 * @className: OperatorDemo6
 * @package: com.yuan.operator
 * @description:
 * @author: liyuan
 * @create: 2024/01/18 0:51
 * @version: 1.0
 */
/*
条件演算子(三項演算子)
	条件演算子は 3 つの値を必要とする演算子で三項演算子とも呼ばれます。
	条件式の真偽に応じて二つの値を返すことができ、あたかも if 文のような処理を行うことができます
 */
public class OperatorDemo6 {
  public static void main(String[] args) {
    double score = 59.5;
    String rs = score >= 60 ? "合格" : "不合格";
    System.out.println(rs);

    // 例２
    int i = 10;
    int j = 45;
    int k = 34;

    int temp = i > j ? i : j;
    int max2 = temp > k ? temp : k;
    System.out.println(max2);
  }
}
