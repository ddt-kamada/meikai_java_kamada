/*
 * List 3-5の最後のelseを、else if(n == 0)に変更したらどうなるかを検討せよ。
 */
package chapter_3;

import java.util.Scanner;

public class E03_03 {

    public static void main(String[] args) {
        // 標準入力ストリームから取り出す入力値を変数standardInputに格納する。
        Scanner standardInput = new Scanner(System.in);
        // 整数値の入力を促す。
        System.out.print("整数値：");
        // キーボードから読み込んだ整数値を変数numberInputに格納する。
        int numberInput = standardInput.nextInt();

        if (numberInput > 0)
            // 変数numberInputが0より大きければ、値は正。
            System.out.println("その値は正です。");
        else if (numberInput < 0)
            // 変数numberInputが0未満であれば、値は負。
            System.out.println("その値は負です。");
        else if (numberInput == 0)
            // 変数numberInputが0より大きくなく、かつ0未満でもない値は0しかないので、この場合はelse と else if (number == 0)は同じ意味になる。
            System.out.println("その値は0です。");
    }
}
