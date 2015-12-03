// パッケージ名jp.java1.lesson3想定
package lesson3_3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author little@hoge
 * @version 0.0.1, 2015/12/03
 * @since 0.0.1
 */
public class CalendarStudy {

    public static void main(String[] args) {
        String[] week_name = {"日", "月", "火", "水", "木", "金", "土"};
        Calendar inscalendar = Calendar.getInstance();

        // 1
        int year = inscalendar.get(Calendar.YEAR);
        int month = inscalendar.get(Calendar.MONTH) + 1;
        int day = inscalendar.get(Calendar.DATE);
        int hour = inscalendar.get(Calendar.HOUR_OF_DAY);
        int minute = inscalendar.get(Calendar.MINUTE);
        int second = inscalendar.get(Calendar.SECOND);
        int msecond = inscalendar.get(Calendar.MILLISECOND);
        int week = inscalendar.get(Calendar.DAY_OF_WEEK) - 1;

        // 2
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd(E) HH:mm:ss SSS");
        System.out.println("今日は" + sdf.format(inscalendar.getTime()));

        // 3
        System.out.printf("年:%d\n", year);
        System.out.printf("月:%d\n", month);
        System.out.printf("日:%d\n", day);
        System.out.printf("曜日:%s\n", week_name[week]);
        System.out.printf("時:%d\n", hour);
        System.out.printf("分:%d\n", minute);
        System.out.printf("秒:%d\n", second);
        System.out.printf("ms:%d\n", msecond);
        System.out.printf("今年の%d日目\n", inscalendar.get(Calendar.DAY_OF_YEAR));
        System.out.printf("今年の%d週目\n", inscalendar.get(Calendar.WEEK_OF_YEAR));
        System.out.printf("今月の%d週目\n", inscalendar.get(Calendar.WEEK_OF_MONTH));

        // 4
        System.out.println();

        // 5
        Calendar lastday = Calendar.getInstance();
        lastday.set(2016,0,1);// 1/1
        long lasttime = lastday.getTimeInMillis() - inscalendar.getTimeInMillis();
        System.out.printf("今年も残り%d日ですね！", lasttime / (long)(1000*60*60*24));

    }

}
