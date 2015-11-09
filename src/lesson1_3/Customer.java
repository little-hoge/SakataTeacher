package lesson1_3;

/**
 * @version 1.00, 2015/11/09
 * @author takahashi
 */

public class Customer {
    // メンバ変数
    private String name = "山田";
    private int age = 20;       // 隠蔽化
    private boolean gendar = true;

    // メソッド
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


