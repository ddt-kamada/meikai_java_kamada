// 演習2_8 キーボードから読み込んだ整数値プラスマイナス5の範囲の整数値をランダムに生成して表示するプログラムを作成せよ。

package chapter_2;

import java.util.Random;
import java.util.Scanner;

public class E02_08 {
    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 整数値の入力を促す。
        System.out.print("整数値：");
        // integerに底辺の入力値を読み込む。
        int inputInteger = standardInput.nextInt();
        // Randomクラスのインスタンスを変数randomに格納する。
        Random random = new Random();
        // 入力された整数からランダムで生成した-5~5の範囲の整数を引く
        int inputIntegerPlusOrMinus5 = inputInteger + (random.nextInt(11) - 5);
        // 出力する。
        System.out.println(inputIntegerPlusOrMinus5);
    }
}
