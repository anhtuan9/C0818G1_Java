package ex.hello.Array_total;

import java.util.Scanner;

public class Array_total {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr1, arr2, arr_total, arr_first, arr_second;
        int cot1, cot2, hang1, hang2, hang, cot;
        System.out.println("nhập số hàng của ma trận 1");
        hang1 = input.nextInt();
        System.out.println("nhập số cột của ma trận 1");
        cot1 = input.nextInt();
        arr1 = new int[hang1][cot1];
        for (int i = 0; i < hang1; i++) {
            for (int j = 0; j < cot1; j++) {
                System.out.println("nhập số thứ " + j + " hàng " + i + " của ma trận 1");
                arr1[i][j] = input.nextInt();
            }
        }
        System.out.println("nhập số hang của ma trận 2");
        hang2 = input.nextInt();
        System.out.println("nhập số cột của ma trận 2");
        cot2 = input.nextInt();
        arr2 = new int[hang2][cot2];
        System.out.println("ma trận 1 của bạn là");
        for (int i = 0; i < hang2; i++) {
            for (int j = 0; j < cot2; j++) {
                System.out.println("nhập số thứ " + j + " hàng " + i + " của ma trận 2");
                arr2[i][j] = input.nextInt();
            }
        }
        System.out.println("ma trận 1 của bạn là");
        for (int i = 0; i < hang1; i++) {
            for (int j = 0; j < cot1; j++) {
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("ma trận 2 của bạn là");
        for (int i = 0; i < hang2; i++) {
            for (int j = 0; j < cot2; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println("\n");
        }
        if (hang1 > hang2) {
            hang = hang1;
        } else {
            hang = hang2;
        }
        if (cot1 > cot2) {
            cot = cot1;
        } else {
            cot = cot2;
        }
        arr_total = new int[hang][cot];
        arr_first = new int[hang][cot];
        arr_second = new int[hang][cot];

        for (int i = 0; i < hang1; i++) {
            if (cot1 >= 0) System.arraycopy(arr1[i], 0, arr_first[i], 0, cot1);
        }
        for (int i = 0; i < hang2; i++) {
            if (cot2 >= 0) System.arraycopy(arr2[i], 0, arr_second[i], 0, cot2);
        }

        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                arr_total[i][j] = arr_first[i][j] + arr_second[i][j];
            }

        }
        System.out.println("tổng 2 ma trận của bạn là");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(arr_total[i][j] + "\t");
            }
            System.out.println("\n");
        }

    }
}
