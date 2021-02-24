/**
 * n段のピラミッドを表示するプログラムを作成せよ。（下図は4段の例）
 * 第i行目には(i - 1) * 2 + 1個の'*'記号を表示して、最終行である第n行目には(n-1) * 2 + 1個の'*'記号を表示すること。
 *
 *        *
 *       ***
 *      *****
 *     *******
 */
package chapter4;

import java.util.Scanner;

public class E04_22 {

    public static void main(String[] args) {
      // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
      Scanner standardInput = new Scanner(System.in);
      // ユーザーにピラミッドの段数の入力を促す。
      System.out.println("ピラミッドを表示します。");
      System.out.print("段数は：");
      // ピラミッドの段数を保持する変数を宣言し、入力された段数を代入する。
      int stepNumber = standardInput.nextInt();

      // ピラミッドの段数が上から下に1ずつ大きくなるように、デクリメントしながら改行を行う。
      for (int i=1; i<=stepNumber; i++) {
          // 水平方向に左から右へ、空白を表示する。段数が増えるにつれて空白が少なくなり、ピラミッドの底辺では空白が無くなる。
          for (int j=1;j<=stepNumber-i; j++) {
              System.out.print(" ");
          }
          // *を表示数する。
          for (int k=1;k<=(i-1)*2+1; k++) {
              System.out.print("*");
          }
          System.out.println();
      }
    }

}
