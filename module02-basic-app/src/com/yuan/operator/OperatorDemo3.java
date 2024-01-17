package com.yuan.operator;

/**
 * @className: OperatorDemo3
 * @package: com.yuan.operator
 * @description:
 * @author: liyuan
 * @create: 2024/01/18 0:41
 * @version: 1.0
 */
/*
代入演算子の使い方
	変数に対して値や他の変数を代入するときに使用するのが代入演算子です。
	演算子	使用例	意味
	+=	A += B	A = A + B と同じ
	-=	A -= B	A = A - B と同じ
	*=	A *= B	A = A * B と同じ
	/=	A /= B	A = A / B と同じ
	%=	A %= B	A = A % B と同じ
	&=	A &= B	A = A & B と同じ
	|=	A |= B	A = A | B と同じ
	^=	A ^= B	A = A ^ B と同じ
	<<=	A <<= B	A = A << B と同じ
	>>=	A >>= B	A = A >> B と同じ
	>>>=	A >>>= B	A = A >>> B と同じ
 */
public class OperatorDemo3 {
  public static void main(String[] args) {
    // 右辺の値を左辺に代入
    int i = 1 + 2; // 3
    System.out.println(i);
    // 右辺の値を加算した結果を代入
    i += 5;
    System.out.println(i);
    // 右辺の値を減算した結果を代入
    i -= 5;
    // 右辺の値を乗算した結果を代入
    i *= 5;
    // 右辺の値で除算した結果を代入
    i /= 5;
    // 右辺の値で除算した余りを代入
    i %= 5;
    // 右辺の値で論理積演算した結果を代入
    i &= 5;
    // 右辺の値で論理和演算した結果を代入
    i |= 5;
    // 右辺の値で排他的論理和演算した結果を代入
    i ^= 5;
    // 右辺の値だけ左シフトした結果を代入
    i <<= 5;
    // 右辺の値だけ右シフトした結果を代入
    i >>= 5;
    // 右辺の値だけ右シフトした結果を代入
    i >>>= 5;
  }
}
