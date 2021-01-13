/**
 * 2桁の整数値（10〜99）を当てさせる《数当てゲーム》を作成せよ。
 */
package chapter4;

import java.util.Random;
import java.util.Scanner;

public class E04_02 {

    public static void main(String[] args) {
        // 乱数を生成するクラスのインスタンスを変数randomGeneratorに格納する。
        Random randomGenerator = new Random();
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);

        // 0〜89の乱数に10を足すことで10〜99の乱数を生成し、変数targetRandomに格納する。
        int targetRandom = randomGenerator.nextInt(90) + 10;

        System.out.println("数当てゲーム開始!!");
        System.out.println("10〜99の数を当ててください。");

        // ユーザーは何度も入力することがあるので、入力した整数を格納する変数userInputはdo文の外で宣言する。
        int userInput;
        do {
            // 整数の入力を促す。
            System.out.println("いくつかな：");
            // 入力された整数を変数userInputに代入する。
            userInput = standardInput.nextInt();
            // 入力された数値が当てるべき数より大きければ、もっと小さな数を入力するように促す。
            if (userInput > targetRandom) {
                System.out.println("もっと小さな数だよ。");
             // 入力された数値が当てるべき数より小さければ、もっと大きな数を入力するように促す。
            } else if (userInput < targetRandom) {
                System.out.println("もっと大きな数だよ。");
            }
        } while (userInput != targetRandom); // 入力された数値が当てるべき数でない間は、もう一度数値を入力させる。

        // 入力された数値が当てるべき数と等しければループが終了するので、問題に正解した旨を表示する。
        System.out.println("正解です。");

    }

}
