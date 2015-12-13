/**
 * 簡易メモ帳アプリ
 */
package lesson6_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 * アプリケーションのエントリポイント
 *
 * @author takahashi
 *
 */
public class MemoPadApp {

    /**
     * メインメソッド
     *
     * @param args
     */
    public static void main(String[] args) {

        MemoPad mp = new MemoPad();

        mp.load();

        // キーボード入力を読み込むためのオブジェクト
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while (true) {
            System.out.print(">> ");

            try {
                str = br.readLine();
            } catch (Exception e) {
                // 入力できなかったら、即終了
                break;
            }

            String[] tokens = str.split(" ");

            // 空行の場合は再度入力待ち
            if (tokens[0].equals("")) {
                continue;
            }
            // exitコマンド = プログラム終了
            if (tokens[0].equals("exit")) {
                break;
            }

            try {
                switch (tokens[0]) {
                case "add":
                    mp.add(tokens[1]);
                    break;

                case "view":
                    printMemoList(mp.view());
                    break;

                case "save":
                    if ((tokens.length > 1) ? mp.save(tokens[1]) : mp.save()) {
                        System.out.println("保存しました。");
                    } else {
                        System.out.println("保存が失敗しました。");
                    }
                    break;

                default:
                    System.out.println("入力が誤っています。");
                    break;
                }
            } catch (IndexOutOfBoundsException ioobe) {
                System.out.println("入力が足りません。");
            }
        }

        System.out.println("終了します。");
    }

    /**
     * メモのリストを画面に表示する
     *
     * @param list Memoオブジェクトのリスト
     */
    private static void printMemoList(ArrayList<Memo> list) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        for (Memo memo : list) {
            System.out.println(
                    "[" + sdf.format(memo.getTimestamp().getTime()) +"] "
                            + memo.getMemo());
        }
    }
}
