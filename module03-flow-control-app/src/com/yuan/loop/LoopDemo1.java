package com.yuan.loop;

/**
 * @className: LoopDemo1
 * @package: com.yuan.loop
 * @description:
 * @author: liyuan
 * @create: 2024/01/19 10:21
 * @version: 1.0
 */
public class LoopDemo1 {
  public static void main(String[] args) {
    // for命令は、決められた回数だけ処理を繰り返すのに利用します。
    /*
            処理の流れは、以下のとおりです。
        1. ループの最初に、初期化式（i = 0）を実行
        2. 終了条件式（i < 5）を評価
        3. 2.がtrueであれば配下の処理を実行、falseであれば終了
        4. 増減式（i++）を実行
        5. 2.に戻る
    */
    for (int i = 0; i < 5; i++) {
      System.out.println("Hello World~~");
    }

    System.out.println("----------------------------------");

    // 順次演算子による複雑なループ
    // 順次演算子（カンマ演算子）を利用することで、それぞれの式に複数の式を指定することもできます。
    // 結果：0、11、24、39、56
    for (int i = 0, j = 10; i < 5; i++, j++) {
      System.out.println(i * j);
    }
  }
}
