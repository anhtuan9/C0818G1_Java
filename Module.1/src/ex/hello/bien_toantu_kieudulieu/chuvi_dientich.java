package ex.hello.bien_toantu_kieudulieu;

import java.util.Scanner;

public class chuvi_dientich {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double Pi = 3.1415;
        double r,s,a;
        System.out.println("nhập bán kính hình tròn");
        r = input.nextDouble();
        a = r * Pi;
        s = r *2 *Pi;
        System.out.println("diện tích hình tròn là " + s);
        System.out.println("chu vi hình tròn là " + a);
    }
}
