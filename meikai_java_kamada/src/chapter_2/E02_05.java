// 演習2_5 二つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ。

package chapter_2;

import java.util.Scanner;

public class E02_05 {
    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数stdInに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 一つ目の実数値の入力を促す。
        System.out.print("一つ目の実数値：");
        // 変数integerFirst に入力値を読み込む。
        double integerFirst = standardInput.nextDouble();
        // 二つ目の実数値の入力を促す。
        System.out.print("yの値：");
        // 変数integerSecond に入力値を読み込む。
        double integerSecond = standardInput.nextDouble();
        // 一つ目の実数値と二つ目の実数値の合計値を出力する。
        System.out.println("合計は" + (integerFirst + integerSecond) + "です。");
        // 一つ目の実数値と二つ目の実数値の平均値を出力する。
        System.out.println("平均は" + ((integerFirst + integerSecond) / 2) + "です。");
    }
}
