/**
 * 正の整数値を読み込んで、それが10の倍数であれば『その値は10の倍数です。』と表示し、
 * そうでなければ『その値は10の倍数ではありません。』と表示するプログラムを作成せよ。
 * ※正でない値を読み込んだ場合は、『正でない値が入力されました。』と表示すること。
 */

package chapter_3;

import java.util.Scanner;

public class E03_06 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 正の整数値の入力を促す。
        System.out.print("正の整数値:");
        // 入力された整数値を変数positiveIntegerに格納する。
        int positiveInteger = standardInput.nextInt();
        // 正の整数値が入力された場合
        if (positiveInteger > 0) {
            if (positiveInteger % 10 == 0) {
                // 入力された正の整数値が10で割り切れる場合
                System.out.println("その値は10の倍数です。");
            } else {
                // 入力された正の整数値が10で割り切れない場合
                System.out.println("その値は10の倍数ではありません。");
            }
        // 正でない整数値、または0が入力された場合場合
        } else {
            System.out.println("正でない値が入力されました。");
        }
    }

}
