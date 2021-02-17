/*
 * 身長と標準体重の対応表を作成するプログラムを作成せよ。
 * 表示する身長の範囲（開始値/終了値/増分）は、整数値として読み込むこと。
 * ※標準体重は（身長 - 100） × 0.9によって求められる。
 *
 * 何cmから： 150
 * 何cmまで： 190
 * 何cmごと： 5
 * 身長 標準体重
 * 150 45
 * 155 49.5
 * ... 以下省略 ...
 */
package chapter4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class E04_15 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);

        // 何cmから表を作成するか、始まりの身長の入力を促し、変数に格納する。
        System.out.print("何cmから: ");
        int heightFrom = standardInput.nextInt();

        // 何cmまで表を作成するか、終わりの身長の入力を促し、変数に格納する。
        System.out.print("何cmまで: ");
        int heightTo = standardInput.nextInt();

        // 何cmごとに表を作成するかの入力を促し、変数に格納する。
        System.out.print("何cmごと: ");
        int heightPer = standardInput.nextInt();

        System.out.println("身長 標準体重");

        // 入力された始まりの身長から始めてheightPerごと加算しながら、入力された終わりの身長になるまで身長と平均体重の出力を繰り返す。
        for (int i=heightFrom; i<=heightTo; i+=heightPer) {
            // 身長から平均体重を計算し、変数に代入する。
            double averageWeight = (i - 100) * 0.9;
            // 小数点以下が0で終わる部分は表示しないフォーマットを設定する。
            DecimalFormat formatHide0 = new DecimalFormat("0.#");
            // 身長とフォーマットされた平均体重を出力する。
            System.out.println(i + " " + formatHide0.format(averageWeight));
        }

    }

}
