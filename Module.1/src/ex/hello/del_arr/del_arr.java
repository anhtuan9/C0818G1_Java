package ex.hello.del_arr;

import java.util.Scanner;

public class del_arr {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i];
        }
        int del;
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số cần xoá");
        del = input.nextInt();
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == del) {
                for (int b = i; b < arr.length-1; b++) {
                    arr[b] = arr[b + 1];
                }
                check = true;
            }
        }
        if (check == false) {
            System.out.println("không có phần tử trong mảng");
        }
        for (int so : arr) {
            System.out.print(so + " ");
        }
    }
}
