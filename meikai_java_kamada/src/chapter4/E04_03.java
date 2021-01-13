/*
 * 下に示すように、二つの整数値を読み込んで、小さい方の数以上で
 * 大きいほうの数以下の全整数を小さいほうから順に表示するプログラムを作成せよ。
 * 整数A：37
 * 整数B：28
 * 28 29 30 31 32 33 34 35 36 37
 */
package chapter4;

import java.util.Scanner;

public class E04_03 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 最初の整数の入力を促す。
        System.out.print("整数A：");
        // 入力された整数を変数inoutFirstに格納する。
        int inputFirst = standardInput.nextInt();
        // 次の整数の入力を促す。
        System.out.print("整数B：");
        // 入力された整数を変数inputSecondに格納する。
        int inputSecond = standardInput.nextInt();
        // 出力する整数を格納する変数を宣言する。
        int answerInteger;
        // 出力する整数中の最大値を格納する変数を宣言する。
        int answerMax;
        // 入力された整数で小さいほうをanswerIntegerに、大きい方をanswerMaxに格納する。
        if (inputFirst < inputSecond) {
            answerInteger = inputFirst;
            answerMax = inputSecond;
        } else {
            answerInteger = inputSecond;
            answerMax = inputFirst;
        }
        do {
            // answerIntegerを出力してインクリメントする。
            System.out.print(answerInteger++);
            // 余白を出力する。
            System.out.print(' ');
        } while (answerInteger <= answerMax); // 出力した整数が最大値以下の間、整数の出力を繰り返す。
    }

}
