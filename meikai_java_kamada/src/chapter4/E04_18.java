/**
 * 下に示すように、1からnまでの整数値の2乗値を表示するプログラムを作成せよ。
 *
 * nの値：3
 * 1の2乗は1
 * 2の2乗は4
 * 3の2乗は9
 */
package chapter4;

import java.util.Scanner;

public class E04_18 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        System.out.print("nの値：");
        // 入力された値を変数に格納する。
        int inputNumber = standardInput.nextInt();
        // 1から始めてインクリメントしながら、入力された値になるまで2乗値を出力する。
        for (int i=1; i<=inputNumber; i++) {
            int squareNumber = i * i;
            System.out.println(i + "の2乗は" + squareNumber);
        }
    }

}
