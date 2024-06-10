package Chap08;

public class Accounts {
    public static void main(String[] args) {
        String adachiAccountName    = "足立幸一";
        String adachiAccountNo      = "123456";
        long   adachiAccountBalance = 1000;

        String nakataAccountName    = "仲田真二";
        String nakataAccountNo      = "554321";
        long   nakataAccountBalance = 200;

        adachiAccountBalance -= 200;
        nakataAccountBalance += 100;

        System.out.println("-足立君の口座");
        System.out.println(" 口座名義：" + adachiAccountName);
        System.out.println(" 口座番号：" + adachiAccountNo);
        System.out.println(" 預金残高：" + adachiAccountBalance);

        System.out.println("-仲田君の口座");
        System.out.println(" 口座名義：" + nakataAccountName);
        System.out.println(" 口座番号：" + nakataAccountNo);
        System.out.println(" 預金残高：" + nakataAccountBalance);
    }
}
