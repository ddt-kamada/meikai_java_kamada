/**
 * List6-9は探索するキー値と同じ値の要素が複数個存在する場合、最も先頭に位置する要素を見つけるプログラムである。
 * 最も末尾側に位置する要素を見つけるプログラムを作成せよ。
 */
package chapter6;

import java.util.Random;
import java.util.Scanner;

public class E06_07 {

    public static void main(String[] args) {
        // 乱数ジェネレーターを保持する変数を宣言し、初期化する。
        Random randomGenerator = new Random();
        // 標準入力ストリームから入力値を取り出すための変数を宣言し、初期化する。
        Scanner standardInput = new Scanner(System.in);

        // 配列の要素数を定数で定義する。
        final int ARRAY_LENGTH = 12;
        // 配列変数を宣言し、定数の要素数の配列を生成して初期化する。
        int[] intArray = new int[ARRAY_LENGTH];
        // 配列の要素数分繰り返し乱数を生成し、配列の要素にそれぞれ代入する。
        for (int j=0; j<ARRAY_LENGTH; j++) {
            intArray[j] = randomGenerator.nextInt(10);
        }

        // 配列の全要素数の値を表示する。
        System.out.print("配列aの全要素の値\n{ ");
        for (int j=0; j<ARRAY_LENGTH; j++) {
            System.out.print(intArray[j] + " ");
        }
        System.out.println("}");

        // 探す値の入力を促す。
        System.out.print("探す数値：");
        int targetValue = standardInput.nextInt();

        // for文の終了後に評価するため、for文の外で探す値のインデックスを保持する変数を宣言する。
        int targetIndex;
        // 配列を後方から線形探索する。
        for (targetIndex=ARRAY_LENGTH-1; targetIndex>0; targetIndex--) {
            if (intArray[targetIndex] == targetValue) {
                // 探索が成功したら繰り返しを終了する。
                break;
            }
        }

        if (targetIndex > 0) {
            // 探索が成功していたらインデックスを表示する。
            System.out.println("それはa[" + targetIndex + "]にあります。");
        } else {
            // 探索が失敗していたらインデックスが見つからない旨を表示する。
            System.out.println("それはありません。");
        }


    }

}
