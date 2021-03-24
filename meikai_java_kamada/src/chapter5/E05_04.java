/**
 * 三つの整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ。
 * 平均は実数として表示すること。
 */
package chapter5;

import java.util.Scanner;

public class E05_04 {
    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        System.out.println("整数値xとyとzの合計と平均を求めます。");
        // 最初の数値の入力を促す。
        System.out.print("xの値：");
        // 最初の値を保持する変数を宣言し、入力された数値を代入する。
        int inputFirst = standardInput.nextInt();
        // 2番目の数値の入力を促す。
        System.out.print("yの値：");
        // 2番目の数値を保持する変数を宣言し、入力された数値を代入する。
        int inputSecond = standardInput.nextInt();
        // 3番目の数値の入力を促す。
        System.out.print("zの値：");
        // 3番目の数値を保持する変数を宣言し、入力された数値を代入する。
        int inputThird = standardInput.nextInt();

        // 3つの数値の合計を保持する変数を宣言し、加算した結果を代入する。
        int sumInputs = inputFirst + inputSecond + inputThird;
        // 3つの数値の平均を保持する型変数を宣言し、除算した結果を代入する。
        // 平均は実数として表示するため、定数である割る数を不動小数点型にする。
        double averageInputs = sumInputs / 3.0;
        // 合計を出力する。
        System.out.println("xとyとzの合計値は" + sumInputs + "です。");
        // 平均を出力する。
        System.out.println("xとyとzの平均値は" + averageInputs + "です。");
    }

}
