/**
 * List 4-16は左下側が直角の直角三角形を表示するプログラムであった。
 * 直角が左上側、右下側、右上側の三角形を表示するプログラムをそれぞれ作成せよ。
 */
package chapter4;

import java.util.Scanner;

public class E04_21 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);

        // 直角三角形の段数の入力を促す。
        System.out.println("左上、右下、右上直角の三角形を表示します。");
        System.out.print("段数は：");
        // 段数を保持する変数を宣言し、入力された整数を代入する。
        int stepNumber = standardInput.nextInt();

        // 左上直角の三角形を表示する。
        System.out.println("左上直角の三角形を表示します。");
        // 三角形の段数が上から下に1ずつ少なくなるように、デクリメントしながら繰り返し改行を行う。
        for (int i=stepNumber; i>=1; i--) {
            // 水平方向の1辺に表示される個数が、その段の段数と等しくなるまで左から右に*を表示する。
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 入力された整数と同じ個数の1辺をもつ正方形の中に、左上直角の透明な三角形と右下直角の*で出来た三角形を作成する。
        System.out.println("右下直角の三角形を表示します。");
        // 正方形の垂直方向の行番号が、入力された整数から始めて上から下に1ずつ少なくなるように繰り返し改行を行う。
        for (int i=stepNumber; i>=1; i--) {
            // 正方形の水平方向の列番号が、1から始めて左から右に1ずつ大きくなるように空白か*を表示する。
            for (int j=1; j<=stepNumber; j++) {
                if (j < i) {
                    // 列番号がその段の段数未満の間は空白を表示する。
                    System.out.print(" ");
                } else {
                    // 列番号がその段の段数以上になったら、1辺の最大個数まで繰り返し*を表示する。
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // 入力された整数と同じ個数の1辺をもつ正方形の中に、左下直角の透明な三角形と右上直角の*で出来た三角形を作成する。
        System.out.println("右上直角の三角形を表示します。");
        // 正方形の垂直方向の行番号が、1から始めて上から下に1ずつ大きくなるように繰り返し改行を行う。
        for (int i=1; i<=stepNumber; i++) {
            // 正方形の水平方向の列番号が、1から始めて左から右に1ずつ大きくなるように空白か*を表示する。
            for (int j=1; j<=stepNumber; j++) {
                if (j < i) {
                    // 列番号がその行の行番号未満である間、繰り返し空白を表示する。
                    System.out.print(" ");
                } else {
                    // 列番号がその行の行番号以上になったら、1辺の最大数になるまで*を表示する。
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

}
