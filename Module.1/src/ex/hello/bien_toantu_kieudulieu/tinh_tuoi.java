package ex.hello.bien_toantu_kieudulieu;

import java.util.Scanner;

public class tinh_tuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int namsinh,tuoi;
        System.out.println("nhập năm sinh ");
        namsinh = input.nextInt();
        tuoi = 2018 - namsinh;
        System.out.println("số tuổi của bạn là " + tuoi);
    }
}
