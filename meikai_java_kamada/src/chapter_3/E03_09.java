/**
 * 二つの実数値を読み込んで、大きい方の値を表示するプログラムを作成せよ。
 */

package chapter_3;

import java.util.Scanner;

public class E03_09 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 実数Aの入力を促す
        System.out.print("実数A：");
        // 入力された実数値を変数double_aに格納する。
        double doubleA = standardInput.nextDouble();
        // 実数Bの入力を促す。
        System.out.print("実数B：");
        // 入力された実数値を変数double_bに格納する。
        double doubleB = standardInput.nextDouble();
        // 変数double_aが変数double_bより大きければdouble_aを評価した値を、小さければdouble_bを評価した値を生成し、変数maxに格納する。
        double max = doubleA > doubleB ? doubleA : doubleB;
        // 大きい方の値（変数max）を出力する。
        System.out.println("大きい方の値は" + max + "です。");
    }

}
