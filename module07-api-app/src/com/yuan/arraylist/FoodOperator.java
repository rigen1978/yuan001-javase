package com.yuan.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @className: FoodOperator
 * @package: com.yuan.arraylist
 * @description:
 * @author: liyuan
 * @create: 2024/01/23 0:54
 * @version: 1.0
 */
public class FoodOperator {
  /** 料理の一覧機能の実現 */

  // 1、ArrayListを定義，料理のデータを格納する
  private ArrayList<Food> foodList = new ArrayList<>();

  // 2、料理を登録する

  // 3,料理を展示する

  /** main画面 */
  public void start() {
    while (true) {
      System.out.println("機能を選択してください：");
      System.out.println("1、メニュー登録");
      System.out.println("2、メニュー詳細");
      System.out.println("3、キャンセル");

      Scanner sc = new Scanner(System.in);
      System.out.println("操作を選択してください");
      String command = sc.next();
      switch (command) {
        case "1":
          addFood();
          break;
        case "2":
          showAllFoods();
          break;
        case "3":
          System.out.println("また来てね");
          return;
        default:
          System.out.println("この操作は存在していません");
      }
    }
  }

  public void showAllFoods() {
    if (foodList.size() == 0) {
      System.out.println("まだ何にもないから、まずは登録してください。");
      return;
    }
    for (int i = 0; i < foodList.size(); i++) {
      Food f = foodList.get(i);
      System.out.println(f.getName());
      System.out.println(f.getPrice());
      System.out.println(f.getDesc());
      System.out.println("-----------------");
    }
  }

  public void addFood() {
    Food f = new Food();
    Scanner sc = new Scanner(System.in);
    System.out.println("料理の名称は： ");
    String name = sc.next();
    f.setName(name);

    System.out.println("料理の価格： ");
    double price = sc.nextDouble();
    f.setPrice(price);

    System.out.println("この料理についての紹介：");
    String desc = sc.next();
    f.setDesc(desc);

    foodList.add(f);
    System.out.println("アプロード成功しました。");
  }
}
