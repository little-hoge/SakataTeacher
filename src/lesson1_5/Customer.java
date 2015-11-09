package lesson1_5;

/**
 * @version 1.00, 2015/11/09
 * @author takahashi
 */

public class Customer {
    // メンバ変数(初期値はコンストラクタに移行)
    private String name;
    private int age;
    private boolean gendar;

    // メソッド
    // コンストラクタ(デフォルト)
    Customer(){
        this.name = "山田";
        this.age = 20;
        this.gendar = true;
    }
    // コンストラクタ(オーバーロード)
    Customer(String name){
        this.name = name;
        this.age = 20;
        this.gendar = true;
    }
    // コンストラクタ(オーバーロード)
    Customer(String name, int age, boolean gendar){
        this.name = name;
        this.age = age;
        this.gendar = gendar;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    // カプセル化に伴う追加
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getgendar(){
        if(this.gendar == true){
            return "男性";
        } else {
            return "女性";
        }
    }
    // カプセル化に伴う追加
    public void setgendar(boolean isMale){
        if(isMale == true){
            this.gendar = true;
        } else {
            // ※falseの発音は「ファ」ルスではない
            this.gendar = false;
        }
    }
}


