package ex.hello.phuongtrinh_bac2;

import java.util.Scanner;

public class giai_pt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, denta, x1, x2;
        System.out.println("phương trình bậc 2 ax^2+bx+c=0");
        System.out.println("nhập số a");
        a = input.nextInt();
        System.out.println("nhập số b");
        b = input.nextInt();
        System.out.println("nhập số c");
        c = input.nextInt();
        denta = b * b * 4 * a * c;
        if (denta < 0) {
            System.out.println("phương trình vô nghiệm");
        } else if (denta == 0) {
            x1 = -(b / 2 * a);
            System.out.println("phương trình có nghiệm kép " + x1);
        } else {
            x1 = (-b + Math.sqrt(denta)) / 2 * a;
            x2 = (-b - Math.sqrt(denta)) / 2 * a;
            System.out.println("phương trình có 2 nghiệm là " + x1 + " " + x2);
        }

    }
}
