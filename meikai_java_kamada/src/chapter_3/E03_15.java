/*
 * 二つの整数値を読み込んで降順（大きい順）にソートするプログラムを作成せよ。
 */

package chapter_3;

import java.util.Scanner;

public class E03_15 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 整数Aの入力を促す。
        System.out.print("整数a：");
        // 入力された整数値を変数integerAに格納する。
        int integerA = standardInput.nextInt();
        // 整数Bの入力を促す。
        System.out.print("整数b：");
        // 入力された整数値を変数integerBに格納する。
        int integerB = standardInput.nextInt();

        // integerAがintegerBより小さければ値を交換
        if (integerA < integerB) {
            int temp = integerA;
            integerA = integerB;
            integerB = temp;
        }
        // 結果を出力
        System.out.println("a >= bとなるようにソートしました。");
        System.out.println("変数aは" + integerA + "です。");
        System.out.println("変数bは" + integerB + "です。");

    }

}