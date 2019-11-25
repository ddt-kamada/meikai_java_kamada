/**
 * 二つの整数値を読み込んで、それらの値の差を表示するプログラムを作成せよ。
 */

package chapter_3;

import java.util.Scanner;

public class E03_10 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 整数Aの入力を促す。
        System.out.print("整数A：");
        // 入力された整数を変数integerAに格納する。
        int integerA = standardInput.nextInt();
        // 整数Bの入力を促す。
        System.out.print("整数B：");
        // 入力された整数を変数integerBに格納する。
        int integerB = standardInput.nextInt();
        // 変数integerAと変数integerBを比べて大きい方から小さい方を引いた値を生成し、変数differenceに格納する。
        int difference = integerA > integerB ? integerA - integerB : integerB - integerA;
        // 変数differenceを出力する。
        System.out.println("整数Aと整数Bの差は" + difference + "です。");
    }

}
