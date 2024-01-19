package com.yuan.define;

/**
 * @className: ArrayDemo1
 * @package: com.yuan.define
 * @description:
 * @author: liyuan
 * @create: 2024/01/20 0:48
 * @version: 1.0
 */
public class ArrayDemo1 {
  public static void main(String[] args) {
    // 配列は、複数の値をまとめて扱うためのしくみです。
    // たとえば以下は、int型の配列（要素数は5個）を作成する例です。配列を表すにはは、型名の後ろに「[]」を付与します。
    int[] arr = new int[5];
    System.out.println(arr);
    System.out.println(arr[1]);
    // 配列の要素にアクセスするには、ブラケット構文（[…]）で要素の番号（インデックス）を指定します。
    // 要素のインデックスは0からスタートします。よって、要素数が5個の配列では、インデックス0～4で要素にアクセスできます。
    arr[0] = 55;
    System.out.println(arr[0]);
  }
}
