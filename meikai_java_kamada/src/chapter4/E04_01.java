/*
 * 読み込んだ整数値の符号を判定するList3-5のプログラム（p.58）を、
 * 好きなだけ何度でも繰り返して入力・表示できるようにしたプログラムを作成せよ。
 */
package chapter4;

import java.util.Scanner;

public class E04_01 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 繰り返しを続けるかどうかの情報を保持する変数を宣言する。
        int doesRetry;
        // ループ本体のプログラムを実行する。
        do {
            // 整数の入力を促す。
            System.out.print("整数値: ");
            // 入力された整数を変数inputIntegerに格納する。
            int inputInteger = standardInput.nextInt();
            // 変数inputIntegerが0より上であれば正の値、0未満であれば負の値、0であれば0である旨を表示する。
            if (inputInteger > 0) {
                System.out.println("その値は正です。");
            } else if (inputInteger < 0) {
                System.out.println("その値は負です。");
            } else {
                System.out.println("その値は0です。");
            }
            // プログラムを繰り返し行うか尋ね、入力された値を変数doesRetryに代入する。
            System.out.print("もう一度？ 1...Yes/0...No:");
            doesRetry = standardInput.nextInt();
        } while (doesRetry == 1); // 変数doesRetryが1であれば、再びループ本体を実行する。
        // 変数doesRetryが1でなければ、プログラムを終了する。
    }

}
