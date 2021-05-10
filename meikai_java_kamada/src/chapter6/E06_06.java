/**
 * テストの点数の合計点・平均点・最高点・最低点を表示するプログラムを作成せよ。
 * 人数と点数はキーボードから読み込むこと。
 */
package chapter6;

import java.util.Scanner;

public class E06_06 {

    public static void main(String[] args) {
        // 標準入力ストリームから入力値を取り出すための変数を宣言し、初期化する。
        Scanner standardInput = new Scanner(System.in);
        // テストの点数を入力する人数を保持する変数を宣言し、初期化する。
        int numberOfPeople = 0;
        do {
            // 人数の入力を促す。
            System.out.print("人数：");
            // 入力された人数を変数に代入する。
            numberOfPeople = standardInput.nextInt();
        } while (numberOfPeople <= 0); // 0以下の人数が入力されないようにする。
        // テストの点数を保持する配列変数を宣言し、入力された人数の要素数をもつ配列を作成して初期化する。
        int[] testScores = new int[numberOfPeople];
        // 合計点を保持する変数を宣言し、0で初期化する。
        int totalScore = 0;
        // それぞれの点数の入力を促す。
        System.out.println(numberOfPeople + "人の点数を入力せよ。");
        for (int i=0; i<numberOfPeople; i++) {
            System.out.print((i + 1) + "番の点数：");
            // テストの点数を保持する配列変数の値に、入力された点数を代入する。
            testScores[i] = standardInput.nextInt();
            // 合計点に入力された点数を加算する。
            totalScore += testScores[i];
        }

        // 最高点を保持する変数を宣言し、テストの点数の配列の最初の値で初期化する。
        int maxScore = testScores[0];
        // テストの点数の配列を捜査し、より高い点数を変数に代入する。
        for (int i=1; i<numberOfPeople; i++) {
            if (maxScore < testScores[i]) {
                maxScore = testScores[i];
            }
        }

        // 最低点を保持する変数を宣言し、テストの点数の配列の最初の値で初期化する。
        int minScore = testScores[0];
        // テストの点数の配列を捜査し、より低い点数を変数に代入する。
        for (int i=1; i<numberOfPeople; i++) {
            if (minScore > testScores[i]) {
                minScore = testScores[i];
            }
        }

        // 合計点・平均点・最高点・最低点を表示する。
        System.out.println("合計点は" + totalScore + "です。");
        System.out.printf("平均点は%.1fです\n", (double) totalScore / numberOfPeople);
        System.out.println("最高点は" + maxScore + "です");
        System.out.println("最低点は" + minScore + "です");

    }

}
