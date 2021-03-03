/*
 * 合計だけでなく平均も求めるようにList4-17(p.126)およびList4-18(p.127)のプログラムを書き換えよ。
 */
package chapter4;

import java.util.Scanner;

public class E04_25_2 {

    public static void main(String[] args) {
        // List4-18の書き換え

        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 整数を加算する個数を保持する変数を宣言する。
        int inputNumber;
        do {
            // ユーザーに整数を加算する個数の入力を促す。
            System.out.println("整数を加算します。");
            System.out.print("何個加算しますか：");
            // 入力された加算する個数を変数に格納する。
            inputNumber = standardInput.nextInt();
        } while (inputNumber <= 0); // 加算する個数として入力された数が1以下の場合、繰り返し入力を促す。

        // 合計値を保持する変数を宣言し、0で初期化する。
        int numberSum = 0;
        // 実際に加算処理を行った回数を保持する変数を宣言し、0で初期化する。
        int addCount = 0;
        // 平均値を保持する変数を宣言し、0で初期化する。
        int numberAverage = 0;
        // 入力された回数分、ユーザーに整数を入力してもらい加算する。
        for (int i=0; i<inputNumber; i++) {
            // 加算する数の入力を促し、変数に格納する。
            System.out.print("整数：");
            int numberAdd = standardInput.nextInt();
            // 入力された数が0の場合、繰り返し処理を終了する。
            if (numberSum + numberAdd > 1000) {
                // 合計値が1000を超えたため、今回入力された数値は加算されない旨を出力する。
                System.out.println("合計が1000を超えました。");
                System.out.println("最後の数値は無視します。");
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
        System.out.println("平均は" + numberAverage + "です。");

    }

}
