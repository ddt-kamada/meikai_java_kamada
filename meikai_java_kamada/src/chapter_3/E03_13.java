/*
 * キーボードから読み込んだ三つの整数値の中央値を求めて表示するプログラムを作成せよ。
 * ※例えば、2, 3, 1の中央値は2で、1, 2, 1の中央値は1で、3, 3, 3の中央値は3である。
 */

package chapter_3;

import java.util.Scanner;

public class E03_13 {

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

        // 中央値を保持する変数medianIntegerを宣言し、最初の整数値で初期化する。
        int medianInteger = integerFirst;
        if (integerFirst == integerSecond && integerFirst == integerThird) {
            // 3つの整数が全て同じ値の場合、変数medianIntegerに1番目の入力値を代入する。
            medianInteger = integerFirst;
        } else if (integerFirst == integerSecond) {
            // 1番目と2番目の整数が同じ値で、3番目の整数のみ異なる場合、1番目と2番目の整数の平均値を変数medianIntegerに代入する。
            medianInteger = (integerFirst + integerSecond) / 2;
        } else if (integerFirst == integerThird) {
            // 1番目と3番目の整数が同じ値で、2番目の整数のみ異なる場合、1番目と3番目の整数の平均値を変数medianIntegerに代入する。
            medianInteger = (integerFirst + integerThird) / 2;
        } else if (integerSecond == integerThird) {
            // 2番目と3番目の整数が同じ値で、1番目の整数のみ異なる場合、2番目と3番目の整数の平均値を変数medianIntegerに代入する。
            medianInteger = (integerSecond + integerThird) / 2;
        } else {
            // 3つの整数が全て異なる場合

            // 3つの整数の中で最小値を求める。
            // 入力された3つの変数の中で最小の値を保持する変数minimumIntegerを宣言し、最初の入力値で初期化する。
            int minimumInteger = integerFirst;
            if (minimumInteger > integerSecond) {
                // 2番目の入力値が現時点で１番小さい値よりも小さければ、変数minimumIntegerに2番目の入力値を代入する。
                minimumInteger = integerSecond;
            }
            if (minimumInteger > integerThird) {
                // 3番目の入力値が現時点で１番小さい値よりも小さければ、変数minimumIntegerに3番目の入力値を代入する。
                minimumInteger = integerThird;
            }

            // 3つの整数の中で最大値を求める。
            // 入力された3つの変数の中で最大の値を保持する変数maximumIntegerを宣言し、最初の入力値で初期化する。
            int maximumInteger = integerFirst;
            if (maximumInteger < integerSecond) {
                // 2番目の入力値が現時点で１番大きい値よりも大きければ、変数maximumIntegerに2番目の入力値を代入する。
                maximumInteger = integerSecond;
            }
            if (maximumInteger < integerThird) {
                // 3番目の入力値が現時点で１番大きい値よりも大きければ、変数maximumIntegerに3番目の入力値を代入する。
                maximumInteger = integerThird;
            }

            if (minimumInteger != integerSecond && maximumInteger != integerSecond) {
                // 2番目の入力値が最小値でも最大値でもなければ、2番目の入力値を中央値として変数medianIntegerに代入する。
                medianInteger = integerSecond;
            }
            if (minimumInteger != integerThird && maximumInteger != integerThird) {
                // 3番目の入力値が最小値でも最大値でもなければ、3番目の入力値を中央値として変数medianIntegerに代入する。
                medianInteger = integerThird;
            }
        }

        // 中央値を出力する。
        System.out.println("中央値は" + medianInteger + "です。");

    }

}
