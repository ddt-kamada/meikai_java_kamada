/**
 * 連続する要素が同じ値を持つことのないように演習6-9のプログラムを改良せよ。
 * たとえば {1, 3, 5, 5, 3, 2} とならないようにすること。
 */
package chapter6;

import java.util.Random;
import java.util.Scanner;

public class E06_10 {

    public static void main(String[] args) {
        // 乱数ジェネレータを保持する変数を宣言し、初期化する。
        Random randomGenerator = new Random();
        // 標準入力ストリームから入力値を取り出すための変数を宣言し、初期化する。
        Scanner standardInput = new Scanner(System.in);

        // 要素数が0以下にならないように判定するため、要素数を保持する変数をdo文の外で宣言し0で初期化する。
        int arrayNumber = 0;
        do {
            // 要素数の入力を促す。
            System.out.print("要素数：");
            // 入力された値を変数に代入する。
            arrayNumber = standardInput.nextInt();
        } while (arrayNumber <= 0);

        // 配列変数を宣言し、入力された要素数のint型の配列を生成して初期化する。
        int[] intArray = new int[arrayNumber];
        // 配列の要素数分、繰り返し値に乱数を代入する。
        for (int i=0; i<arrayNumber; i++) {
            // 乱数を保持する変数を宣言し、1〜10の乱数を生成して初期化する。
            int randomValue = randomGenerator.nextInt(10) + 1;
            // 配列の先頭の値は生成した乱数をそのまま使用する。
            if (i != 0) {
                // 2番目以降の値は、1つ前の値と乱数が等しい間は、乱数を新しく生成する。
                do {
                    randomValue = randomGenerator.nextInt(10) + 1;
                } while (intArray[i-1] == randomValue);
            }
            // 乱数を配列の値に代入する。
            intArray[i] = randomValue;
        }

        // 確認のため、配列の各値を表示する。
        System.out.print("intArray = {");
        for (int value : intArray) {
            System.out.print(" " + value);
        }
        System.out.print(" }");

    }

}
