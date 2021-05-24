/**
 * 配列の要素の並びをシャッフルする（ランダムな順となるようにかき混ぜる）プログラムを作成せよ。
 */
package chapter6;

import java.util.Random;
import java.util.Scanner;

public class E06_12 {

    public static void main(String[] args) {
        // 乱数ジェネレータを保持する変数を宣言し、初期化する。
        Random randomGenerator = new Random();
        // 標準入力ストリームから入力値を取り出すための変数を宣言し、初期化する。
        Scanner standardInput = new Scanner(System.in);

        // 要素数が0以下にならないようにするため、要素数を保持する変数をdo文の外で宣言し0で初期化する。
        int arrayNumber = 0;
        do {
            // 要素数の入力を促す。
            System.out.print("要素数：");
            // 入力された値を変数に代入する。
            arrayNumber = standardInput.nextInt();
        } while (arrayNumber <= 0);

        // シャッフルされる配列の変数を宣言し、入力された要素数のint型の配列を生成して初期化する。
        int[] beforeShuffleArray = new int[arrayNumber];
        // 配列の要素数分、繰り返し値に1~10の乱数を代入する。
        for (int i=0; i<arrayNumber; i++) {
            beforeShuffleArray[i] = randomGenerator.nextInt(10) + 1;
        }

        // シャッフル前の配列の各値を表示する。
        System.out.print("シャッフル前の配列 = {");
        for (int value : beforeShuffleArray) {
            System.out.print(" " + value);
        }
        System.out.print(" }");

        System.out.println();

        // 配列をシャッフルするためのランダムなインデックスを保持する配列変数を宣言し、入力された要素数のint型の配列を生成して初期化する。
        int[] randomIndexArray = new int[arrayNumber];
        // 配列の一つ目の要素には、0から配列の要素数-1までの乱数を生成して代入する。
        randomIndexArray[0] = randomGenerator.nextInt(arrayNumber);
        // ランダムなインデックスを保持する配列の要素が、前に代入した要素と重複していないかチェックしながら繰り返し値を代入する。
        for (int i=0; i<arrayNumber; i++) {
            // 配列の要素が重複しているかのフラグを宣言する。
            boolean isDuplicated;
            // ランダムなインデックスを保持する変数を宣言する。
            int randomValue;
            // 重複フラグが真である間、繰り返し乱数の生成と重複チェックを行う。
            do {
                // ランダムなインデックスを保持する変数に、0から配列の要素数-1までの乱数を生成して代入する。
                randomValue = randomGenerator.nextInt(arrayNumber);
                // 重複フラグを偽にする。
                isDuplicated = false;
                // 配列を走査する。(代入前の値は全て0なので、代入済みの値のみ走査する。)
                for (int j=0; j<i; j++) {
                    // 着目した要素の値と生成した乱数が等しければ、重複フラグを真にする。
                    if (randomIndexArray[j] == randomValue) {
                        isDuplicated = true;
                        // 重複していることが分かったら繰り返しを終了する。
                        break;
                    }
                }
            } while (isDuplicated);
            // 乱数を配列要素に代入する。
            randomIndexArray[i] = randomValue;
        }

        // シャッフル後の配列の変数を宣言し、入力された要素数のint型の配列を生成して初期化する。
        int[] afterShuffleArray = new int[arrayNumber];
        // シャッフル後の配列の要素数分、繰り返し値を代入する。
        for (int k=0; k<arrayNumber; k++) {
            // 走査で着目している要素のインデックスと同じインデックスの要素を乱数配列から取得し、変数に代入する。
            int randomIndex = randomIndexArray[k];
            // シャッフル前の配列からランダムなインデックスの要素を取得し、シャッフル後の配列の要素に代入する。
            afterShuffleArray[k] = beforeShuffleArray[randomIndex];
        }

        // シャッフル後の配列の各値を表示する。
        System.out.print("シャッフル後の配列 = {");
        for (int value : afterShuffleArray) {
            System.out.print(" " + value);
        }
        System.out.print(" }");
    }

}
