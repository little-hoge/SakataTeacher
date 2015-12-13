package lesson6_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;

/**
 * メモ帳を表すクラス
 *
 * @author takahashi
 *
 */
public class MemoPad {

    private ArrayList<Memo> memos = null;

    private static String DEFAULT_FILEPATH = "c:\\Work\\memopad.csv";

    MemoPad() {
        this.memos = new ArrayList<Memo>();
    }

    /**
     * メモの追加。
     *
     * メモ帳に指定された文字列のメモを追加します。
     * 日時は現在日時が自動的にセットされます。
     *
     * @param s メモの内容
     */
    public void add(String s) {
        Calendar cl = Calendar.getInstance();
        Memo insmemo = new Memo(cl, s);

        this.memos.add(insmemo);
    }

    /**
     * メモ帳の内容を返す。
     *
     * メモ帳に記録されているすべてのメモをArrayListで返します。
     *
     * @return メモのArrayList
     */
    public ArrayList<Memo> view() {
        return this.memos;
    }

    /**
     * メモ帳の内容を保存する。
     *
     * ファイル名はプログラムのデフォルト値となります。
     *
     * @return 成功ならtrue, 失敗ならfalse。
     */
    public boolean save() {
        //
        return this.save(DEFAULT_FILEPATH);

    }

    /**
     * メモ帳の内容を保存する。
     *
     * @param path 保存するファイルのフルパス。
     * @return 成功ならtrue, 失敗ならfalse。
     */
    public boolean save(String path) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        try {
            // ファイル書き込み用インスタンス用意
            File file = new File(path);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            Iterator<Memo> iterator = memos.iterator();
            // 書き込み
            while ( iterator.hasNext() ) {
                Memo nowit = iterator.next();
                bw.write(sdf.format(nowit.getTimestamp().getTime()) + "," + nowit.getMemo());
                bw.newLine();
            }
            bw.close();
        } catch (IOException ioe) {
            // System.out.println("ファイル書き込みエラー");
            return false;
        }
        return true;

    }

    /**
     * CSVファイルからメモ帳の内容を読み込む。
     *
     * ファイル名はプログラムのデフォルト値固定。
     */
    public void load() {

        try {
            // ファイル読み込み用インスタンス用意
            File file = new File(DEFAULT_FILEPATH);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                Memo memo = new Memo(strToCalendar(tokens[0]), tokens[1]);
                this.memos.add(memo);
            }
            br.close();
        } catch (Exception e) {
            // System.out.println("ファイル書き込みエラー");
        }
    }

    /**
     * 日時を表す文字列をCalendarオブジェクトに変換する。
     *
     * @param s 日時を表す文字列
     * @return Calendarオブジェクト。変換できないときはnullを返す。
     */
    private Calendar strToCalendar(String s) {
        Calendar cal = new GregorianCalendar();
        try {
            cal.setTime(DateFormat.getDateInstance().parse(s));
        } catch (Exception e) {
            cal = null;
        }
        return cal;
    }
}
