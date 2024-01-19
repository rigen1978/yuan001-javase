package com.yuan.loop;

/**
 * @className: LoopDemo2
 * @package: com.yuan.loop
 * @description:
 * @author: liyuan
 * @create: 2024/01/19 10:24
 * @version: 1.0
 */
public class LoopDemo2 {
  public static void main(String[] args) {
    // 拡張for命令
    // 配列／コレクションの内容を順に処理する – 拡張for命令
    /**
     * 拡張for命令（for-each命令とも言います）は、与えられた配列やコレクションから順に要素を取り出し、仮変数varに代入しながら、処理を繰り返します。
     * コレクションに読みだすべき要素がなくなったところで、ループは終了します。 for命令でも代用できますが、コレクションの処理では拡張for命令の方が、シンプルに記述できます。
     */
    String[] data = {"Java", "Mysql", "Php"};
    for (String val : data) {
      System.out.print(val + "/");
    }
  }
}
