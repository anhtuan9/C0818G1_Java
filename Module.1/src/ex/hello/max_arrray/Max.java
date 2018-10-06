package ex.hello.max_arrray;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr;
        int witch, height;

        System.out.println("nhập số hàng");
        height = input.nextInt();
        System.out.println("nhập số cột");
        witch = input.nextInt();
        arr = new int[height][witch];
        int min = 0, max = 0;

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
            if (witch >= 0) System.arraycopy(arr2, 0, arr[i], 0, witch);
        }
        System.out.println("mảng của bạn là");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < witch; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    min = max;
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }

                System.out.print(arr[i][j] + "\t");

            }
            System.out.println("\n");
        }
        System.out.println("giá trị lớn nhất là " + max);
        System.out.print("giá trị nhỏ nhất là " + min);


    }
}
