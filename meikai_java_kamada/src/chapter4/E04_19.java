/**
 * 季節を求めるList4-1(p.95)の月の読み込みにおいて、1〜12以外の値が入力された場合は、
 * 再入力させるように修正したプログラムを作成せよ。
 * （do文の中にdo文が入る二重ループとなる。）
 */
package chapter4;

import java.util.Scanner;

public class E04_19 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);

        int doesRetry;
        do {
            int inputMonth;
            // 月の数字の入力を促す。
            do {
                System.out.print("季節を求めます。\n何月ですか？：");
                inputMonth = standardInput.nextInt();
            } while (inputMonth < 1 || inputMonth > 12); // 入力された月が1~12以外の間、繰り返し再入力を促す。

            // 入力された月に応じて、季節を出力する。
            if (inputMonth >= 3 && inputMonth <= 5) {
                System.out.println("それは春です。");
            } else if (inputMonth >= 6 && inputMonth <= 8) {
                System.out.println("それは夏です。");
            } else if (inputMonth >= 9 && inputMonth <= 11) {
                System.out.println("それは秋です。");
            } else if (inputMonth == 12 || inputMonth == 1 || inputMonth == 2) {
                System.out.println("それは冬です。");
            }

            // 季節の判定をもう一度行うかユーザーに問い合わせる。
            System.out.print("もう一度? 1...Yes/0...No:");
            // もう一度行うかを変数doesRetryに読み込む。
            doesRetry = standardInput.nextInt();
        } while (doesRetry == 1); // もう一度行う選択がされる限り、繰り返し季節の判定を行う。

    }

}
