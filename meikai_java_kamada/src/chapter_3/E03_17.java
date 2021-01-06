/* 演習3-17
 * 0, 1, 2のいずれかの値の乱数を生成し、0であれば"グー"を、1であれば"チョキ"を、
 * 2であれば"パー"を表示するプログラムを作成せよ。 */

package chapter_3;

import java.util.Random;

public class E03_17 {

    public static void main(String[] args) {
        // Randomクラスのインスタンスを変数randomに格納する。
        Random random = new Random();
        // RandomクラスのnextIntメソッドを利用して0以上3未満の乱数を生成、randomInteger変数に格納する。
        int randomInteger = random.nextInt(3);

        // 生成された乱数の値を評価し、ラベルに示された整数と乱数が一致すれば対応するジャンケンの手を表示する。
        switch (randomInteger) {
            case 0 : System.out.print("グー"); break;
            case 1 : System.out.print("チョキ"); break;
            case 2 : System.out.print("パー"); break;
        }

    }

}
