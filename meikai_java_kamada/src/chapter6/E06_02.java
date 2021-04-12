/**
 * 要素型がint型で要素数が5の配列の要素に対して、先頭から順に5, 4, 3, 2, 1を代入して表示するプログラムを作成せよ。
 */
package chapter6;

public class E06_02 {

    public static void main(String[] args) {
        // 要素型がintの配列の変数を宣言し、要素数5の配列を生成して初期化する。
        int[] intArray = new int[5];

        // 配列の要素数分繰り返し値を代入数する。値は配列の要素数から始めて1ずつデクリメントする。
        int arrayLength = intArray.length;
        for (int i=0, arrayValue=arrayLength; i<arrayLength; i++, arrayValue--) {
            intArray[i] = arrayValue;
        }

        // 配列の要素数分繰り返し値を表示する。
        for (int i=0; i<arrayLength; i++) {
            System.out.println("intArray[" + i + "] = " + intArray[i]);
        }
    }

}
