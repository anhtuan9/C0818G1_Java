package ex.hello.caro;

import java.util.Scanner;

public class caro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int height, width, x1, y1, x2, y2;
        System.out.println("nhập chiều dài của bàn cờ");
        height = input.nextInt();
        System.out.println("nhập chiều ngang của bàn cờ");
        width = input.nextInt();
        String[][] save_arr = new String[width][height];
        boolean game = true;
        while (game) {
            boolean dieukien1 = false, dieukien2 = false;
            for (int i = 0; i < width; i++) {
                System.out.print("--");
            }
            System.out.print("-");
            System.out.print("\n");
            for (int dong = 0; dong < height; dong++) {
                for (int j = 0; j < width; j++) {
                    if (save_arr[dong][j] == null) {
                        System.out.print("|" + " ");
                    } else {
                        System.out.print("|" + save_arr[dong][j]);
                    }
                }
                System.out.print("|");
                System.out.print("\n");
                for (int i = 0; i < width; i++) {
                    System.out.print("--");
                }
                System.out.print("-");
                System.out.print("\n");
            }
            int a = 0;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (save_arr[i][j] == null) {
                        a++;
                    }
                }
            }
            if (a == 0){
                System.out.println("hết chỗ r");
                break;
            }
            while (!dieukien1) {
                System.out.println("nhập toạ độ x1");
                x1 = input.nextInt();
                System.out.println("nhập toạ độ y1");
                y1 = input.nextInt();
                if (x1 >= width || y1 >= height) {
                    System.out.println("nhập sai");
                } else if (save_arr[x1][y1] == null) {
                    save_arr[x1][y1] = "X";
                    dieukien1 = true;
                } else {
                    System.out.println("nhập lại");
                }
            }
            int b = 0;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (save_arr[i][j] == null) {
                        b++;
                    }
                }
            }
            if (b == 0){
                System.out.println("hết chỗ r");
                break;
            }
            while (!dieukien2) {
                System.out.println("nhập toạ độ x2");
                x2 = input.nextInt();
                System.out.println("nhập toạ độ y2");
                y2 = input.nextInt();
                if (x2 >= width || y2 >= height) {
                    System.out.println("nhập sai");
                } else if (save_arr[x2][y2] == null) {
                    save_arr[x2][y2] = "O";
                    dieukien2 = true;
                } else {
                    System.out.println("nhập lại");
                }
            }

        }
    }
}
