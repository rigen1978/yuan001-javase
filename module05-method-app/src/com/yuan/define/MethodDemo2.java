package com.yuan.define;

/**
 * @className: MethodDemo2
 * @package: com.yuan.define
 * @description:
 * @author: liyuan
 * @create: 2024/01/20 2:23
 * @version: 1.0
 */
public class MethodDemo2 {
  public static void main(String[] args) {
    int eigo = 78;
    int suugaku = 90;
    int kokugo = 68;
    // メソッドの呼び出し
    // メソッドを定義したらプログラムの中から呼び出すことができます。
    // メソッドの種類によって呼び出し方が実際は異なるのですが、現在使い方を確認しているメソッドの場合は次のように呼び出してください。
    check("英語", eigo);
    check("数学", suugaku);
    check("国語", kokugo);
  }

  // メソッドの記述位置
  // メソッドはクラスの中に記述します。
  // プログラムが実行される時に最初に呼び出されるメソッドであるmainメソッドがクラスの中に既に記述されているはずですが、
  // 新しく定義するメソッドもクラスの「{」から「}」の中に記述します。
  // この時、メソッドが記述される順番は関係ありません。
  private static void check(String kyouka, int seiseki) {
    System.out.println(kyouka + "の試験結果は");
    if (seiseki > 80) {
      System.out.println("合格です");
    } else {
      System.out.println("不合格です");
    }
  }
}
