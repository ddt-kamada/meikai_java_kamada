/**
 * 曜日を表示して、その英語表現を入力させる英単語学習プログラムを作成せよ。
 * ・出題する曜日は乱数で生成する。
 * ・学習者が望む限り、何度も繰り返せる。
 * ・同一曜日を連続して出題しない。
 */
package chapter6;

import java.util.Random;
import java.util.Scanner;

public class E06_15 {

    public static void main(String[] args) {
        // 乱数ジェネレータを保持する変数を宣言し、初期化する。
        Random randomGerenator = new Random();
        // 標準入力ストリームから入力値を取り出すための変数を宣言し、初期化する。
        Scanner standardInput = new Scanner(System.in);
        // 英語の曜日名の配列を定数で定義する。
        final String[] dayStringsEnglish = {
                "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"
        };
        // 日本語の曜日名の配列を定数で定義する。
        final String[] dayStringsJapanese = {
                "日曜日", "月曜日", "火曜日", "水曜日", "木曜日", "金曜日", "土曜日"
        };

        // 英語の曜日名の入力を促す。
        System.out.println("英語の曜日名を小文字で入力してください。");

        // もう一度問題を繰り返すか否かのフラグを保持する変数を宣言し、「繰り返さない」で初期化しておく。
        int doesRetry = 0;
        // 前回の問題の曜日の配列上のインデックスを保持する変数を宣言し、存在しないインデックスで初期化しておく。
        int previousDayIndex = -1;
        do {
            // 出題する曜日の配列上のインデックスを保持する変数を宣言する。
            int targetDayIndex;
            do {
                // 出題する曜日の配列のインデックスをランダムに生成する。
                targetDayIndex = randomGerenator.nextInt(7);
            } while (targetDayIndex == previousDayIndex);
            // 今回生成したランダムなインデックスと、前回の問題のインデックスが同じであれば、もう一度作り直す。

            // 回答の正否の情報を保持する変数を宣言し、不正解で初期化する。
            boolean isCorrect = false;
            do {
                // 問題の曜日を出題する。
                System.out.print(dayStringsJapanese[targetDayIndex] + "：");
                // 回答を変数に代入する。
                String inputDayString = standardInput.next();
                if (dayStringsEnglish[targetDayIndex].equals(inputDayString)) {
                    // 回答が正解の場合
                    // 回答の正否情報を「正解」にする。
                    isCorrect = true;
                    // 前回の問題の曜日のインデックスを保持する変数に、今回の問題の曜日のインデックスを代入する。
                    previousDayIndex = targetDayIndex;
                    // もう一度問題を解くか尋ねる。
                    System.out.println("正解です。もう一度？ 1...Yes/0...No : ");
                    // 入力された値を変数に代入する。
                    doesRetry = standardInput.nextInt();
                } else {
                    // 問題が不正解の場合、その旨を表示する。
                    System.out.println("違います。");
                }
            } while (!isCorrect); // 不正解の場合、正解するまで同じ問題を尋ねる。

        } while (doesRetry == 1); // もう一度問題を解くを選択されたら、新しい問題を出題する。
    }

}
