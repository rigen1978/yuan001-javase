package com.yuan.scanner;

import java.util.Scanner;

/**
 * @className: ScannerDemo1
 * @package: com.yuan.scanner
 * @description:
 * @author: liyuan
 * @create: 2024/01/18 11:03
 * @version: 1.0
 */
/*
キーボードから入力された値を取得する
	Scanner クラスの利用方法として標準入力から値を受け取りプログラムの中で利用する方法について解説します。
	デフォルトでは標準入力はキーボードに設定されているので、キーボードから利用者が入力した値を受け取ります。
	値を区切り文字を使って分割され、 Scanner クラスの next メソッドを使い順番に取得します。

	標準入力を使うScannerクラスのインスタンスを作成する
	デフォルトでは標準入力はキーボードに設定されています(標準出力はディスプレイに設定されています)。
	利用者にキーボードを使って入力してもらった内容を受け取り、プログラムの中で利用するには、
	標準入力を入力元とする Scanner クラスのインスタンス(スキャナ)を作成します。次のコンストラクタを使用します。
 */
public class ScannerDemo1 {
  public static void main(String[] args) {
    // Scanner クラスの利用方法
    Scanner scanner = new Scanner(System.in);

    System.out.println("年齢を入力してください： ");
    int age = scanner.nextInt();
    System.out.println("あなたの年齢は： " + age + "です");

    System.out.println("名前を入力してください： ");
    String name = scanner.next();
    System.out.println("あなたの名前は：" + name);
  }
}
