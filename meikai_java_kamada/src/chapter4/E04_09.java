/*
 * 下に示すように、正の整数値nを読み込んで、1からnまでの積を求めるプログラムを作成せよ。
 *
 * nの値：5
 * 1から5までの積は120です。
 */
package chapter4;

import java.util.Scanner;

public class E04_09 {

    public static void main(String[] args) {
        // 乗算を始める数値は決まっているので定数にする。
        final int START_NUMBER = 1;

        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);

        System.out.println(START_NUMBER + "からnまでの積を求めます。");
        // 入力される整数を格納する変数を宣言する。
        int inputNumber;
        do {
            // 値の入力を促す。
            System.out.print("nの値：");
            // 入力された整数を変数に代入する。
            inputNumber = standardInput.nextInt();
        } while (inputNumber <= 0); // 入力された値が0以下であれば、繰り返し値の入力を促す。

        // 積を格納する変数を宣言し、乗算に影響を与えないように1で初期化する。
        int answerProduct = 1;
        // 繰り返しを制御するための変数を宣言し、初期化する。
        int incrementNumber = START_NUMBER;

        // インクリメントされた数が入力された整数以下である間、乗算を繰り返す。
        while (incrementNumber <= inputNumber) {
            // これまでの積にインクリメントされた数を掛け、結果を代入する。
            answerProduct *= incrementNumber;
            // 乗算する整数をインクリメントする。
            incrementNumber++;
        }

        // 結果を出力する。
        System.out.println(START_NUMBER + "から" + inputNumber + "までの積は" + answerProduct +"です。");

    }

}
