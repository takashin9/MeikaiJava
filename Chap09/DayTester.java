package Chap09;

import java.util.Scanner;

public class DayTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] wd = {"日", "月", "火", "水", "木", "金", "土"};

        System.out.println("誕生日を西暦で入力");
        System.out.print("年："); int y = stdIn.nextInt();
        System.out.print("月："); int m = stdIn.nextInt();
        System.out.print("日："); int d = stdIn.nextInt();

        Day birthday = new Day(y, m, d);
        
        System.out.println("あなたの誕生日"
                            + birthday.getYear() + "年"
                            + birthday.getMonth() + "月"
                            + birthday.getDate() + "日は"
                            + wd[birthday.dayOfWeek()] + "曜日です。");

        Day xDay = birthday;

        xDay.set(2024, 7, 5);

        System.out.println("birthday = "
                            + birthday.getYear() + "年"
                            + birthday.getMonth() + "月"
                            + birthday.getDate() + "日 ("
                            + wd[birthday.dayOfWeek()] + ")");

        System.out.println("xDay     = "
                            + xDay.getYear() + "年"
                            + xDay.getMonth() + "月"
                            + xDay.getDate() + "日 ("
                            + wd[xDay.dayOfWeek()] + ")");
    }
}
