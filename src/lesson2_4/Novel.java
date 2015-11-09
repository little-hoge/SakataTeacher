package lesson2_4;

/**
 * @version 1.00, 2015/11/09
 * @author takahashi
 */

// BOOK継承
public class Novel extends Book {

    private String subTitle;

    Novel(){
        // 親コンストラクタ(Book)呼び出し
        super();
        this.subTitle = "";
    }
    
    //
    public String getSubTitle() {
        return subTitle;
    }
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }
    
    @Override   // アノケーション
    public String getType(){
        return "Novel";
    }

}
