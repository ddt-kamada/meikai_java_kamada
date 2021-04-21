/*
 * 0.0から1.0まで0.001おきに、その値と、その値の2乗を表示するプログラムを作成せよ。
 */
package chapter5;

public class E05_07 {

    public static void main(String[] args) {
        System.out.println("    値      値の2乗    ");
        System.out.println("----------------------");

        // 誤差が出ないように、繰り返しの制御を整数で行い、繰り返しの度に整数値から実数値を求める。。
        for (int i=0; i<=1000; i++) {
            // 整数値を実数値に変換する。
            float floatByInt = (float) i / 1000;
            // 整数値の2乗を実数値に変換する。
            float squareFloat = (float) i * i / 1000000;
            // 値と値の2乗を表示する。
            System.out.printf("%8.7f    %8.7f", floatByInt, squareFloat);
            System.out.println();
        }

    }

}
