package lesson5_3;

/**
 * 雑誌を表すクラス.
 *
 * @version 1.0
 * @author takahashi
 *
 */
public class Magazine extends Book {

    /**
     * ジャンル.
     */
    private String genre;

    /**
     * 号数.
     */
    private int number;

    /**
     * コンストラクタ.
     */
    Magazine() {
        super();

        this.genre = "";
        this.number = 1;
    }

    Magazine(String genre) {
        this();
        this.genre = genre;
    }

    /**
     * ジャンルを返す.
     *
     * @return ジャンル
     */
    public String getGenre() {
        return this.genre;
    }

    /**
     * ジャンルをセットする.
     *
     * @param genre ジャンル
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * 号数を返す.
     *
     * @return 号数
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * 号数をセットする.
     *
     * @param number 号数
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * 本の種類を返す.
     *
     * @return 本の種類
     */
    @Override
    public String getType() {
        return "Magazine";
    }
}
