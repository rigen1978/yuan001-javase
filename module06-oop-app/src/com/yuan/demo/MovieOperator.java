package com.yuan.demo;

/**
 * @className: MovieOperator
 * @package: com.yuan.demo
 * @description:
 * @author: liyuan
 * @create: 2024/01/22 11:48
 * @version: 1.0
 */
public class MovieOperator {
  private Movie[] movies;

  public MovieOperator(Movie[] movies) {
    this.movies = movies;
  }

  /** 1、すべての映画を表示 movies = [m1, m2, m3, ...] */
  public void printAllMovies() {
    System.out.println("----- MOVIE LIST：-------");
    for (int i = 0; i < movies.length; i++) {
      Movie m = movies[i];
      System.out.println("movie id：" + m.getId());
      System.out.println("movie name：" + m.getName());
      System.out.println("値段：" + m.getPrice());
      System.out.println("------------------------");
    }
  }

  /** 2、movie idで検索したの映画の詳細を表示 */
  public void searchMovieById(int id) {
    for (int i = 0; i < movies.length; i++) {
      Movie m = movies[i];
      if (m.getId() == id) {
        System.out.println("movieの詳細は：");
        System.out.println("movie id：" + m.getId());
        System.out.println("movie name：" + m.getName());
        System.out.println("値段：" + m.getPrice());
        System.out.println("点数：" + m.getScore());
        System.out.println("director：" + m.getDirector());
        System.out.println("Star：" + m.getActor());
        System.out.println("info：" + m.getInfo());
        return;
      }
    }
    System.out.println("このmovieが存在しませんでした~");
  }
}
