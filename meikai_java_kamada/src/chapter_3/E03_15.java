/*
 * 二つの整数値を読み込んで降順（大きい順）にソートするプログラムを作成せよ。
 */

package chapter_3;

import java.util.Scanner;

public class E03_15 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 最初の整数の入力を促す。
        System.out.print("整数a：");
        // 入力された整数値を変数integerFirstに格納する。
        int integerFirst = standardInput.nextInt();
        // 2番目の整数の入力を促す。
        System.out.print("整数b：");
        // 入力された整数値を変数integerSecondに格納する。
        int integerSecond = standardInput.nextInt();

        // 最初の入力値が2番目の入力値より小さければ値を交換
        if (integerFirst < integerSecond) {
            int tempInteger = integerFirst;
            integerFirst = integerSecond;
            integerSecond = tempInteger;
        }
        // 結果を出力
        System.out.println("a >= bとなるようにソートしました。");
        System.out.println("変数aは" + integerFirst + "です。");
        System.out.println("変数bは" + integerSecond + "です。");

    }

}