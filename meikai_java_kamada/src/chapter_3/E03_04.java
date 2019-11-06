/*
 * 二つの変数a, bに値を読み込んで、その大小関係を以下のいづれかで表示するプログラムを作成せよ。
 * 『aのほうが大きいです。『bのほうが大きいです。』『aとbは同じ値です。』
 */
package chapter_3;

import java.util.Scanner;

public class E03_04 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 一つ目の整数値の入力を促す。
        System.out.print("a:");
        // 入力された整数値を変数integerAに格納する。
        int integerA = standardInput.nextInt();
        // 二つ目の整数値の入力を促す。
        System.out.print("b:");
        // 入力された整数値を変数integerBに格納する。
        int integerB = standardInput.nextInt();
        // integerAとintegerBの大きさを比較して結果を出力する。
        if (integerA > integerB) {
            System.out.println("aのほうが大きいです。");
        } else if (integerA < integerB) {
            System.out.println("bのほうが大きいです。");
        } else {
            System.out.println("aとbは同じ値です。");
        }
    }
}
