package lesson4_2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author takahashi
 * @version 0.0.1, 2015/12/06
 * @since 0.0.1
 */
public class DayOfWeek {

    public static void main(String[] args) {

        if (args.length < 3){
            System.out.println("年月日を指定してください。");
            System.exit(1);
        }
        Calendar insCalendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日は");
        try {
            insCalendar.set(Integer.parseInt(args[0]), Integer.parseInt(args[1])-1, Integer.parseInt(args[2]));
            System.out.println(sdf.format(insCalendar.getTime()) + getWeekOfDay(insCalendar.get(Calendar.DAY_OF_WEEK)-1) + "曜日です" );
            
        } catch(NumberFormatException nfe) {
            System.out.println("年月日入力が正しくありません");
            System.exit(1);
        }

    }

    /**
     * 曜日の文字列を返す
     * @param weekofday 週の何日目か
     * @return 曜日
     * @version 0.0.1
     */
    private static String getWeekOfDay(int weekofday){
        String[] week_name = {"日", "月", "火", "水", "木", "金", "土"};
        return week_name[weekofday];
    }

}
