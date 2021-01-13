/*
 * List4-4のwhile文終了時にinputPositiveIntegerの値が-1になることを確認するプログラムを作成せよ。
 */
package chapter4;

import java.util.Scanner;

public class E04_04 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // カウントダウンの開始をアナウンスする。
        System.out.println("カウントダウンします");
        // 入力された正の整数値を格納する変数を宣言する。
        int inputPositiveInteger;
        do {
            // 正の整数値の入力を促す。
            System.out.print("正の整数値：");
            // 入力された整数を変数に格納する。
            inputPositiveInteger = standardInput.nextInt();
        } while (inputPositiveInteger <= 0); // 入力された整数が負の値の間は、入力をやり直しにする。

        while (inputPositiveInteger >= 0) {
            // 入力された整数を出力する。
            System.out.println(inputPositiveInteger);
            // 入力された整数をデクリメントする。
            inputPositiveInteger--;
        } // 入力された整数がデクリメントされた後も0以上である間、出力を繰り返す。

        // while文終了時はinputPositiveIntegerは-1になることを確認する。
        System.out.println(inputPositiveInteger);
    }

}
