package lesson6_1;

import java.util.Calendar;

/**
 * メモを表すクラス.
 *
 * @author takahashi
 *
 */
public class Memo {

    /**
     * 記録日時.
     */
    private Calendar timestamp;

    /**
     * メモ本文.
     */
    private String memo;

    Memo() {
        this(null, "");
    }

    Memo(Calendar timestamp) {
        this(timestamp, "");
    }

    Memo(Calendar timestamp, String s) {
        this.timestamp = timestamp;
        this.memo = s;
    }

    /**
     * 記録日時を取得する.
     *
     * @return timestamp 記録日時
     */
    public Calendar getTimestamp() {
        return timestamp;
    }

    /**
     * 記録日時をセットする.
     *
     * @param timestamp セットする記録日時
     */
    public void setTimestamp(Calendar timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * メモ本文を取得する.
     *
     * @return memo メモ本文
     */
    public String getMemo() {
        return memo;
    }
    /**
     * メモ本文をセットする
     *
     * @param memo セットするメモ本文
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }
}
