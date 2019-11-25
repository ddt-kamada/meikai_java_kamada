/**
 * キーボードから読み込んだ点数に応じて、優/量/可/不可を判定して表示するプログラムを作成せよ。
 * 判定は以下のように行うこと。
 * 0〜59 → 不可 / 60〜69 → 可 / 70〜79 → 良 / 80〜100 → 良
 */

package chapter_3;

import java.util.Scanner;

public class E03_08 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 点数の入力を促す。
        System.out.print("点数:");
        // 入力された整数値を変数scoreに格納する。
        int score = standardInput.nextInt();
        // 点数が0以上59以下の場合
        if (score >= 0 && score <= 59) {
            System.out.println("不可");
        // 点数が60以上69以下の場合
        } else if (score >= 60 && score <= 69) {
            System.out.println("可");
        // 点数が70以上79以下の場合
        } else if (score >= 70 && score <= 79) {
            System.out.println("良");
        // 上記以外の点数（80点以上）
        } else {
            System.out.println("優");
        }
    }

}
