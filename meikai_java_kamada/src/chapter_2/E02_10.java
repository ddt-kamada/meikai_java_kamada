// 演習2_10 下に示すように、名前の姓と名とを個別にキーボードから読み込んで、挨拶を行うプログラムを作成せよ。
// 姓：柴田
// 名：望洋
// こんにちは柴田望洋さん。

package chapter_2;

import java.util.Scanner;

public class E02_10 {
    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 苗字の入力を促す。
        System.out.println("姓：");
        // 1行分の文字列を読み込む。
        String familyName = standardInput.nextLine();
        // 名前の入力を促す。
        System.out.println("名：");
        // 1行分の文字列を読み込む。
        String lastName = standardInput.nextLine();
        // 文字列を格納した変数を出力する。
        System.out.println("こんにちは" + familyName + lastName + "さん。");
    }
}
