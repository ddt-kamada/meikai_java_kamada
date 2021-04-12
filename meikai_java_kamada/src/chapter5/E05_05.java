/**
 * 三つの整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ。
 * 平均はキャスト演算子を利用して求め、実数として表示すること。
 */
package chapter5;

import java.util.Scanner;

public class E05_05 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);

        System.out.println("３つの整数値の合計値と平均値を求めます。");
        System.out.print("１つ目の値：");
        // １つ目の整数を保持する変数を宣言し、入力された値を代入する。
        int firstInteger = standardInput.nextInt();
        System.out.print("２つ目の値：");
        // ２つ目の整数を保持する変数を宣言し、入力された値を代入する。
        int secondInteger = standardInput.nextInt();
        System.out.print("３つ目の値：");
        // ３つ目の整数を保持する変数を宣言し、入力された値を代入する。
        int thirdInteger = standardInput.nextInt();

        // ３つの整数値の合計値を保持する変数を宣言し、加算結果を代入する。
        int integerSum = firstInteger + secondInteger + thirdInteger;
        // ３つの整数値の平均値を保持する整数を宣言し、算出した平均値をdouble型にキャストした実数を代入する。
        double integerAverage = (double) integerSum / 3;

        // 合計値と平均値を表示する。
        System.out.println("３つの値の合計値は" + integerSum + "です。");
        System.out.println("３つの値の平均値は" + integerAverage + "です。");

    }

}
