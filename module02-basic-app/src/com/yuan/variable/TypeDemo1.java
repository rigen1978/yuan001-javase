package com.yuan.variable;

/**
 * @className: TypeDemo1
 * @package: com.yuan.variable
 * @description:
 * @author: liyuan
 * @create: 2024/01/18 1:45
 * @version: 1.0
 */
/*
1:
	基本型と参照型
	Java のデータ型にはここまで解説した基本型とは別に参照型と呼ばれるデータ型があります。
	参照型のデータ型には配列やクラス、文字列を扱う String 型などが基本型ではないデータ型はすべて参照型となります。
2:
	基本型の変数には値そのものが格納される
	参照型の変数には配列の本体やクラスのインスタンスが保管されている場所を表すアドレスが格納されます。


	データ型		値
	boolean		true or false 論理型のデータ型
	char		16ビットUnicode文字 \u0000～\uFFFF 文字のデータ型
	byte		8ビット整数 -128～127
	short		16ビット整数 -32,768～32,767
	int			32ビット整数 -2,147,483,648～2,147,483,647
	long		64ビット整数 -9,223,372,036,854,775,808～9,223,372,036,854,775,807
	float		32ビット単精度浮動小数点数
	double		64ビット倍精度浮動小数点数
*/
public class TypeDemo1 {
  public static void main(String[] args) {
    byte number = 98;
    System.out.println(number);
    // short
    short number2 = 9000;
    // int
    int number3 = 12323232; //
    // long
    long number4 = 73642422442424L;

    // char
    char ch1 = 'a';

    boolean b1 = true;
    boolean b2 = false;

    // String.
    // String代表的是字符串类型，定义的变量可以用来记住字符串。
    String name = "java";
    System.out.println(name);
  }
}
