package org.example;

public class Main {
    public static void main(String[] args) {
        ClubSelector cr = new ClubSelector();

        // 測試案例 t1
        String result1 = cr.choose("男", 29, 190, 23);
        System.out.println("t1 結果: " + result1);

        // 測試案例 t2
        String result2 = cr.choose("女", 29, 172, 25);
        System.out.println("t2 結果: " + result2);
    }
}
