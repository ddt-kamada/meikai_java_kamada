/**
 * 要素型がdouble型で要素数が5の配列を生成して、その全要素の値を表示するプログラムを作成せよ。
 */
package chapter6;

public class E06_01 {

    public static void main(String[] args) {
        // 構成要素型がdouble型の配列の変数を宣言し、要素数5の配列を生成して初期化数する。
        double [] doubleArray = new double[5];

        // 配列の要素の2・3・5番目に値を代入する。
        doubleArray[1] = 0.01;
        doubleArray[2] = 0.02;
        doubleArray[4] = 0.04;

        // 配列の全要素の値を表示する。
        System.out.println("doubleArray[" + 0 + "] = " + doubleArray[0]);
        System.out.println("doubleArray[" + 1 + "] = " + doubleArray[1]);
        System.out.println("doubleArray[" + 2 + "] = " + doubleArray[2]);
        System.out.println("doubleArray[" + 3 + "] = " + doubleArray[3]);
        System.out.println("doubleArray[" + 4 + "] = " + doubleArray[4]);
    }

}
