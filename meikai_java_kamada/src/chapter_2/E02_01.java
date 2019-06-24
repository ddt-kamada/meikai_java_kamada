// 演習2_1 List2-6の[2]の箇所）を、小数部をもつ実数値をxとyに代入するように変更して、その結果を考察せよ

package chapter_2;

public class E02_01 {
    public static void main(String[] args) {
        double x;
        double y;

        // List2-6の[2]
        x = 1.5263;
        y = 4.36481;

        // 変数xに代入した1.5263（小数第4位まで）がそのまま表示される。
        System.out.println("xの値は" + x + "です。");
        // 変数yに代入した4.36481（小数第5位まで）がそのまま表示される。
        System.out.println("yの値は" + y + "です。");
        // 合計値は5.89111(小数第5位まで)が表示される。
        System.out.println("合計は" + (x + y) + "です。");
        // 平均値は2.945555（切り捨てされずに小数第6位まで）が表示される。
        System.out.println("平均は" + (x + y) / 2 + "です。");
    }
}
