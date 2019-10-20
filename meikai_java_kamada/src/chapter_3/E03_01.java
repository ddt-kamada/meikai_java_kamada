// 演習3_1 下に示すように、整数値を読み込んで、その絶対値を求めて表示するプログラムを作成せよ。
// 整数値：-5
// その絶対値は5です。

package chapter_3;

import java.util.Scanner;

public class E03_01 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 整数値の入力を促す。
        System.out.print("整数値：");
        // キーボードから読み込んだ整数値を変数numberに格納する。
        int number = standardInput.nextInt();
        // 絶対値を格納する変数absoluteValueを宣言する。
        int absoluteValue;
        if (number < 0) {
            // numberが0未満の場合、numberの負の符号を外して絶対値とする。
            absoluteValue = -number;
        } else {
            // numberが0以上の場合、numberを絶対値とする。
            absoluteValue = number;
        }
        // 絶対値を出力する。
        System.out.println("その絶対値は" + absoluteValue + "です。");
    }
}
