package com.yuan.arraylist;

import java.util.ArrayList;

/**
 * @className: ArrayListDemo2
 * @package: com.yuan.arraylist
 * @description:
 * @author: liyuan
 * @create: 2024/01/23 0:53
 * @version: 1.0
 */
public class ArrayListDemo2 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("Windows");
    list.add("Windows7");
    list.add("Linux");
    list.add("Windows11");
    list.add("Windows110");
    list.add("macOS");
    System.out.println(list);

    // 指定要素を削除する,この削除方法は違う結果を出てしまう。
    // for (int i = 0; i < list.size(); i++) {
    //   String ele = list.get(i);
    //   if (ele.contains("Windows")) {
    //     list.remove(ele);
    //   }
    // }
    // System.out.println(list);

    // 1
    // for (int i = 0; i < list.size(); i++) {
    //   String ele = list.get(i);
    //   if (ele.contains("Windows")) {
    //     list.remove(ele);
    //     i--;
    //   }
    // }
    // System.out.println(list);

    // 2
    for (int i = list.size() - 1; i >= 0; i--) {
      String ele = list.get(i);
      if (ele.contains("Windows")) {
        list.remove(ele);
      }
    }
    System.out.println(list);
  }
}
