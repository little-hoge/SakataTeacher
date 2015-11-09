package lesson2_3;

/**
 * @version 1.00, 2015/11/09
 * @author takahashi
 */

public class Book {
    // 
    private String title;
    private String author;
    private int price;

    // デフォルトコンストラクタ
    Book(){
        this.title = "";
        this.author = "";
        this.price = 0;
    }

    //
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    //
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    //
    public int getPrice(){
        return this.price;
    }
    public void setPrice( int price){
        this.price = price;
    }

    //
    public String getType(){
        return "";
    }
}
