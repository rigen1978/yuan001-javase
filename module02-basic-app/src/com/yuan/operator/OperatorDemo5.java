package com.yuan.operator;

/**
 * @className: OperatorDemo5
 * @package: com.yuan.operator
 * @description:
 * @author: liyuan
 * @create: 2024/01/18 0:49
 * @version: 1.0
 */
/*
関係演算子の使い方
関係演算子は演算子の左辺と右辺を比較して true または false を返します。 2 つの値をどのように比較するかによって、次のような関係演算子が用意されています。

	演算子	使用例	意味
	<	    A < B	AはBより小さい
	<=	    A <= B	AはBより小さいか等しい
	>	    A > B	AはBより大きい
	>=	    A > B	AはBより大きいか等しい
	==	    A == B	AとBは等しい
	!=	    A != B	AはBは等しくない
 */
public class OperatorDemo5 {
  public static void main(String[] args) {
    double size = 6.8;
    int storage = 16;

    boolean rs = size >= 6.95 | storage >= 8;
    System.out.println(rs);

    // !
    System.out.println(!true);
    System.out.println(!false);
    System.out.println(!(2 > 1));
  }
}
