/*
 * 月を1〜12の整数値として読み込んで、それに対応する季節を表示するプログラムを作成せよ。
 */

package chapter_3;

import java.util.Scanner;

public class E03_18 {

    public static void main(String[] args) {
     // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 月の整数の入力を促す。
        System.out.print("月を整数で入力してください：");
        // 入力された整数を変数inputMonthに格納する。
        int inputMonth = standardInput.nextInt();

        // 変数inputMonthの値を評価して対応する季節を文字列で出力し、終了する。
        switch (inputMonth) {
            case 3 :
            case 4 :
            case 5 : System.out.print("春");
                     break;
            case 6 :
            case 7 :
            case 8 : System.out.print("夏");
                     break;
            case 9 :
            case 10 :
            case 11 : System.out.print("秋");
                      break;
            case 12 :
            case 1 :
            case 2 : System.out.print("冬");
                      break;
            // 入力された値が1〜12の整数値でない場合は、エラーメッセージを表示する。
            default: System.out.print("1〜12の整数が入力されていません。");
                     break;
        }

    }

}
