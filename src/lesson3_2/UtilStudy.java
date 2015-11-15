package lesson3_2;

/**
 * java.utilパッケージの練習
 *
 * @author takahashi
 *
 */
/**
 * @author little@hoge
 * @version 0.0.1, 2015/11/15
 * @since 0.0.1
 */
/**
 * @author little@hoge
 * @version 0.0.1, 2015/11/15
 * @since 0.0.1
 */
public class UtilStudy {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String s1 = "This is a pen. That is a book. Is this a car?";
        String s2 = "これはペンです。あれは本です。これは車ですか?";

        // s1, s2の文字数をそれぞれ表示しなさい。
        System.out.println("s1 = "+s1.length());
        System.out.println("s2 = "+s2.length());

        // s1で2個目の"."は先頭から何文字目か表示しなさい。
        int strindex = s1.indexOf('.');
        System.out.println("先頭から " + s1.indexOf('.', strindex) + "文字目");

        // s2の先頭から3文字目～4文字目"ペン"を切り取って表示しなさい。
        System.out.println(s2.substring(3,5));

        // s2で"は"が何回出現するか表示しなさい。
        System.out.println("’は’は" + CharCount(s2,'は') + "回");


        String strInt = "12";
        String strLong = "-9876543210";

        // strIntに格納された数の分だけ"*"を表示しなさい
        for(int i = 0; i <= Integer.parseInt(strInt); i++){
            System.out.print("*");
        }
        System.out.println();

        // strLongに格納された数を5で割るといくつになるか表示しなさい
        long intnum = Long.parseLong(strLong);
        System.out.println(intnum/5);

        // 半径が10cmの円の面積を表示しなさい
        System.out.println((float)10*10*Math.PI+"cm2");

        // 二辺が3cmと5cmの直角三角形の斜辺の長さを表示しなさい
        System.out.println((float)Math.sqrt(3 * 3 + 5 * 5));

    }



    /**
     * 該当文字文字がいくつ存在するかを計算し検出した数を返す
     * @author little@hoge
     * @param str 検索する文字列
     * @param searchstr 検索文字
     * @return cnt 該当文字数
     * @since 0.0.1
     */
    private static int CharCount(String str, char searchstr){
        int cnt = 0;
        for(int loopnum = 0; loopnum < str.length(); loopnum++){
            if(str.charAt(loopnum) == searchstr){
                cnt++;
            }
        }
        return cnt;
    }

}
