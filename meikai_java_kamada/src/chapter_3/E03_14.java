/*
 * 二つの整数値を読み込んで、小さいほうの値と大きいほうの値を表示するプログラムを作成せよ。
 * ただし、二つの整数値が等しい場合は、下に示すように『二つの値は同じです。』と表示すること。
 *
 * 整数a: 12
 * 整数b: 12
 * 二つの値は同じです。
 */

package chapter_3;

import java.util.Scanner;

public class E03_14 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 最初の整数の入力を促す。
        System.out.print("整数a：");
        // 入力された整数値を変数integerFirstに格納する。
        int integerFirst = standardInput.nextInt();
        // 2番目の整数の入力を促す。
        System.out.print("整数b：");
        // 入力された整数値を変数integerSecondに格納する。
        int integerSecond = standardInput.nextInt();

        // 小さい方の値を保持する変数をminimumInteger、大きい方の値を保持する変数をmaximunIntegerとして宣言する。
        int minimumInteger, maximunInteger;
        // 最初の入力値が2番目の入力値よりも小さい場合
        if (integerFirst < integerSecond) {
            // minimumIntegerに最初の入力値を代入する。
            minimumInteger = integerFirst;
            // maximunIntegerに2番目の入力値を代入する。
            maximunInteger = integerSecond;
         // 2番目の整数値が最初の整数値よりも小さい場合
        } else if (integerFirst > integerSecond) {
            // minimumIntegerに2番目の入力値を代入する。
            minimumInteger = integerSecond;
            // maximunIntegerに最初の入力値を代入する。
            maximunInteger = integerFirst;
        } else {
            // 2つの入力値が同じ値の場合、『二つの値は同じです。』と出力する。
            System.out.println("二つの値は同じです。");
            return;
        }

        // 小さい方の値と大きい方の値を出力する。
        System.out.println("小さいほうの値は" + minimumInteger + "です。");
        System.out.println("大きいほうの値は" + maximunInteger + "です。");

    }

}
