// 演習2-4 右に示すように、キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力するプログラムを作成せよ。

package chapter_2;

import java.util.Scanner;

public class E02_04 {
    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数stdInに格納する
        Scanner standardInput = new Scanner(System.in);
        // 整数値の入力を促す
        System.out.print("整数値：");
        // 変数inputInteger に入力値を読み込む
        int inputInteger = standardInput.nextInt();
        // 変数inputInteger に10を加えた値を出力する
        System.out.println("10を加えた値は" + (inputInteger + 10) + "です。");
        // 変数inputInteger に10を減じた値を出力する。
        System.out.println("10を減じた値は" + (inputInteger - 10) + "です。");
    }
}
