package ex.hello.bien_toantu_kieudulieu;

import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c,f;
        System.out.println("nhập độ C");
        c = input.nextFloat();
        f = c * 1.8+ 32;
        System.out.println("độ F là " + f);
    }
}
