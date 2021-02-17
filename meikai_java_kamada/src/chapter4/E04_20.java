/**
 * n段の正方形を表示するプログラムを作成せよ。
 * 下に示すのは、nが3の時の実行結果である。
 *
 *    ***
 *    ***
 *    ***
 */
package chapter4;

import java.util.Scanner;

public class E04_20 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);

        // 正方形の段数の入力を促す。
        System.out.print("段数は：");
        // 入力された段数を変数に格納する。
        int stepNumber = standardInput.nextInt();

        // 垂直方向の1辺に表示される個数が入力された段数になるまで、改行を行う。
        for (int i=1; i<=stepNumber; i++) {
            // 水平方向の1辺に表示される個数が入力された段数と同じになるまで、繰り返し*を出力する。
            for (int j=1; j<=stepNumber; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}
