/* 演習3-16
 * 三つの整数値を読み込んで昇順（小さい順）にソートするプログラムを作成せよ。 */

package chapter_3;

import java.util.Scanner;

public class E03_16 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 最初の整数値の入力を促す。
        System.out.print("最初の整数：");
        // 入力された整数値を変数firstInputに格納する。
        int firstInput = standardInput.nextInt();
        // 2番目の整数値の入力を促す。
        System.out.print("2番目の整数：");
        // 入力された整数値を変数secondInputに格納する。
        int secondInput = standardInput.nextInt();
        // 3番目の整数値の入力を促す。
        System.out.print("3番目の整数：");
        // 入力された整数値を変数thirdInputに格納する。
        int thirdInput = standardInput.nextInt();

        // 最小値、中間の値、最大値を変数にして0で初期化しておく
        int minimumInteger = 0;
        int mediumInteger = 0;
        int maximumInteger = 0;

        // 最初の入力値が最小値の場合
        if (firstInput <= secondInput && firstInput <= thirdInput) {
            minimumInteger = firstInput;
            // 2番目の値と3番目の値を比較して中間の値と最大値を決める
            if (secondInput <= thirdInput) {
                mediumInteger = secondInput;
                maximumInteger = thirdInput;
            } else {
                mediumInteger = thirdInput;
                maximumInteger = secondInput;
            }
        // 2番目の入力値が最小値の場合
        } else if (secondInput <= firstInput && secondInput <= thirdInput) {
            minimumInteger = secondInput;
            // 最初の値と3番目の値を比較して中間の値と最大値を決める
            if (firstInput <= thirdInput) {
                mediumInteger = firstInput;
                maximumInteger = thirdInput;
            } else {
                mediumInteger = thirdInput;
                maximumInteger = firstInput;
            }
        // 3番目の入力値が最小値の場合
        }  else if (thirdInput <= firstInput && thirdInput <= secondInput) {
            minimumInteger = thirdInput;
            // 最初の値と2番目の値を比較して中間の値と最大値を決める
            if (firstInput <= secondInput) {
                mediumInteger = firstInput;
                maximumInteger = secondInput;
            } else {
                mediumInteger = secondInput;
                maximumInteger = firstInput;
            }
        }

        // 結果を出力
        System.out.println("入力された整数を小さい順に上から並べました。");
        System.out.println(minimumInteger);
        System.out.println(mediumInteger);
        System.out.println(maximumInteger);
    }

}
