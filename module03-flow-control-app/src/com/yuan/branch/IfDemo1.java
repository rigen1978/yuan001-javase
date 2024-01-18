package com.yuan.branch;

/**
 * @className: IfDemo1
 * @package: com.yuan.branch
 * @description:
 * @author: liyuan
 * @create: 2024/01/18 12:07
 * @version: 1.0
 */
public class IfDemo1 {
  public static void main(String[] args) {
    // 1
    // if命令は、与えられた条件の真偽に応じて実行する命令を分岐します。
    // 直訳するならば、「もし～ならば…」という構造を表します。
    // たとえば以下は、変数valが10であれば「変数valは10です」というメッセージを表示するサンプルです。
    int val = 10;
    if (val == 10) {
      System.out.println("変数valは１０です");
    }

    // 2「もし～ならば…さもなくば…」を表現したいならば、else句を利用します。
    int val1 = 11;
    if (val1 == 10) {
      System.out.println("変数は１０です");
    } else {
      System.out.println("変数は１０ではありません");
    }

    // 3 更に、「もし～ならば…、～ならば…、さもなくば…」のように複数分岐を表したいならば、else if句を利用します。else if句は、必要な数だけ繰り返し書いて構いません。
    int val2 = 11;
    if (val2 == 10) {
      System.out.println("変数は１０です");
    } else if (val2 == 20) {
      System.out.println("変数は２０です");
    } else {
      System.out.println("変数は１０でも２０でもありません");
    }
  }
}
