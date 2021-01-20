/*
 * 読み込んだ値が1未満であれば改行文字を出力しないようにList4-7およびList4-8を書き換えたプログラムを作成せよ。
 */
package chapter4;

import java.util.Scanner;

public class E04_06 {

    public static void main(String[] args) {
        // 改行文字を出力する基準の定数
        final int NEW_LINE_NUMBER = 1;
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // *を表示する個数の入力を促す。
        System.out.print("何個*を表示しますか：");
        // 入力された整数を変数に格納する。
        int inputNumber = standardInput.nextInt();
        // カウントを1から始めてインクリメントしながら、カウントが入力された整数以下の間*の出力を繰り返す。
        int i = 1;
        while(i <= inputNumber) {
            System.out.print('*');
            i++;
        }
        // 入力された整数が基準値以上の場合は、改行文字を出力する。
        if (inputNumber >= NEW_LINE_NUMBER) {
            System.out.println();
        }
    }

}
