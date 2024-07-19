package Chap09;

public class DayArrayInit {
    public static void main(String[] args) {
        String[] wd = {"日", "月", "火", "水", "木", "金", "土"};

        Day[] a;
        a = new Day[]{ 
            new Day(1868, 9, 8),
            new Day(1912, 7, 30),
            new Day(1926, 12, 25),
            new Day(1989, 1, 8),
        };

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i].getYear() + "年"
                                + a[i].getMonth() + "月" + a[i].getDate() + "日 (" 
                                + wd[a[i].dayOfWeek()] + ")");
        }
    }
}
