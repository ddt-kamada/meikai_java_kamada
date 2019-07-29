// 演習2_6 三角形の底辺と高さを読み込んで、その面積を表示するプログラムを作成せよ。

package chapter_2;

import java.util.Scanner;

public class E02_06 {
    public static void main(String[] args) {
        // 説明文を出力する。
        System.out.println("三角形の面積を求めます。");
        // 標準入力ストリームから取り出す入力値を変数stdInに格納する。
        Scanner stdIn = new Scanner(System.in);
        // 底辺の値の入力を促す。
        System.out.print("底辺：");
        // bottonに底辺の入力値を読み込む。
        double bottom = stdIn.nextDouble();
        // 高さの値の入力を促す。
        System.out.print("高さ：");
        // heightに高さの入力値を読み込む。
        double height = stdIn.nextDouble();
        // xとyの合計値を出力する。
        System.out.println("面積は" + (bottom * height)/2 + "です。");
    }
}
