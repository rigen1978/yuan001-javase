package com.yuan.define;

/**
 * @className: MethodDemo1
 * @package: com.yuan.define
 * @description:
 * @author: liyuan
 * @create: 2024/01/20 2:18
 * @version: 1.0
 */
public class MethodDemo1 {
  public static void main(String[] args) {
    // メソッドは、クラスにおける動作、処理（手続き）を表す要素です。
    // まずはどのような場合にメソッドが使われるのかを確認していきます。
    // if文が2回使われていますが条件式の中で使われている変数以外は同じです。
    // 3回も4回も同じような処理が記述されていくと無駄に長いプログラムとなってしまいます。
    // ただ、同じような処理を行う複数の文が、プログラムの中で離れたところに記述されていた場合はこの方法は使えません。
    // このような時にはメソッドを使うと便利です。
    int eigo = 78;
    int suugaku = 90;

    System.out.println("英語の試験結果は");
    if (eigo > 80) {
      System.out.println("合格です");
    } else {
      System.out.println("不合格です");
    }

    System.out.println("数学の試験結果は");
    if (suugaku > 80) {
      System.out.println("合格です");
    } else {
      System.out.println("不合格です");
    }
  }
}
