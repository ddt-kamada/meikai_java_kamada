/**
 * 右に示すように、二つの整数値を読み込んで、それらの値の差が10以下であれば、『それらの差は10以下です。』と表示し、
 * そうでなければ『それらの差は11以上です。』と表示するプログラムを作成せよ。
 *
 * 整数A：4
 * 整数B：12
 * それらの差は10以下です
 */

package chapter_3;

import java.util.Scanner;

public class E03_11 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 最初の変数の入力を促す。
        System.out.print("整数A：");
        // 入力された整数値を変数integerFirstに格納する。
        int integerFirst = standardInput.nextInt();
        // 次の整数値の入力を促す。
        System.out.print("整数B：");
        // 次に入力された整数値を変数integerSecondに格納する。
        int integerSecond = standardInput.nextInt();
        // 入力された二つの整数を比べる際の基準値を定数に格納する。
        final int REFERENCE_VALUE = 11;
        // 出力される答の中で、入力された二つの整数を比べると変化する値を定数に格納する。
        final String ANSWER_MORE_THAN = "11以上";
        final String ANSWER_LESS_THAN = "10以下";
        /* 入力された二つの整数を比べて大きい方から小さい方を引いた差が、
        基準値以上であれば変数answerMoreThanを、基準値より小さければ変数answerLessThanを返して出力する。 */
        System.out.println("それらの差は"
                    + (integerFirst > integerSecond
                            ? ((integerFirst - integerSecond) >= REFERENCE_VALUE ? ANSWER_MORE_THAN : ANSWER_LESS_THAN)
                            : ((integerSecond - integerFirst) >= REFERENCE_VALUE ? ANSWER_MORE_THAN : ANSWER_LESS_THAN)
                    ) + "です。");
    }

}
