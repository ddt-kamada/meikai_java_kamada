/*
 * 1からnまでの和を求めるList4-10(p.112)をfor文で実現せよ。
 */
package chapter4;

import java.util.Scanner;

public class E04_13 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);

        System.out.println("1からnまでの和を求めます。");

        // 入力された整数を格納する変数を宣言する。
        int inputNumber;
        do {
            // 正の整数の入力を促す。
            System.out.print("nの値：");
            // 入力された整数を変数に代入する。
            inputNumber = standardInput.nextInt();
        } while (inputNumber <= 0); // 入力された数値が0以下であれば、繰り返し正の整数値の入力を促す。

        // 入力された正の整数回、繰り返し和を求める。
        int answerSum = 0;
        for (int i=1; i<=inputNumber; i++) {
            answerSum += i;
        }

        // 演算結果を出力する。
        System.out.println("1から" + inputNumber + "までの和は" + answerSum + "です。");

    }

}
