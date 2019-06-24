// 演習2-2 三つのint変数値に値を代入し、合計と平均を求めるプログラムを作成せよ。

package chapter_2;

public class E02_02 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;

        x = 51;
        y = 24;
        z = 68;

        // 合計値は143が表示される。
        System.out.println("合計は" + (x + y + z) + "です。");
        // 平均値は47（47.66666...の小数点以下が切り捨て）が表示される。
        System.out.println("平均は" + (x + y + z) / 3 + "です。");
    }
}
