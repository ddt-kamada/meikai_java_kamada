/**
 * 10進整数を読み込んで、その値を8真数と16真数で表示するプログラムを作成せよ。
 *
 * 整数：27
 * ８進数では33です。
 * 16進数では1bです。
 */
package chapter5;

import java.util.Scanner;

public class E05_01 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 整数の入力を促す。
        System.out.print("整数：");
        // 入力された整数を変数に代入する。
        int inputInteger = standardInput.nextInt();

        // 入力された整数を8進数で出力する。
        System.out.printf("８進数で" + inputInteger + "は%oです。\n", inputInteger);
        // 入力された整数を16進数で出力する。
        System.out.printf("16進数で" + inputInteger + "は%xです。\n", inputInteger);

    }

}
