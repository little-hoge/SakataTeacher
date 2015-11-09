package lesson2_2;

/**
 * @version 1.00, 2015/11/09
 * @author takahashi
 */

// BOOK継承
public class Magazine extends Book {
    //
    private String genre;
    private int number;
    
    Magazine(){
        // 親コンストラクタ(Book)呼び出し
        super();
        this.setGenre("");
        this.setNumber(1);
    }
    Magazine(String genre){
        // デフォルトコンストラクタ(Magazine)呼び出し
        this();
        this.setGenre("genre");
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
    
    //
    public String getType(){
        return "Magazine";
    }

}
