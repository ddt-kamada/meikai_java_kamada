/*
 * 読み込んだ整数値のすべての約数を表示するList4-13(p.118)を書きかえて、
 * 約数の表示が終わった後に、約数の個数を表示するプログラムを作成せよ。
 */
package chapter4;

import java.util.Scanner;

public class E04_17 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);

        System.out.print("整数値：");
        // 入力された整数値を変数に格納する。
        int inputNumber = standardInput.nextInt();
        // 約数の個数を格納する変数を宣言し、0で初期化する。
        int divisorCount = 0;
        // 1から始めてインクリメントしながら、入力された整数になるまで繰り返し約数か判定する。
        for (int i=1; i<=inputNumber; i++) {
            if (inputNumber % i == 0) {
                // 約数を出力し、約数の個数を1足す。
                System.out.println(i);
                divisorCount++;
            }
        }
        // 最終的な約数の個数を出力する。
        System.out.println("約数の個数は" + divisorCount + "個です。");
    }

}
