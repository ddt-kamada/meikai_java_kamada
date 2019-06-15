// 演習1-1 プログラム中の文の終端を示すセミコロン;が欠如しているとどうなるか。プログラムをコンパイルして検証せよ。

package chapter_1;

public class E01_01 {
    public static void main(String args[]) {
        // セミコロンを削除した場合、コンパイル時に構文エラーが起こり、Exceptionが投げられる。
        System.out.println("画面に出力しています。")
    }
}
