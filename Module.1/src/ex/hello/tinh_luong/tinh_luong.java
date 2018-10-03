package ex.hello.tinh_luong;

import java.util.Scanner;

public class tinh_luong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hsl, nlv, luong;
        System.out.println("nhập hệ số lương");
        hsl = input.nextInt();
        System.out.println("nhập số năm làm việc");
        nlv = input.nextInt();
        if (100 < nlv && hsl <= 0) {
            System.out.println("nhập sai");
        }else {
            luong = hsl * 4000000 * nlv * 500000;
            System.out.println("lương của bạn là " + luong);
        }
        }
    }
