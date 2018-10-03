package ex.hello.bien_toantu_kieudulieu;

import java.util.Scanner;

public class diem_TB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float vatly,hoahoc,sinhhoc,tb;
        System.out.println("nhập điểm Vật lý");
        vatly = input.nextInt();
        System.out.println("nhập điểm hoá học");
        hoahoc = input.nextInt();
        System.out.print("nhập điểm sinh học");
        sinhhoc = input.nextInt();
        tb = (vatly + hoahoc + sinhhoc)/3;
        System.out.println("điểm TB của bạn là" + tb);
    }
}