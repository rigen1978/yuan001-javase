package com.yuan.define;

/**
 * @className: ArrayDemo5
 * @package: com.yuan.define
 * @description:
 * @author: liyuan
 * @create: 2024/01/20 0:49
 * @version: 1.0
 */
public class ArrayDemo5 {
  public static void main(String[] args) {
    int[] ages = new int[3];

    System.out.println(ages[0]);
    System.out.println(ages[1]);
    System.out.println(ages[2]);
    ages[0] = 11;
    ages[1] = 22;
    ages[2] = 33;
    System.out.println("--------------------");
    System.out.println(ages[0]);
    System.out.println(ages[1]);
    System.out.println(ages[2]);
  }
}
