/**
 * double型の配列の全要素の合計値と平均値を求めるプログラムを作成せよ。
 * 要素数と全要素の値はキーボードから読みこむこと。
 */
package chapter6;

import java.util.Scanner;

public class E06_08 {

    public static void main(String[] args) {
        // 標準入力ストリームから入力値を取り出すための変数を宣言し、初期化する。
        Scanner standardInput = new Scanner(System.in);

        // 要素数が0以下にならないように判定するため、do文の外で要素数を保持する変数を宣言し0で初期化する。
        int arrayNumber = 0;
        do {
            // 要素数の入力を促す。
            System.out.print("要素数：");
            // 入力された値を変数に代入する。
            arrayNumber = standardInput.nextInt();
        } while (arrayNumber <= 0);

        // 配列変数を宣言し、入力された要素数のdouble型の配列を作成して初期化する。
        double[] doubleArray = new double[arrayNumber];
        // 要素数の数だけ繰り返し入力を促し、それぞれの要素に値を代入する。
        for (int i=0; i<arrayNumber; i++) {
            System.out.print(i + "番の値：");
            doubleArray[i] = standardInput.nextDouble();
        }

        // 配列の要素の合計値を保持する変数を宣言し、0で初期化する。
        double arraySummary = 0;
        // 配列を走査して値を足していく。
        for (double arrayValue : doubleArray) {
            arraySummary += arrayValue;
        }

        // 全要素の合計値と平均値を表示する。
        System.out.println("全要素の合計値は" + arraySummary + "です。");
        System.out.println("全要素の平均値は" + (arraySummary / arrayNumber) + "です。");

    }

}
