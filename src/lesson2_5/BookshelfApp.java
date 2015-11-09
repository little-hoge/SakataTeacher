package lesson2_5;

import java.util.Random;

/**
 * @version 1.00, 2015/11/09
 * @author takahashi
 */

//☆Java基本構文になれる (インターフェース、オーバーライドの理解)
public class BookshelfApp {

    // 
    private static final int MAX_ADDBOOK = 10;

    public static void main(String[] args) {
        //
        Magazine newton = new Magazine("Science");
        newton.setTitle("Newtow");
        newton.setAuthor("NEWTOW編集部");
        newton.setPrice(1111);
        newton.setNumber(500);

        //
        Novel shitamachi = new Novel();
        shitamachi.setTitle("下町ロケット");
        shitamachi.setAuthor("池井戸潤");
        shitamachi.setSubTitle("TVドラマ放映中！");
        shitamachi.setPrice(750);

        //
        Magazine cancam = new Magazine("Fashion");
        cancam.setTitle("cancam");
        cancam.setAuthor("小学館");
        cancam.setPrice(670);
        cancam.setNumber(200);

        // インスタンス生成
        Bookshelf bf = new Bookshelf();

        // 乱数クラス
        Random rnd = new Random();
        Book books[] = {newton, shitamachi, cancam}; 

        // ランダムに本を格納
        // 現実装では10件まで
        for(int loopcnt = 0; loopcnt < MAX_ADDBOOK; loopcnt++){
            // 乱数生成 0～2
            int ran = rnd.nextInt(books.length);
            bf.add(books[ran]);
        }

        // 本棚にあるすべての本を出力
        bf.list();

        // リスト指定出力
        bf.list(0);
        bf.list(100);

        //
        System.out.println("CanCam");
        System.out.println("ページ数:" + cancam.getPageCount());
        cancam.copy(1);
        
        Paper paper = new Paper();
        System.out.println("紙");
        System.out.println("ページ数:" + paper.getPageCount());
        paper.copy(50);
    }

}
