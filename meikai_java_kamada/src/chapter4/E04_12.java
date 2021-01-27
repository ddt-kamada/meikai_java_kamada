/*
 * 全問とは逆に、0から正の整数値までカウントアップするプログラムを作成せよ。
 */
package chapter4;

import java.util.Scanner;

public class E04_12 {

    public static void main(String[] args) {
        // カウントアップの初期値を定数にする。
        final int COUNT_FROM = 0;

        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);

        System.out.println("カウントアップします。");

        // 入力された整数を格納する変数を宣言する。
        int inputNumber;
        do {
            // 正の整数の入力を促す。
            System.out.print("正の整数値：");
            // 入力された整数を変数に代入する。
            inputNumber = standardInput.nextInt();
        } while (inputNumber <= 0); // 入力された数値が0以下であれば、繰り返し正の整数値の入力を促す。

        // カウントアップの初期値から始めてインクリメントしながら、入力された整数になるまで出力を繰り返す。
        for (int i=COUNT_FROM; i <= inputNumber; i++) {
            System.out.println(i);
        }


    }

}
