/**
 * List 5-9のように、float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と、
 * List 5-10のように、int型の変数を0から1000までインクリメントした値1000で割った値を求める様子を、
 * 横に並べて表示するプログラムを作成せよ。
 *
 *     float        int
 *   0.0000000   0.0000000
 *   0.0010000   0.0010000
 *   0.0020000   0.0020000
 *        --- 中略 ---
 *   0.9989907   0.9990000
 *   0.9999907   1.0000000
 */
package chapter5;

public class E05_06 {

    public static void main(String[] args) {
        System.out.println("  float         int   ");
        System.out.println("----------------------");

        // 0.01ずつ増える実数を保持する変数と、1ずつ増える整数を保持する変数を定義し、
        // 0.01ずつ増える実数が1.0以下のあいだ、同時に繰り返し処理を行う。
        for (float increaseFloat=0.0F, increaseInt=0; increaseFloat<=1.0F; increaseFloat+=0.001F, increaseInt++) {

            // 1ずつ増える整数を1000で割り、整数から浮動小数を求める。
            float floatByInt = (float) increaseInt / 1000;

            // 0.01ずつ増える実数と、1ずつ増える整数から求めた実数を表示する。
            System.out.printf("%8.7f    %8.7f", increaseFloat, floatByInt);
            System.out.println();
        }

    }

}
