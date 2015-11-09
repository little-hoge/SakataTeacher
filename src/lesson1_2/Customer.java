package lesson1_2;

/**
 * @version 1.00, 2015/11/09
 * @author takahashi
 */

public class Customer {
    // メンバ変数
    private String name = "山田";
    public int age = 20;
    private boolean gendar = true;

    // メソッド
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getgendar(){
        if(this.gendar == true){
            return "男性";
        } else {
            return "女性";
        }
    }
}


