// 演習2-2 三つのint変数値に値を代入し、合計と平均を求めるプログラムを作成せよ。

package chapter_2;

public class E02_02 {
    public static void main(String[] args) {
        int integerFirst;
        int integerSecond;
        int integerThird;

        integerFirst = 51;
        integerSecond = 24;
        integerThird = 68;

        // 3つのint型変数の合計値を表示する。
        System.out.println("合計は" + (integerFirst + integerSecond + integerThird) + "です。");
        // 3つのint型変数の平均値を表示する（47.66666...の小数点以下が切り捨て）。
        System.out.println("平均は" + (integerFirst + integerSecond + integerThird) / 3 + "です。");
    }
}
