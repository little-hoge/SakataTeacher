package lesson2_2;

/**
 * @version 1.00, 2015/11/09
 * @author takahashi
 */

public class Bookshelf {

    private Book shelf[];
    private int count;
    
    // Book[0～９]確保
    Bookshelf() {
        this.shelf = new Book[10];
        this.count = 0;
    }
    
    // Book情報追加 
    public void add(Book ins){
        this.shelf[count] = ins;
        count++;
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
    
}
