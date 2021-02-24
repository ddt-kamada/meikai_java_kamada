/**
 * n段のピラミッドを表示するプログラムを作成せよ。（下図は4段の例）。
 * 第i行目にはi%10を表示すること
 *
 *       1
 *      222
 *     33333
 *    4444444
 */
package chapter4;

import java.util.Scanner;

public class E04_23 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // ピラミッドの段数の入力を促す。
        System.out.println("ピラミッドを表示します。");
        System.out.print("段数：");
        // ピラミッドの段数を保持する変数に、入力された整数を代入する。
        int stepNumber = standardInput.nextInt();

        // ピラミッドの段数が上から下に1ずつ増えるように、インクリメントしながら改行を行う。
        for (int i=1; i<=stepNumber; i++) {
            // 水平方向に左から右へ、空白を表示する。段数が増えるにつれて空白が少なくなり、ピラミッドの底辺では空白が無くなる。
            for (int j=1; j<=stepNumber-i; j++) {
                System.out.print(" ");
            }
            // 段数を10で割った余りがピラミッドの形になるように表示する。
            for (int k=1; k<=(i-1)*2+1; k++) {
                System.out.print(i%10);
            }
            System.out.println();
        }

    }

}
