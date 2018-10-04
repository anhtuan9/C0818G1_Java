package ex.hello.min_in_array;

import java.util.Scanner;

public class min_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] str;
        int cout;
        int min;
        System.out.println("nhập số lượng số cần lọc");
        cout = input.nextInt();
        str = new int[cout];

        for (int i = 0; i < cout; i++) {
            System.out.println("nhập số thứ " + (i + 1));
            str[i] = input.nextInt();
        }
         min = str[0];

        for (int i = 0; i < cout; i++) {
            if (min > str[i]) {
                min = str[i];
            }
        }

        System.out.println(min);
    }
}
