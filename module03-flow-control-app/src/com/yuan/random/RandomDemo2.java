package com.yuan.random;

import java.util.Random;
import java.util.Scanner;

/**
 * @className: RandomDemo2
 * @package: com.yuan.random
 * @description:
 * @author: liyuan
 * @create: 2024/01/19 1:12
 * @version: 1.0
 */
public class RandomDemo2 {
  public static void main(String[] args) {
    Random r = new Random();
    int luckNumber = r.nextInt(100);

    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("ラッキーナンバーを入力してください：");
      int guessNumber = sc.nextInt();
      // ラッキーナンバーを推測する
      if (guessNumber > luckNumber) {
        System.out.println("オーバーしました");
      } else if (guessNumber < luckNumber) {
        System.out.println("足りないです");
      } else {
        System.out.println("おめでとうございました");
        break;
      }
    }
  }
}
