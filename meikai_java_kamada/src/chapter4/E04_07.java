/**
 * 読み込んだ値の個数だけ記号文字を表示するプログラムを作成せよ。
 * 表示は*と+を交互に行うこと。
 *
 * 何個表示しますか：15
 * *+*+*+*+*+*+
 */
package chapter4;

import java.util.Scanner;

public class E04_07 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 記号を出力する個数の入力を促す。
        System.out.print("何個表示しますか：");
        // 入力された整数を変数に格納する。
        int inputNumber = standardInput.nextInt();
        // カウントを1から始めてインクリメントしながら、カウントが入力された整数値以下の間繰り返し記号を出力する。
        int i = 1;
        while(i <= inputNumber) {
            // カウントが奇数の場合は"*"を、偶数の場合は"+"を出力する。
            if (i % 2 != 0 ) {
                System.out.print("*");
            } else {
                System.out.print("+");
            }
            i++;
        }

    }

}
