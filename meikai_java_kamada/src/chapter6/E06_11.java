/**
 * 異なる要素が同じ値を持つことがないように演習6-9のプログラムを改良したプログラムを作成せよ。
 * たとえば{ 1, 3, 5, 6, 1, 2 }とならないようにすること（配列の要素数は10以下とする）
 */
package chapter6;

import java.util.Random;
import java.util.Scanner;

public class E06_11 {

    public static void main(String[] args) {
        // 乱数ジェネレータを保持する変数を宣言し、初期化する。
        Random randomGenerator = new Random();
        // 標準入力ストリームから入力値を取り出すための変数を宣言し、初期化する。
        Scanner standardInput = new Scanner(System.in);

        // 要素数が0以下もしくは11以上にならないように判定するため、要素数を保持する変数をdo文の外で宣言し0で初期化する。
        int arrayNumber = 0;
        do {
            // 要素数の入力を促す。
            System.out.print("要素数(10以下)：");
            // 入力された値を変数に代入する。
            arrayNumber = standardInput.nextInt();
        } while (arrayNumber <= 0 || arrayNumber >= 11);

        // 配列変数を宣言し、入力された素数のint型の配列を生成して初期化する。
        int[] intArray = new int[arrayNumber];
        // 生成された配の要素に、繰り返し値を代入する。
        for (int i=0; i<arrayNumber; i++) {
            if (i == 0) {
                // 配列の一つ目の要素では、生成した1〜10の乱数をそのまま代入する。
                intArray[i] = randomGenerator.nextInt(10) + 1;
            } else {
                // 配列の要素が重複しているかのフラグを作成する。
                boolean isDuplicated;
                // 乱数を保持する変数を宣言する。
                int randomValue;
                // 重複フラグが真である間、繰り返し乱数の生成と重複チェック
                do {
                    // 乱数を保持する変数に、1〜10の乱数を生成して代入する。
                    randomValue = randomGenerator.nextInt(10) + 1;
                    // 重複フラグを偽にする。
                    isDuplicated = false;
                    // 配列を走査する。
                    for (int j=0; i<arrayNumber; j++) {
                        // 値を代入する前の配列要素の値は全て0なので、重複チェックを行わない。
                        if (j > i) {
                            break;
                        }
                        // 着目した要素の値と生成した乱数が等しければ、重複フラグを真にする。
                        if (intArray[j] == randomValue) {
                            isDuplicated = true;
                            // 重複していることが分かったら繰り返しを終了する。
                            break;
                        }
                    }
                } while (isDuplicated);
                // 乱数を配列要素に代入する。
                intArray[i] = randomValue;
            }
        }

        // 確認のため、配列の各値を表示する。
        System.out.print("intArray = {");
        for (int value : intArray) {
            System.out.print(" " + value);
        }
        System.out.print(" }");

    }

}
