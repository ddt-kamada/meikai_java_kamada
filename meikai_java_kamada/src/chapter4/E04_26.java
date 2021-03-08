/**
 * 合計だけでなく平均も求めるようにList4-19のプログラムを書き換えよ。
 * なお、読み込んだ負の数の個数は平均を求める際の分母から除外すること。
 */
package chapter4;

import java.util.Scanner;

public class E04_26 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);

        // 加算する何個を保持する変数を宣言し、0で初期化する。
        int inputCount = 0;
        do {
            // 加算する個数の入力を促す。
            System.out.println("整数を加算します。");
            System.out.print("何個加算しますか：");
            // 入力された整数を変数に代入する。入力された変数が0以下だった場合、繰り返し個数の入力を促す。
            inputCount = standardInput.nextInt();
        } while (inputCount <= 0);

        // 実際に加算が行われた個数を保持する変数を宣言し、0で初期化する。
        int addCount = 0;
        // 整数の合計値を保持する変数を宣言し、0で初期化する。
        int integersSum = 0;
        // 整数の平均値を保持する変数を宣言し、0で初期化する。
        int integersAverage = 0;
        for (int i=0; i<inputCount; i++) {
            // 加算する整数の入力を促す。
            System.out.print("整数：");
            // 入力された整数を変数に代入する。
            int integerInput = standardInput.nextInt();
            // 入力された変数が0未満の場合、加算しない旨を表示する。合計値と、加算が行われた個数の加算処理は行わない。
            if (integerInput < 0) {
                System.out.println("負の数は加算しません。");
                continue;
            }
            integersSum += integerInput;
            addCount++;
        }

        if (addCount == 0) {
            // 全て負の数が入力された場合、エラー文言を表示する。
            System.out.println("全て負の数が入力されたため、合計値と平均値は計算できませんでした。");
        } else {
            // 合計値と加算が行われた個数から平均値を計算する。
            integersAverage = integersSum / addCount;
            // 計算結果を出力する。
            System.out.println("合計は" + integersSum + "です。");
            System.out.println("平均は" + integersAverage + "です。");
        }

    }

}
