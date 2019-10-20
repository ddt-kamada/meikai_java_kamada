/*
 * 二つの正の整数値を読み込んで、後者が前者の約数であれば『BはAの約数です。』と表示し、
 * そうでなければ『BはAの約数ではありません。』と表示するプログラムを作成せよ。
 * 整数A：12
 * 整数B:4
 * BはAの約数です。
 */

package chapter_3;

import java.util.Scanner;

public class E03_02 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 一つ目の整数の入力を促す。
        System.out.print("整数A：");
        // キーボードから読み込んだ整数値を変数integerAに格納する。
        int integerA = standardInput.nextInt();
        // 二つ目の整数の入力を促す。
        System.out.print("整数B：");
        // キーボードから読み込んだ整数値を変数integerBに格納する。
        int integerB = standardInput.nextInt();
        if (integerA % integerB == 0)
            // integerAをintergerBで割ったあまりが0であればBはAの約数である。
            System.out.println("BはAの約数です。");
        else
            // integerAをintergerBで割ったあまりが0でなければBはAの約数ではない。
            System.out.println("BはAの約数ではありません。");
    }
}
