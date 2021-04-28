/*
 * 配列の要素数と、個々の要素の値を読み込んで、下のように各要素の値を表示するプログラムを作成せよ。
 * 表示の形式は、初期化子と同じ形式、すなわち、各要素の値をコンマで区切って{}で囲んだ形式とすること。
 *
 * 要素数：3
 * a[0] = 5
 * a[1] = 7
 * a[2] = 8
 * a = { 5, 7, 8 }
 */
package chapter6;

import java.util.Scanner;

public class E06_05 {

    public static void main(String[] args) {
        // 標準入力ストリームから入力値を取り出すための変数を宣言し、初期化する。
        Scanner standardInput = new Scanner(System.in);

        // 配列の要素数を格納する変数を宣言する。
        int arrayLength;
        do {
            // 要素数の入力を促す。
            System.out.print("要素数：");
            // 入力された要素数を代入する。
            arrayLength = standardInput.nextInt();
        } while (arrayLength < 0); // 入力された要素数が負の値の間、繰り返し要素数の入力を促す。

        // 要素型がint型の配列を保持する変数を宣言し、入力された要素数の配列を生成して初期化する。
        int[] intArray = new int[arrayLength];

        // 生成された配列の要素数だけ繰り返し値を入力する。
        for (int i=0; i<arrayLength; i++) {
            System.out.print("a[" + i + "]：");
            // 入力された値を配列の値に代入する。
            intArray[i] = standardInput.nextInt();
        }

        // 初期化子と同じ形式で配列を表示する。
        System.out.print("a = { ");
        // 生成された配列の要素数だけ繰り返し値を表示する。
        for (int i=0; i<arrayLength; i++) {
            // 配列の最初の値以外では、前にコンマを表示する。
            if (i != 0) {
                System.out.print(", ");
            }
            // 配列の値を表示する。
            System.out.print(intArray[i]);
        }
        // 初期化子の閉タグを表示する。
        System.out.print(" }");

    }

}
