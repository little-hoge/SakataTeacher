package lesson2_1;

/**
 * @version 1.00, 2015/11/09
 * @author takahashi
 */

// ☆Java基本構文になれる (static 定数定義についての理解)
public class ClassStudy6 {

    public static void main(String[] args) {
        // yamada satou tanaka インスタンス生成
        Customer somebody = new Customer();
        Customer satou = new Customer("佐藤", 50, false);
        Customer tanaka = new Customer("田中");

        // staticメソッド呼び出し
        Customer.welcome();

        // 変数定義
        satou.setName("佐藤");
        satou.setAge(50);
        satou.setGendar(false);

        // 出力
        System.out.println("Default");
        showDetail(somebody);
        System.out.println("tanaka");
        showDetail(tanaka);
        System.out.println("satou");
        showDetail(satou);

    }
    // 出力メソッド
    private static void showDetail(Customer ins){
        System.out.println("name:" + ins.getName());
        System.out.println("age:" + ins.getAge());
        System.out.println("gendar:" + ins.getGendar());
        if(ins.getAge() < Customer.AGE_LIMIT){
            System.out.println("購入できません！");
        } else {
            System.out.println("購入できます！");
        }
        System.out.println();
    }
}
