/*
 * List4-5(p.102)のinputPositiveInteger--が--inputPositiveIntegerになっていたら、どのような出力が得られるかを検討せよ。
 * プログラムを作成して実行結果を確認すること。
 */
package chapter4;

import java.util.Scanner;

public class E04_05 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // カウントダウンの開始をアナウンスする。
        System.out.println("カウントダウンします。");
        // 入力された正の整数値を格納する変数を宣言する。
        int inputPositiveInteger;
        do {
            // 正の整数値の入力を促す。
            System.out.print("正の整数値：");
            // 入力された整数を変数に格納する。
            inputPositiveInteger = standardInput.nextInt();
        } while (inputPositiveInteger <= 0); // 入力された整数が負の値の間は、入力をやり直しにする。

        // inputPositiveIntegerが0以上の間、出力を繰り返す。
        while (inputPositiveInteger >= 0) {
            // 入力された整数をデクリメントしてから出力する。
            System.out.println(--inputPositiveInteger);
        }
        // ループの最後にinputPositiveIntegerは0になるが、
        // デクリメントしてから出力されるため、最後に出力されるのは-1となる。
    }
}
