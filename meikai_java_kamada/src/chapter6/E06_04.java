/**
 * List 6-5を書き換えて、右に示すように縦向きの棒グラフで表示するプログラムを作成せよ。
 * 最下段には、インデックスを10で割った余剰を表示すること。
 */
package chapter6;

import java.util.Random;
import java.util.Scanner;

public class E06_04 {

    public static void main(String[] args) {
        // 乱数の最大値を定義する
        final int MAX_RANDOM = 10;
        // 乱数ジェネレーターを保持する変数を宣言し、初期化する。
        Random randomGenerator = new Random();
        // 標準入力ストリームから入力値を取り出すための変数を宣言し、初期化する。
        Scanner standardInput = new Scanner(System.in);
        // 要素数の入力を促す。
        System.out.print("要素数：");
        // 配列の要素数を格納する変数を宣言し、入力された要素数で初期化する。
        int arrayLength = standardInput.nextInt();
        // 入力された要素数の配列を生成し、配列変数intArray宣言してを初期化する。
        int[] intArray = new int[arrayLength];

        // 配列intArrayの値に、1~10の乱数を代入する。
        for (int i=0; i<=arrayLength-1; i++) {
            intArray[i] = 1 + randomGenerator.nextInt(MAX_RANDOM);
        }

        // 配列intArrayの値に代入された乱数の最大値の数だけ行を作成する。
        // （行番号が上から乱数の最大値から始まり最小値で終わるようにする）
        for (int i=MAX_RANDOM; i>0; i--) {
            // 配列intArrayの要素数の数だけ、1行の中に✴︎か空白を表示する。
            for (int j=0; j<arrayLength; j++) {
                if (intArray[j] >= i) {
                    // 配列intArrayの値が行番号以上であれば、*を表示する
                    System.out.print("*");
                } else {
                    // 配列intArrayの値が行番号より小さければ、空白にする
                    System.out.print(" ");
                }
            }
            // 改行して次の行を描画する。
            System.out.println();
        }

        // 区切り線を表示する
        for (int i=0; i<arrayLength; i++) {
            System.out.print("-");
        }
        System.out.println();

        // インデックス番号を表示する。
        for (int i=0; i<arrayLength; i++) {
            System.out.print(i % 10);
        }
        System.out.println();

    }

}
