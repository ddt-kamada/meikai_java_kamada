/**
 * 配列aの全要素を配列bに対して逆順にコピーするプログラムを作成せよ。
 * なお、二つの配列の要素数は同一であると仮定してよい。
 */
package chapter6;

import java.util.Scanner;

public class E06_13 {

    public static void main(String[] args) {
        // 標準入力ストリームから入力値を取り出すための変数を宣言し、初期化する。
        Scanner standardInput = new Scanner(System.in);

        // 要素数が0以下にならないようにするため、要素数を保持する変数をdo文の外で宣言し0で初期化する。
        int inputNumber = 0;
        do {
            // 要素数の入力を促す。
            System.out.print("要素数：");
            // 入力された数値を変数に代入する。
            inputNumber = standardInput.nextInt();
        } while (inputNumber <= 0);

        // 順番通りの配列を保持する変数を宣言し、入力された要素数のint型の配列を生成して代入する。
        int[] arrayInOrder = new int[inputNumber];
        // 逆順の配列を保持する変数を宣言し、入力された要素数のint型の配列を生成して代入する。
        int[] arrayReverse = new int[inputNumber];

        // 順番通りの配列の値の入力を促し、代入する。
        for (int i=0; i<inputNumber; i++) {
            System.out.print("a[" + i + "] = ");
            arrayInOrder[i] = standardInput.nextInt();
        }

        // 順番通りの配列の先頭からi番目の値を、逆順の配列の末尾からi番目の値に代入していく。
        for (int i=0; i<inputNumber; i++) {
            int targetValue = arrayInOrder[i];
            arrayReverse[(inputNumber- 1) - i] = targetValue;
        }

        // 配列のコピーが完了した旨を表示する。
        System.out.println("配列aを逆順に配列にコピーしました。");

        // 逆順の配列を表示する。
        for (int i=0; i<inputNumber; i++) {
            System.out.println("b[" + i + "] = " + arrayReverse[i]);
        }

    }

}
