// 演習2_5 二つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ。

package chapter_2;

import java.util.Scanner;

public class E02_05 {
    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数stdInに格納する。
        Scanner standardInput = new Scanner(System.in);
        // xの値の入力を促す。
        System.out.print("xの値：");
        // xに入力値を読み込む。
        double x = standardInput.nextDouble();
        // yの値の入力を促す。
        System.out.print("yの値：");
        // yに入力値を読み込む。
        double y = standardInput.nextDouble();
        // xとyの合計値を出力する。
        System.out.println("合計は" + (x + y) + "です。");
        // xとyの平均値を出力する。
        System.out.println("平均は" + ((x + y) / 2) + "です。");
    }
}
