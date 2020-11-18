/**
 * 二つの実数値を読み込んで、大きい方の値を表示するプログラムを作成せよ。
 */

package chapter_3;

import java.util.Scanner;

public class E03_09 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 最初の実数の入力を促す
        System.out.print("実数を入力してください。：");
        // 最初に入力された実数値を変数realNumberFirstに格納する。
        double realNumberFirst = standardInput.nextDouble();
        // 次の実数の入力を促す。
        System.out.print("次の実数を入力してください：");
        // 入力された実数値を変数realNumberSecondに格納する。
        double realNumberSecond = standardInput.nextDouble();
        // 二つの変数を比較して大きい方を返却し、変数maxRealNumberに格納する。
        double maxRealNumber = realNumberFirst > realNumberSecond ? realNumberFirst : realNumberSecond;
        // 大きい方の値を出力する。
        System.out.println("大きい方の値は" + maxRealNumber + "です。");
    }

}
