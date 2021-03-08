/**
 * List4-3(p.98)の数当てゲームのプレーヤが入力できる回数に制限を設けたプログラムを作成せよ。
 * 制限回数内に当てられなかった場合は、正解を表示してゲームを終了すること。
 */
package chapter4;

import java.util.Random;
import java.util.Scanner;

public class E04_27 {

    public static void main(String[] args) {
        // 制限回数を定数で定義する。
        final int limitNumber = 5;
        // 乱数ジェネレータを作成し、変数に代する。
        Random randomGenerator = new Random();
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 当てるべき数を0〜99の乱数で生成する
        int targetNumber = randomGenerator.nextInt(100);

        // 数当てゲームの開始と制限回数、当てるべき数の下限と上限を表示する。
        System.out.println("数当てゲーム開始！！");
        System.out.println(limitNumber + "回以内に、0〜99の数を当ててください。");

        // ユーザーに入力された整数を保持する変数を宣言する。
        int inputNumber;
        // ユーザーが回答した回数を保持する変数を宣言し、0で初期化する。
        int answerCount = 0;
        do {
            // ユーザーに整数の入力を促す。
            System.out.print("いくつかな：");
            // 入力された数を変数に代入する。
            inputNumber = standardInput.nextInt();

            if (inputNumber > targetNumber) {
                // 入力された数が当てるべき数より大きければ、より小さな数字を入力するように促す。
                System.out.println("もっと小さな数字だよ。");
            } else if (inputNumber < targetNumber) {
                // 入力された数が当てるべき数より小さければ、より大きな数字を入力するように促す。
                System.out.println("もっと大きな数字だよ。");
            }

            // 回答した回数を1増やす。
            answerCount++;
            if (answerCount == limitNumber) {
                break;
            }
        } while (inputNumber != targetNumber); // 入力された数が不正解であれば、ユーザーに再び回答させる。

        if (inputNumber == targetNumber) {
            // 入力された数が正しければ、その旨を表示する。
            System.out.println("正解です。");
        } else {
            // 入力された数が不正解であれば、正解を表示する。
            System.out.println("制限回数に達しました。");
            System.out.println("正解は" + targetNumber + "です。");
        }

    }

}
