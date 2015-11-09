package lesson1_1;

/**
 * @version 1.00, 2015/11/09
 * @author takahashi
 */


// ☆Java基本構文になれる (インスタンス生成、変数、出力)
public class ClassStudy1 {
    public static void main(String[] args) {
        // yamada インスタンス生成
        Customer yamada = new Customer();

        // 各種ローカル変数に代入生成
        String name = yamada.getName();
        int age = yamada.age;
        String gendar = yamada.getgendar();

        // 出力
        System.out.print(name);
        System.out.print(age);
        System.out.print(gendar);
    }
}
