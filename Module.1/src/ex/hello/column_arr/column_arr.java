package ex.hello.column_arr;

import java.util.Scanner;

public class column_arr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr;
        int witch, height;

        System.out.println("nhập số hàng");
        height = input.nextInt();
        System.out.println("nhập số cột");
        witch = input.nextInt();
        arr = new int[height][witch];

        for (int i = 0; i < height; i++) {
            int[] arr2 = new int[100];
            int x = 1, a = 0;
            String exit = "n", exam;
            while (exit.equals("n")) {
                System.out.println("nhập các giá trị thứ " + x + " bấm y để ngưng");
                x++;
                exam = input.next();
                try {
                    if (exam.equals("y")) {
                        exit = exam;
                    } else if (Integer.parseInt(exam) < 100000) {
                        arr2[a] = Integer.parseInt(exam);
                        a++;
                    } else {
                        System.out.println("nhập sai");
                    }
                } catch (Exception e) {
                    if (exam.equals("y")) {
                        exit = exam;
                    } else {
                        System.out.println("nhập sai");
                    }

                }
            }
            System.out.println("hàng " + i + " của bạn có " + a + " giá trị");
            for (int b = 0; b < witch; b++) {
                arr[i][b] = arr2[b];
            }
        }
        System.out.println("mảng của bạn là");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < witch; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("\n");
        }

        int cot, hang, tongcot = 0, tonghang = 0;
        System.out.println("nhập số cột cần tính tổng");
        cot = input.nextInt();
        for (int i = 0; i < height; i++) {
            tongcot += arr[i][cot - 1];
        }
        System.out.println(tongcot);

        System.out.println("nhập số hàng cần tính tổng");
        hang = input.nextInt();
        for (int i = 0; i < witch; i++) {
            tonghang += arr[hang - 1][i];
        }
        System.out.println(tonghang);

    }
}
