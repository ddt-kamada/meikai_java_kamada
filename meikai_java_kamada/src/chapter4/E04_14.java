/*
 * 前問のプログラムを書き換えて、下のように"式"を表示するプログラムを作成せよ。
 *
 * nの値：5
 * 1 + 2 + 3 + 4 + 5 = 15
 */
package chapter4;

import java.util.Scanner;

public class E04_14 {

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

        int answerSum = 0;
        // インクリメントの回数が入力された正の整数以下であるあいだ繰り返し処理をする。
        for (int i=1; i <= inputNumber; i++) {
            // answerSumに1からインクリメントしていく数を加算し、再びansweSumに代入する。
            answerSum += i;
            // 加算した数を出力する。
            System.out.print(i);
            // 繰り返しの最後でなければ正符号を出力する。
            if (i != inputNumber) {
                System.out.print(" + ");
            }
        }

        // 演算結果を出力する。
        System.out.println(" = " + answerSum);
    }

}
