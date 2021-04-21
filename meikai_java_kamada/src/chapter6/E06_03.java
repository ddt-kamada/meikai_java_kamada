/**
 * 要素型がdouble型で要素数が5の配列の要素に対して、先頭から順に1.1, 2.2, 3.3, 4.4, 5.5を代入して表示するプログラムを表示せよ。
 */
package chapter6;

public class E06_03 {
    public static void main(String[] args) {
        // 要素型がdouble型で要素数が5の配列を宣言し、初期化する。
        double[] doubleArray = new double[5];

        // 配列の全要素に対して、繰り返し値を代入する。
        for (int i=0; i<doubleArray.length; i++) {
            double intValue = (i + 1) * 11;
            doubleArray[i] = (double) (intValue / 10);
        }

        // 配列を先頭から順に表示する。
        for (int i=0; i<doubleArray.length; i++) {
            System.out.println("doubleArray[" + i + "] = " + doubleArray[i]);
        }
    }

}
