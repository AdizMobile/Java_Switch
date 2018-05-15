package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Nhập Vào 1 số xuất ra đó là tháng bao nhiêu. Nếu không đúng thì xuất ra thông báo "Không tồn tại tháng này trong năm".
        System.out.println("Xin Mời Nhập Vào Một Tháng (Từ 1 - 12)" );
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        String thang;
        switch (A){
            case 1:
                thang ="Đây là tháng 1";
                break;
            case 2:
                thang ="Đây là tháng 2";
                break;
            case 3:
                thang ="Đây là tháng 3";
                break;
            case 4:
                thang ="Đây là tháng 4";
                break;
            case 5:
                thang ="Đây là tháng 5";
                break;
            case 6:
                thang ="Đây là tháng 6";
                break;
            case 7:
                thang ="Đây là tháng 7";
                break;
            case 8:
                thang ="Đây là tháng 8";
                break;
            case 9:
                thang ="Đây là tháng 9";
                break;
            case 10:
                thang ="Đây là tháng 10";
                break;
            case 11:
                thang ="Đây là tháng 11";
                break;
            case 12:
                thang ="Đây là tháng 12";
                break;
                default: thang ="Không tồn tại tháng này trong năm";
        }
        System.out.println(thang);
    }
}
