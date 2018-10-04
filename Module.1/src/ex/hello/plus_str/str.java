package ex.hello.plus_str;

import java.util.Scanner;

public class str {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str1 = new String[5];
        String[] str2 = new String[5];
        String[] str3 = new String[str1.length + str2.length];

        for (int i = 0; i < str1.length; i++) {
            System.out.println("nhập dữ liệu mảng 1");
            str1[i] = input.nextLine();
        }
        for (int i = 0; i < str2.length; i++) {
            System.out.println("nhập dữ liệu mảng 2");
            str2[i] = input.nextLine();
        }

        for (int i = 0; i < str3.length; i++) {
            if (i < str1.length) {
                str3[i] = str1[i];
            } else {
                str3[i] = str2[i - str1.length];
            }
        }
        for (String str : str3) {
            System.out.print(str + " ");
        }
    }
}
