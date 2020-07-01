// 演習2_9 以下に示すプログラムを作成せよ（実数値の乱数の生成にはnextDouble()を使うこと）
// ・0.0以上1.0未満の実数値をランダムに生成して表示
// ・0.0以上10.0未満の実数値をランダムに生成して表示
// ・-1.0以上1.0未満の実数値をランダムに生成して表示

package chapter_2;

import java.util.Random;

public class E02_09 {
    public static void main(String[] args) {
        // Randomクラスのインスタンスを変数randomに格納する。
        Random random = new Random();
        // RandomクラスのnextDoubleメソッドを利用して0.0以上1.0未満の乱数を生成、randomDouble変数に格納する。
        double randomDouble = random.nextDouble();
        // rondomDouble変数を出力する。
        System.out.println("0.0以上1.0未満の実数値: " + randomDouble);
        // rondomDouble変数の10倍の数を出力する。
        System.out.println("0.0以上10.0未満の実数値: " + (randomDouble * 10));
        // rondomDouble変数の2倍から1を引いた数を出力する。
        System.out.println("-1.0以上1.0未満の実数値: " + ((randomDouble * 2) - 1));
    }
}
