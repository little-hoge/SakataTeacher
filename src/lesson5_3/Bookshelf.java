package lesson5_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 本棚を表すクラス.
 *
 * @version 1.0
 * @author takahashi
 *
 */
public class Bookshelf {


    /**
     * 本棚.
     */
    private ArrayList<Book> shelf;

    /**
     * 本棚の入った冊数.
     */
    //private int count;

    /**
     * 本棚の最大冊数.
     */
    //private static int MAX_SHELF = 100;

    /**
     * コンストラクタ.
     */
    Bookshelf() {
        this.shelf = new ArrayList<Book>();
     //   this.count = 0;
    }

    /**
     * 本棚に本を追加する.
     *
     * 本棚の最大冊数を超えると追加しない。
     *
     * @param b 追加する本
     */
    public void add(Book b) {
        this.shelf.add(b);
    }

    /**
     * 本棚の本をすべて表示する.
     */
    public void list() {
        int i = 0;
        for(Iterator<Book> iterator = shelf.iterator(); iterator.hasNext();){
            Book nowit = iterator.next();
            System.out.println("No." + i);
            System.out.println("Type = " + nowit.getType());
            System.out.println("Title = " + nowit.getTitle());
            System.out.println("Author = " + nowit.getAuthor());
            System.out.println("Price = " + nowit.getPrice());
            i++;
        }
    }

    /**
     * 本棚の指定位置にある本を表示する.
     *
     * @param index 本棚の位置
     */
    public void list(int index) {
        Iterator<Book> iterator = shelf.iterator();
        Book nowit = iterator.next();

        try {
            for(int i = 0; i < index; i++){
                nowit = iterator.next();
            }
            // 本があったとき出力
            System.out.println("[No." + index + "]");
            System.out.println("Type = " + nowit.getType());
            System.out.println("Title = " + nowit.getTitle());
            System.out.println("Author = " + nowit.getAuthor());
            System.out.println("Price = " + nowit.getPrice());
        
        } catch(NoSuchElementException em) {
            System.out.println("Invalid index!!");
        }
    }
}
