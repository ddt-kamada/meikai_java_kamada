/**
 * 二つの整数値を読み込んで、それらの値の差を表示するプログラムを作成せよ。
 */

package chapter_3;

import java.util.Scanner;

public class E03_10 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 整数の入力を促す。
        System.out.print("整数を入力してください。：");
        // 最初に入力された整数を変数integerFirstに格納する。
        int integerFirst= standardInput.nextInt();
        // 次の整数の入力を促す。
        System.out.print("次の整数を入力してください。：");
        // 2番目に入力された整数を変数integerSecondに格納する。
        int integerSecond = standardInput.nextInt();
        // 変数integerFirstと変数integerSecondを比べて大きい方から小さい方を引いた値を生成し、変数differenceFirstAndSecondに格納する。
        int differenceFirstAndSecond = integerFirst > integerSecond ? integerFirst - integerSecond : integerSecond - integerFirst;
        // 変数differenceを出力する。
        System.out.println("最初の整数と次の整数の差は" + differenceFirstAndSecond + "です。");
    }

}
