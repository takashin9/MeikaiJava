package Chap09;

import java.util.Scanner;

public class DayArrayError {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String[] wd = {"日", "月", "火", "水", "木", "金", "土"};
        System.out.print("日付の数：");
        int n = stdIn.nextInt();

        Day[] a = new Day[n];
        for (int i = 0; i < n; i++) {
            a[i] = new Day(2002, 1, 1);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + a[i].getYear() + "年"
                                + a[i].getMonth() + "月" + a[i].getDate() + "日 (" 
                                + wd[a[i].dayOfWeek()] + ")");
        }
    }
}
