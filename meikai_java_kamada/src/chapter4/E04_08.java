/*
 * 下に示すように、正の整数値を読み込んで、その桁数を出力するプログラムを作成せよ。
 *
 * 整数値：1254
 * その値は4桁です。
 */
package chapter4;

import java.util.Scanner;

public class E04_08 {
    public static void main(String[] args) {
        // 10進数の基数を定数にする。
        final int DECIMAL_RADIX = 10;
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);

        // 入力値を格納する変数を宣言する。
        int inputInteger;
        // 整数の入力を促す。
        do {
            System.out.print("整数値：");
            // 入力された整数を変数に格納する。
            inputInteger = standardInput.nextInt();
        } while (inputInteger <= 0); // 入力された整数が正の整数でなければ、繰り返し整数の入力を促す。

        // 桁数を格納する変数を宣言し、0で初期化する。
        int digitsNumber = 0;
        // 計算用の一時的な変数を宣言し、入力された正の整数で初期化する。
        int temporaryInteger = inputInteger;
        do {
            // 一時的な変数を基数で乗算し、結果を丸めて再び一時的な変数に代入する。
            temporaryInteger = temporaryInteger / DECIMAL_RADIX;
            // 桁数を1桁足す。
            digitsNumber++;
        } while (temporaryInteger > 0); // 一時的な変数の桁数が1桁になるまでカウントを繰り返す。

        // 桁数を出力する。
        System.out.print("その値は" + digitsNumber + "桁です。");
    }

}
