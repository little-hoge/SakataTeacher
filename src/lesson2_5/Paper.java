package lesson2_5;

/**
 * @version 1.00, 2015/11/09
 * @author takahashi
 */

public class Paper implements Copyable {

    @Override
    public int getPageCount() {
        return 1;
    }

    @Override
    public void copy(int number) {
        System.out.println(number + "枚、紙をコピーしました");
    }

}
