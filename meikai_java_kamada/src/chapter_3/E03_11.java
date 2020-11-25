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
        System.out.print("最初の整数を入力してください。：");
        // 入力された整数値を変数integerFirstに格納する。
        int integerFirst = standardInput.nextInt();
        // 次の整数値の入力を促す。
        System.out.print("次の整数を入力してください。：");
        // 次に入力された整数値を変数integerSecondに格納する。
        int integerSecond = standardInput.nextInt();
        /* 入力された二つの整数を比べて大きい方から小さい方を引いた差が、
           11以上であれば文字列"11以上"を、10以下であれば文字列"10以下"を変数differenceFirstAndSecondに格納する。 */
        String differenceFirstAndSecond = integerFirst > integerSecond
                        ? ((integerFirst - integerSecond) > 10 ? "11以上" : "10以下")
                        : ((integerSecond - integerFirst) > 10 ? "11以上" : "10以下");
        // 変数differenceFirstAndSecondを出力する。
        System.out.println("それらの差は" + differenceFirstAndSecond + "です。");

    }

}
