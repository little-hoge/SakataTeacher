package lesson3_other;

import java.io.*;
import java.util.Calendar;

/**
 * @author takahashi
 * @version 0.0.1, 2015/11/15
 */
public class other {

    public static void main(String[] args) {
        String str = "D:\\開発\\eclipse開発\\SakataTeacher\\src\\lesson3_other\\test.txt";

        // 入力ストリームの生成
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            for(int cnt = 1;; cnt++){
                System.out.println(cnt + "回目メソッドテスト...");
                System.out.println("1：入力 \n2:ファイル \n3:時間 \nその他:終了");

                int readstr = Integer.parseInt(br.readLine());

                switch(readstr){
                case 1:
                    Inputprint();
                    break;
                case 2:
                    Fileshow(str);
                    break;
                case 3:
                    Nowtime();
                    break;
                default:
                    cnt = 0;
                    return;
                }
                System.out.println();
                if(cnt == 0) break;
            }
        } catch(IOException e) {
            System.out.println("Exception :" + e);
        } catch(NumberFormatException e) {
            // 指定外入力
            System.out.println("入力エラー");
        }


    }

    /**
     * 現在日時表示
     * @author takahashi
     * @since 0.0.1
     */
    public static void Nowtime() {
        //インスタンス化
        Calendar now = Calendar.getInstance(); 

        int y = now.get(now.YEAR);       //年を取得
        int m = now.get(now.MONTH) + 1;  //月を取得(※1)
        int d = now.get(now.DATE);       //日を取得
        int h = now.get(now.HOUR);       //時を取得
        int m2 = now.get(now.MINUTE);     //分を取得
        int s = now.get(now.SECOND);     //秒を取得

        //表示
        System.out.println(y+"年"+m+"月"+d+"日");
        System.out.println(h+"時"+m2+"分"+s+"秒");
    }


    /**
     * ファイル読み込み表示
     * @author takahashi
     * @since 0.0.1
     */
    public static void Fileshow(String str){
        File file = new File(str);
        try {

            //String path = new File(".").getAbsoluteFile().getParent();
            //System.out.println(path);

            FileReader filereader = new FileReader(file);
            int ch;
            while((ch = filereader.read()) != -1){
                System.out.print((char)ch);
            }

            filereader.close();

            // ファイルインスタンス生成時
        } catch(FileNotFoundException e) {
            System.out.println(e);
            // 読み込み時
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 入力後表示
     * @author takahashi
     * @since 0.0.1
     */
    public static void Inputprint(){
        try {
            //入力ストリームの生成
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            //System.in.close(); エラーテスト
            String str = br.readLine();
            System.out.println("今入力されたデータは:" + str + "です");

        } catch(IOException e) {
            System.out.println("Exception :" + e);
        }
    }


}
