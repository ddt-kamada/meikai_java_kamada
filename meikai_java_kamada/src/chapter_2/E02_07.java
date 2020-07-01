// 演習2_7 以下に示すプログラムを作成せよ。
// 1桁の正の整数値（すなわち1以上9以下の値）をランダムに生成して表示。
// 1桁の負の整数値（すなわち-9以上-1以下の値）をランダムに生成して表示。
// 2桁の正の整数値（すなわち10以上99以下の値）をランダムに生成して表示。

package chapter_2;

import java.util.Random;

public class E02_07 {
    public static void main(String[] args) {
        // Randomクラスのインスタンスを変数randomに格納する。
        Random random = new Random();
        // nextInt()メソッドは引数nをとって0〜n-1までの乱数を生成するので、正の整数値は0~8まで生成して1を足す。
        int positiveInteger = random.nextInt(9) + 1;
        // 負の整数値は正の整数値に負の符号をつける。
        int negativeInteger = -(random.nextInt(9) + 1);
        // 2桁の正の整数値は0~89までの乱数を作成し、10を足す。
        int twoDigitInteger = random.nextInt(90) + 10;
        // 変数positiveIntegerを出力する。
        System.out.println(positiveInteger);
        // 変数negativeIntegerを出力する。
        System.out.println(negativeInteger);
        // 変数twoDigitIntegerを出力する。
        System.out.println(twoDigitInteger);
    }
}
