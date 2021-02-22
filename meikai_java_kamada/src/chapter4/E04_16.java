/**
 * 読み込んだ個数だけ*を表示するList4-11(p.114)を書き換えて、5個表示するごとに改行するプログラムを作成せよ。
 */
package chapter4;

import java.util.Scanner;

public class E04_16 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);

        System.out.print("何個*を表示しますか：");
        // 入力された表示する個数を変数に格納する。
        int inputNumber = standardInput.nextInt();

        // 1から始めてインクリメントしながら、入力された数になるまで*を表示する。
        for (int i=1; i<=inputNumber; i++) {
            System.out.print('*');
            // *を5個表示するごとに改行する。
            if (i % 5 == 0) {
                System.out.println();
            }
        }

    }

}
