package lesson5_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * 本棚プログラム.
 *
 * @version 2.0
 * @author takahashi
 *
 */
public class BookshelfApp {

    public static void main(String[] args) {

        Bookshelf bf = new Bookshelf();

        if (args.length < 1) {
            for (int i = 0; i < 50; i++) {
                Magazine magazine = new Magazine("Science");
                magazine.setTitle("Magazine-" + i);
                magazine.setAuthor("雑誌出版社-" + i);
                magazine.setPrice(1000 + i);
                magazine.setNumber(i);

                bf.add(magazine);
            }

            for (int i = 0; i < 50; i++) {
                Novel novel = new Novel();
                novel.setTitle("Novel-" + i);
                novel.setAuthor("小説家-" + i);
                novel.setPrice(1000 + i);
                novel.setSubTitle("TVドラマ放映中！");
                novel.setPrice(750 + i);

                bf.add(novel);
            }
        } else {
            if ( bf.readCsv(args[0]) ) {
                System.out.println("ファイルエラー");
                return;
            }
        }

        bf.list();
        bf.list(0);
        bf.list(10);
        bf.list(50);
        bf.list(51);
        bf.list(99);
        bf.list(1000);
    }
}
