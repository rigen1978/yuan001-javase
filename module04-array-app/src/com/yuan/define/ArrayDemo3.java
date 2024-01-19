package com.yuan.define;

/**
 * @className: ArrayDemo3
 * @package: com.yuan.define
 * @description:
 * @author: liyuan
 * @create: 2024/01/20 0:49
 * @version: 1.0
 */
public class ArrayDemo3 {
  public static void main(String[] args) {
    // 要素とインデックスについて
    int[] arr = {12, 24, 36};
    // 0   1  2
    // 1、配列を宣言し、配列を作成したあと、配列の各要素は次のように表すことができます。
    // インデックスは 0 から始まり順番に要素に割り当てられます。
    // 例えば要素の数が 3 だった場合は、インデックスは先頭の要素から順に 0, 1, 2 と割り当てられます。
    // もし存在しないインデックスを指定して要素に値を代入した場合、コンパイル時にはエラーとはなりませんがプログラムを実行したときにエラーとなります。
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    // System.out.println(arr[3]); // エラー
    System.out.println("---------------------------------");

    // 2、配列のデータを変更
    arr[0] = 66;
    arr[2] = 88;
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    // 3、配列の長さを取得する(length)
    System.out.println(arr.length);

    System.out.println(arr.length - 1);

    int[] arr2 = {};
    System.out.println(arr2.length - 1);
  }
}
