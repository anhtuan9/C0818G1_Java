package ex.hello.lottery;

import java.util.Random;
import java.util.Scanner;

public class lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rd = new Random();
        int nhat = rd.nextInt(100), nhi = rd.nextInt(100), ba = rd.nextInt(100), guessDigit1, guessDigit2;

        System.out.println("dự đoán lần đầu");
        guessDigit1 = input.nextInt();
        System.out.println("dự đoán lần hai");
        guessDigit2 = input.nextInt();

        if (guessDigit1 == nhat || guessDigit2 == nhat) {
            System.out.println("bạn trúng giải nhất");
        } else if (guessDigit1 == nhi || guessDigit2 == nhi) {
            System.out.println("bạn đã trúng giải nhì");
        } else if (guessDigit1 == ba || guessDigit2 == ba) {
            System.out.println("bạn đã trúng giải ba");
        } else {
            System.out.println("bạn quá đen");
        }
    }
}