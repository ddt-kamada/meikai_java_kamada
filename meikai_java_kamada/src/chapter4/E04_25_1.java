/*
 * 合計だけでなく平均も求めるようにList4-17(p.126)およびList4-18(p.127)のプログラムを書き換えよ。
 */
package chapter4;

import java.util.Scanner;

public class E04_25_1 {

    public static void main(String[] args) {
        // List4-17の書き換え

        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // ユーザーに整数を加算する個数の入力を促す。
        System.out.println("整数を加算します。");
        System.out.print("何個加算しますか：");
        // 整数を加算する個数を変数に格納する。
        int inputNumber = standardInput.nextInt();

        // 合計値を保持する変数を宣言し、0で初期化する。
        int numberSum = 0;
        // 実際に加算処理を行った回数を保持する変数を宣言し、0で初期化する。
        int addCount = 0;
        // 平均値を保持する変数を宣言し、0で初期化する。
        int numberAverage = 0;
        // 入力された回数分、ユーザーに整数を入力してもらい加算する。
        for (int i=0; i<inputNumber; i++) {
            // 加算する数の入力を促し、変数に格納する。
            System.out.print("整数（0で終了）：");
            int numberAdd = standardInput.nextInt();
            // 入力された数が0の場合、繰り返し処理を終了する。
            if (numberAdd == 0) {
                break;
            }
            // 加算処理を行う。
            numberSum += numberAdd;
            // 加算を行った回数をカウントする。
            addCount++;
        }
        // 最終的な合計値と、加算を行った回数から平均値を計算する。
        numberAverage = numberSum / addCount;
        // 合計値を出力する。
        System.out.println("合計は" + numberSum + "です。");
        // 平均値を出力する。
        System.out.println("合計は" + numberAverage + "です。");

    }

}
