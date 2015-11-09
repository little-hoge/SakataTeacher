package lesson2_5;

/**
 * @version 1.00, 2015/11/09
 * @author takahashi
 */

// BOOK継承
public class Magazine extends Book implements Copyable {

    private String genre;
    private int number;
    
    Magazine(){
        // 親コンストラクタ(Book)呼び出し
        super();
//        this.setGenre("");
//        this.setNumber(1);
        this.genre = "";
        this.number = 1;
    }
    Magazine(String genre){
        // デフォルトコンストラクタ(Magazine)呼び出し
        this();
        //this.setGenre("genre");
        this.genre = genre;
    }
    
    //
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    
    //
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    @Override   // アノケーション
    public String getType(){
        return "Magazine";
    }
    
    // インターフェース分
    @Override
    public int getPageCount() {
        return 100;
    }
    
    @Override
    public void copy(int count) {
        // TODO 自動生成されたメソッド・スタブ
        System.out.println(number + "枚、雑誌をコピーしました");
    }

}
