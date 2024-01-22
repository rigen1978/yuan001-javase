package com.yuan.demo;

import java.util.Scanner;

/**
 * @className: Test
 * @package: com.yuan.demo
 * @description:
 * @author: liyuan
 * @create: 2024/01/22 11:48
 * @version: 1.0
 */
public class Test {
  public static void main(String[] args) {
    // 1、movieクラスを定義
    // 2、movie操作クラスを定義
    // 3、movieのデータを用意する
    Movie[] movies = new Movie[4];
    movies[0] = new Movie(1, "movie1", 38.9, 9.8, "tanaka", "mike", "12万人");
    movies[1] = new Movie(2, "movie2", 39, 7.8, "wadanabe", "joke", "3.5万人");
    movies[2] = new Movie(3, "movie3", 42, 7.9, "iinoue", "jodan", "17.9万人");
    movies[3] = new Movie(4, "movie4", 35, 8.7, "hayasi", "liu", "10.8万人");
    // 4、movie操作クラス
    MovieOperator operator = new MovieOperator(movies);
    //        operator.printAllMovies();
    //        operator.searchMovieById(3);
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("==movie system==");
      System.out.println("1、movie list");
      System.out.println("2、idで検索する");
      System.out.println("操作を入力してください：");
      int command = sc.nextInt();
      switch (command) {
        case 1:
          // movie list
          operator.printAllMovies();
          break;
        case 2:
          // idでmovieの詳細を表示する
          System.out.println("movie idを入力してください:");
          int id = sc.nextInt();
          operator.searchMovieById(id);
          break;
        default:
          System.out.println("エラー~~");
      }
    }
  }
}
