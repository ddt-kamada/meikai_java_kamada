/**
 * 正の整数値を0までカウントダウンするList4-4(p.100)をfor文で実現せよ。
 */
package chapter4;

import java.util.Scanner;

public class E04_11 {

    public static void main(String[] args) {
        // カウントダウンの下限を定数にする。
        final int COUNT_TO = 0;
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);

        System.out.println("カウントダウンします。");

        // 入力された整数を格納する変数を宣言する。
        int inputNumber;
        do {
            // 正の整数の入力を促す。
            System.out.print("正の整数値：");
            // 入力された整数を変数に代入する。
            inputNumber = standardInput.nextInt();
        } while (inputNumber <= 0); // 入力された数値が0以下であれば、繰り返し正の整数値の入力を促す。

        // 入力された正の整数から始めてデクリメントしながら、カウントダウンの下限になるまで出力を繰り返す。
        for (int i=inputNumber; i >= COUNT_TO; i--) {
            System.out.println(i);
        }

    }

}
