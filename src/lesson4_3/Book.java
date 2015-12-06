package lesson4_3;

/**
 * 本を表す抽象クラス.
 *
 * @version 1.0
 * @author takahashi
 *
 */
abstract public class Book {

    /**
     * タイトル.
     */
    private String title;

    /**
     * 著者名.
     */
    private String author;

    /**
     * 価格.
     */
    private int price;

    /**
     * コンストラクタ.
     */
    Book() {
        this.title = "";
        this.author = "";
        this.price = 0;
    }

    /**
     * タイトルを返す.
     *
     * @return タイトル
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * タイトルをセットする.
     *
     * @param title タイトル
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 著者を返す.
     *
     * @return 著者
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * 著者をセットする.
     *
     * @param author 著者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 価格を返す.
     *
     * @return 価格
     */
    public int getPrice() {
        return this.price;
    }

    /**
     * 価格をセットする.
     *
     * @param price 価格
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 本の種類を返す.
     *
     * @return 本の種類
     */
    abstract public String getType();

}
