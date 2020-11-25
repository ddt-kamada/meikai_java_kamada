/**
 * キーボードから読み込んだ三つの整数値の最小値を求めて表示するプログラムを作成せよ。
 */

package chapter_3;

import java.util.Scanner;

public class E03_12 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner (System.in);
        // 最初の整数の入力を促す。
        System.out.print("１番目の整数を入力してください。:");
        // 入力された整数値を変数integerFirstに格納する。
        int integerFirst = standardInput.nextInt();
        // ２番目の整数の入力を促す。
        System.out.print("２番目の整数を入力してください。:");
        // 入力された整数値を変数integerSecondに格納する。
        int integerSecond = standardInput.nextInt();
        // 3番目の整数の入力を促す。
        System.out.print("３番目の整数を入力してください。:");
        // 入力された整数値を変数integerThirdに格納する。
        int integerThird = standardInput.nextInt();

        // 入力された変数で最小の値を保持する変数minimumIntegerを宣言し、最初の入力値で初期化する。
        int minimumInteger = integerFirst;
        // ２番目の入力値が最初の入力値よりも小さければ、変数minimumIntegerに２番目の入力値を代入する。
        if (integerSecond < minimumInteger) {
            minimumInteger = integerSecond;
        }
        // ３番目の入力値が現時点で１番小さい値よりも小さければ、変数minimumIntegerに３番目の入力値を代入する。
        if (integerThird < minimumInteger) {
            minimumInteger = integerThird;
        }

        // 最小値を出力する。
        System.out.println("最小値は" + minimumInteger + "です。");
    }

}
