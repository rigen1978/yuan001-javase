package com.yuan.branch;

/**
 * @className: SwitchDemo4
 * @package: com.yuan.branch
 * @description:
 * @author: liyuan
 * @create: 2024/01/18 12:05
 * @version: 1.0
 */
public class SwitchDemo4 {
  // Java 12以降では、switch命令に新たな構文が追加されました。執筆時点ではPreview機能ですが、今後の正式実装に向けて、理解しておくことをお勧めします。
  public static void main(String[] args) {
    String lang = "Ruby";
    @SuppressWarnings("preview")
    String category =
        switch (lang) {
          case "PHP", "Python", "Ruby" -> "スクリプト言語";
          case "Java", "C#", "C" -> "プログラミング言語";
          default -> "不明";
        };
    System.out.println(category); // 結果：スクリプト言語
  }
}
