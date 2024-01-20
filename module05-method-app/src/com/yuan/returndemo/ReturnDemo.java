package com.yuan.returndemo;

/**
 * @className: ReturnDemo
 * @package: com.yuan.returndemo
 * @description:
 * @author: liyuan
 * @create: 2024/01/20 11:51
 * @version: 1.0
 */
public class ReturnDemo {
  // return文
  // 広告
  // メソッドから呼び出し元に値を返す場合には、return文を使って戻り値を指定しますが、return文は戻り値を返すためだけに使用するわけではありません。
  // return文がメソッドの中で実行されるとそれ以降の処理を実行せず呼び出し元へ処理が移すことができます
  public static void main(String args[]) {
    int data[];

    test(15, 4);
    test(7, 0);
  }

  // このメソッドでは2箇所でreturn文が使われています。
  // 1つ目はif文の中で使われていて、引数として渡されてきた2番目の値がもし0だった場合はメッセージを画面に表示した後でreturn文によってメソッドを終了させ呼び出し元に処理を戻しています。
  // 2つ目はメソッドの最後で使われており、処理が全て終わったらreturn文によってメソッドを終了させ呼び出し元に処理を戻しています。
  //
  // このようにreturn文を使うことでメソッドの中の処理の流れを任意の位置で終了させ呼び出し元に処理を返すことができるようになります。
  //
  // なおメソッドはブロック内の最後の文が実行され「}」に達するとメソッドの呼び出し元に処理が戻りますので、
  // 戻り値が無い場合にはメソッドの最後のreturn文は通常は記述する必要はありません。戻り値として返す値を指定する場合にだけ使用します。
  private static void test(int n1, int n2) {
    if (n2 == 0) {
      System.out.println("0で割ることはできません");
      return;
    }

    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
    return;
  }
}
