package com.yuan.arraylist;

import java.util.ArrayList;

/**
 * @className: ArrayListDemo1
 * @package: com.yuan.arraylist
 * @description:
 * @author: liyuan
 * @create: 2024/01/23 0:53
 * @version: 1.0
 */

/*
* ArrayListクラス 可変長配列を利用する – ArrayListクラス
* ArrayListは、内部的には配列を利用したリスト構造です。標準的な配列と異なる点は、サイズを後からでも変更できる点です。
* その性質上、インデックス値による値の読み書きは高速ですが、要素の挿入／削除は、配列サイズが大きくなるほど、 また、操作位置が先頭に近くなるほど遅くなります。
*
                         ArrayListクラスで利用できる主なメソッド
     メソッド	概要
     add([int index,] E e)	    -指定位置indexに要素eを挿入（index省略で末尾に挿入）
     clear()	                -リストからすべての要素を削除
     contains(Object e)	        -リストに要素oが含まれているかを判定
     get(int index)	            -index番目の要素を取得
     indexOf(Object e)	        -要素oが登場する最初のインデックス値を取得
     isEmpty()	                -リストが空か判定
     remove(int index｜Object o) -指定の要素を削除
     set(int index, E e)	    -index番目の要素を設定
     int size()	                -リストに含まれる要素の数を取得
*/
public class ArrayListDemo1 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();

    list.add("Windows");
    list.add("Linux");
    list.add("MacOs");
    // 2、指定位置indexに要素eを挿入（index省略で末尾に挿入）
    list.add("java");
    System.out.println(list);
    // 3、index番目の要素を取得
    String rs = list.get(1);
    System.out.println(rs);
    // 4、リストに含まれる要素の数を取得
    System.out.println(list.size());
    // 5、指定の要素を削除
    System.out.println(list.remove(1));
    // 6、指定の要素を削除
    System.out.println("Linux");
    // 7、index番目の要素を設定
    System.out.println(list.set(1, "Test"));
    System.out.println(list);
  }
}
