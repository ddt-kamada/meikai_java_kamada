/**
 * float型の変数とdouble型の変数に値を読み込んで表示するプログラムを作成せよ。
 * float型の読み込みには、nextFloat()を利用します。（p.49）
 *
 * 変数xはfloat型で、変数yはdouble型です。
 * x: 0.12345678901234567890
 * y: 0.12345678901234567890
 * x = 0.123456789
 * y = 0.12345678901234568
 */
package chapter5;

import java.util.Scanner;

public class E05_02 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        System.out.println("変数xはfloat型で、変数yはdouble型です。");
        // float型の変数に読み込む値の入力を促す。
        System.out.print("x：");
        // float型の変数を宣言し、入力された数値を代入する。
        float inputFloat = standardInput.nextFloat();
        // double型の変数に読み込む値の入力を促す。
        System.out.print("y：");
        // double型の変数を宣言し、入力された数値を代入する。
        double inputDouble = standardInput.nextDouble();

        // 入力された数値をfloat型で表示する。
        System.out.println("x = " + inputFloat);
        // 入力された数値をdouble型で表示する。
        System.out.println("y = " + inputDouble);

    }

}
