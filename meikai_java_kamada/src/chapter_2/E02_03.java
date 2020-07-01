// 演習2-3 右に示すように、キーボードから読み込んだ整数値をそのまま反復して表示するプログラムを作成せよ。

package chapter_2;

import java.util.Scanner;

public class E02_03 {
    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数stdInに格納する
        Scanner standardInput = new Scanner(System.in);
        // 整数値の入力を促す
        System.out.print("整数値：");
        // 変数integerInput に入力値を読み込む
        int integerInput = standardInput.nextInt();
        // 出力する
        System.out.println(integerInput + "と入力しましたね。");
    }
}
