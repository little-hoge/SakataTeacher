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

        if(args.length < 1){
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
            int i = 0;
            File file = new File(args[0]);
            try {

                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                // 読み込んだファイルを１行ずつ処理する
                String line;
                StringTokenizer token;
                
                // 区切り文字","で分割する
                while((line = br.readLine()) != null){
                    // 区切り文字","で分割する
                    token = new StringTokenizer(line, ",");

                    // 分割した文字を画面出力する
                    while (token.hasMoreTokens()) {
                        switch(token.nextToken()){
                        case "Magazine":
                            Magazine magazine = new Magazine("Science");
                            magazine.setTitle(token.nextToken() + i);
                            magazine.setAuthor(token.nextToken() + i);
                            magazine.setPrice(Integer.parseInt(token.nextToken()) + i);
                            magazine.setNumber(Integer.parseInt(token.nextToken()));

                            bf.add(magazine);
                            break;
                        case "Novel":
                            Novel novel = new Novel();
                            novel.setTitle(token.nextToken() + i);
                            novel.setAuthor(token.nextToken() + i);
                            novel.setPrice(Integer.parseInt(token.nextToken()) + i);
                            novel.setSubTitle(token.nextToken());
                            
                            bf.add(novel);
                            break;
                        }
                        i++;
                    }
                }

                br.close();
                fr.close();

                // ファイルインスタンス生成時
            } catch(FileNotFoundException e) {
                System.out.println(e);
                System.exit(0);
                // 読み込み時
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(0);
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
