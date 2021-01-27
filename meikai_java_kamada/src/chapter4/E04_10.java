/**
 * 読み込んだ値が1未満であれば改行文字を出力しないようにList4-11(p.114)を書き換えたプログラムを作成せよ。
 */
package chapter4;

import java.util.Scanner;

public class E04_10 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);

        // 整数の入力を促す。
        System.out.print("何個*を表示しますか：");
        // 入力された整数を変数に格納する。
        int inputNumber = standardInput.nextInt();

        // 0から始めて1ずつ増やしながら、入力された整数回繰り返し処理をする。
        // 入力された整数が0以下の場合は一度も処理を行わない。
        for (int i=0; i<inputNumber; i++) {
            // *を出力する。
            System.out.print("*");
        }

        // 入力された整数が1以上であれば改行文字を出力する。
        if (inputNumber >= 1) {
            System.out.println();
        }

    }

}
