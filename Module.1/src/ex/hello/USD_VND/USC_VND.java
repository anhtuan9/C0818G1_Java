package ex.hello.USD_VND;

import java.util.Scanner;

public class USC_VND {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float vnd, usd;
        System.out.println("nhập số đô ");
        usd = input.nextFloat();
        vnd = usd * 23000;
        System.out.println("số vnd tương ứng là " + vnd);
    }
}
