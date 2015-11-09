package lesson2_2;

/**
 * @version 1.00, 2015/11/09
 * @author takahashi
 */

// ☆Java基本構文になれる (コンストラクタ応用、継承(extends)の理解)
public class BookshelfApp {

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
        Bookshelf bf = new Bookshelf();
        
        // 現実装では10件まで
        bf.add(newton);
        bf.add(shitamachi);

        // 棚にあるすべての本を出力
        bf.list();

    }

}
