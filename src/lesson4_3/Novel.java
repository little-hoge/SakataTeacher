package lesson4_3;

/**
 * 小説を表すクラス
 *
 * @version 1.0
 * @author takahashi
 *
 */
public class Novel extends Book {

    /**
     * 副題.
     */
    private String subTitle;

    /**
     * コンストラクタ.
     */
    public Novel() {
        super();
        this.subTitle = "";
    }

    /**
     * 副題を返す.
     *
     * @return 副題
     */
    public String getSubTitle() {
        return this.subTitle;
    }

    /**
     * 副題をセットする.
     *
     * @param subTitle 副題
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    /**
     * 本の種類を返す.
     *
     * @return 本の種類
     */
    @Override
    public String getType() {
        return "Novel";
    }

}
