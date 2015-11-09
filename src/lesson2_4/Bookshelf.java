package lesson2_4;

/**
 * @version 1.00, 2015/11/09
 * @author takahashi
 */

public class Bookshelf {

    private Book shelf[];
    private int count;

    private static int MAX_SHELF = 10;

    // Book[0～９]確保
    Bookshelf() {
        this.shelf = new Book[10];
        this.count = 0;
    }

    // Book情報追加 
    public void add(Book ins){
        if( count < MAX_SHELF ){
            this.shelf[count] = ins;
            count++;
        } else {
            System.out.println("本棚に格納失敗");
        }
    }

    // 本棚にあるすべての本を出力
    public void list(){
        for(int loop_cnt = 0; loop_cnt < count; loop_cnt++){
            System.out.println("No:" + loop_cnt);
            System.out.println("Type:" + this.shelf[loop_cnt].getType());
            System.out.println("Title:" + this.shelf[loop_cnt].getTitle());
            System.out.println("Author:" + this.shelf[loop_cnt].getAuthor());
            System.out.println("Price:" + this.shelf[loop_cnt].getPrice());
            System.out.println();
        }
    }

    // オーバーロード
    public void list(int index){
        if(index < count){
            System.out.println("[No:" + index + "]");
            System.out.println("Type:" + this.shelf[index].getType());
            System.out.println("Title:" + this.shelf[index].getTitle());
            System.out.println("Author:" + this.shelf[index].getAuthor());
            System.out.println("Price:" + this.shelf[index].getPrice());
        } else {
            System.out.println("範囲外を参照しています");
        }
        System.out.println();
    }
}
