package lesson5_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

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
     * コンストラクタ.
     */
    Bookshelf() {
        this.shelf = new ArrayList<Book>();
        //   this.count = 0;
    }

    /**
     * 本棚に本を追加する.
     *
     * @param b 追加する本
     */
    public void add(Book b) {
        this.shelf.add(b);
    }

    /**
     * ｃｓｖからデータを読み込む
     * @param path ｃｓｖファイルのパス
     * @return 正常終了 false 異常終了 true
     */
    public boolean readCsv(String path) {
        File file = new File(path);
        try {

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            StringTokenizer token;

            // 1行ずつ最後まで
            while((line = br.readLine()) != null){
                // 区切り文字","で分割する
                token = new StringTokenizer(line, ",");

                // ,区切りに最後まで
                while (token.hasMoreTokens()) {
                    switch(token.nextToken()){
                    case "Magazine":
                        Magazine magazine = new Magazine("Science");
                        magazine.setTitle(token.nextToken());
                        magazine.setAuthor(token.nextToken());
                        magazine.setPrice(Integer.parseInt(token.nextToken()));
                        magazine.setNumber(Integer.parseInt(token.nextToken()));

                        shelf.add(magazine);
                        break;
                    case "Novel":
                        Novel novel = new Novel();
                        novel.setTitle(token.nextToken());
                        novel.setAuthor(token.nextToken());
                        novel.setPrice(Integer.parseInt(token.nextToken()));
                        novel.setSubTitle(token.nextToken());

                        shelf.add(novel);
                        break;
                    }
                }
            }

            br.close();
            fr.close();
            return false;

            // ファイルインスタンス生成時
        } catch(FileNotFoundException e) {
            //System.out.println(e);
            return true;
            // 読み込み時
        } catch (IOException e) {
            //e.printStackTrace();
            return true;
        }

    }

    /**
     * 本棚の本をすべて表示する.
     */
    public void list() {
        int i = 0;
        Iterator<Book> iterator = shelf.iterator();
        while (iterator.hasNext()){
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
        if (0 <= index && index < this.shelf.size()) {
            Book nowit = this.shelf.get(index);;
            System.out.println("[No." + index + "]");
            System.out.println("Type = " + nowit.getType());
            System.out.println("Title = " + nowit.getTitle());
            System.out.println("Author = " + nowit.getAuthor());
            System.out.println("Price = " + nowit.getPrice());
        } else {
            System.out.println("Invalid index!!");
        }
    }
}
