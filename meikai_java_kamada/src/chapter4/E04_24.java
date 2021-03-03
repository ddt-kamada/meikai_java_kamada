/**
 * 正の整数値を読み込み、それが素数であるかを判定するプログラムを作成せよ。
 * 素数とは、2以上n未満のいずれの数でも割り切ることのできない整数nのことである。
 */
package chapter4;

import java.util.Scanner;

public class E04_24 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);

        // ユーザーに正の整数の入力を促す。
        System.out.println("正の整数が素数であるか判定します。");
        System.out.print("正の整数：");
        // 入力された正の整数を保持する変数を宣言し、代入する。
        int inputNumber = standardInput.nextInt();
        // 入力された値が素数であるかの判定を保持する変数を宣言し、素数であることを初期値にする。
        boolean isPrimeNumber = true;

        // 2から始めて入力された値未満の間、入力された値を割り切れるか判定する。
        for (int i=2; i<inputNumber; i++) {
            // 入力された値が割り切れた時、素数ではないと判定し、繰り返しを終了する。
            if (inputNumber % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        // 入力された値が素数であるかどうかを出力する。
        if (isPrimeNumber == true) {
            System.out.println("この正の整数は素数です。");
        } else {
            System.out.println("この正の整数は素数ではありません。");
        }

    }

}
