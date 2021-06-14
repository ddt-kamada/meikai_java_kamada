/**
 * 月を１〜１２の数値として表示して、その英語表現を入力させる英単語学習プログラムを作成せよ。
 * ・出題する月の値は乱数で生成する。
 * ・学習者が望む限り、何度も繰り返せる。
 * ・同一月を連続して出題しない
 * 文字列s1とs2が等しい（すべての文字が等しい）かどうかの判定は、s1.equals(s2)によって行える（p.490）。
 */
package chapter6;

import java.util.Random;
import java.util.Scanner;

public class E06_14 {

    public static void main(String[] args) {
        // 標準入力ストリームから入力値を取り出すための変数を宣言し、初期化する。
        Scanner standardInput = new Scanner(System.in);
        // 乱数ジェネレータを保持する変数を宣言し、初期化する。
        Random randomGenerator = new Random();
        // 月の名前を定数の配列で定義する。
        final String[] monthString = {
                "January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"
        };

        System.out.println("英語の月名を入力してください。");
        System.out.println("なお、先頭は大文字で、２文字目以降は小文字とします。");

        // 問題を繰り返し解くか否かの情報を保持する変数を宣言し、0（繰り返さない）で初期化する。
        int doRepeat = 0;
        // 同一月を連続して出題させないため、出題される月の数を保持する変数を宣言し、0（存在しない月）で初期化する。
        int targetMonth = 0;
        do {
            // 新しく生成する月の数を保持する変数を宣言する。
            int newMonth;
            do {
                // 1〜12の乱数を生成し、変数に代入する。
                newMonth = randomGenerator.nextInt(12) + 1;
            } while (targetMonth == newMonth); // 前回出題された月と新しく生成された月の数が等しければ、乱数を生成し直す。
            // 出題される月の数を更新する。
            targetMonth = newMonth;

            // 回答が正解かを示す変数を宣言し、不正解で初期化する。
            boolean isCorrect = false;
            do {
                // 問題を出題する。
                System.out.print(targetMonth + "月：");
                // 解答された月名を保持する変数を宣言し、代入する。
                String answerMonthString = standardInput.next();
                // 当てるべき月の名前と入力された月の名前が等しければ、正解の旨を表示する。
                if (answerMonthString.equals(monthString[targetMonth - 1])) {
                    // 回答状態を正解にする。
                    isCorrect = true;
                    System.out.print("正解です。");
                } else {
                    // 回答が不正解である旨を表示する。
                    System.out.println("違います。");
                }
            } while (!isCorrect); // 回答が不正解の間、繰り返し月の名前を入力させ、正否を判定する。
            // 回答が正解であれば、もう一度問題を解くか尋ねる。
            System.out.print("もう一度？ 1...Yes/0...No：");
            // 入力された値を変数に代入する。
            doRepeat = standardInput.nextInt();
        } while (doRepeat == 1); // 「もう一度」が選択される間、繰り返し出題する。
    }

}
