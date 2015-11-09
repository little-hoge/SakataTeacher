package lesson1_5;

/**
 * @version 1.00, 2015/11/09
 * @author takahashi
 */

// ☆Java基本構文になれる (複数コンストラクタについての理解、オーバーロード)
public class ClassStudy5 {

    public static void main(String[] args) {
        // yamada satou tanaka インスタンス生成
        Customer yamada = new Customer();
        Customer satou = new Customer("佐藤", 50, false);
        Customer tanaka = new Customer("田中");

        // 変数定義
        satou.setName("佐藤");
        satou.setAge(50);
        satou.setgendar(false);

        // 出力
        System.out.println("yamada");
        System.out.println("name:" + yamada.getName());
        System.out.println("age:" + yamada.getAge());
        System.out.println("gendar:" + yamada.getgendar());
        System.out.println();

        System.out.println("satou");
        System.out.println("name:" + satou.getName());
        System.out.println("age:" + satou.getAge());
        System.out.println("gendar:" + satou.getgendar());
        System.out.println();

        System.out.println("tanaka");
        System.out.println("name:" + tanaka.getName());
        System.out.println("age:" + tanaka.getAge());
        System.out.println("gendar:" + tanaka.getgendar());
        System.out.println();
    }
}
