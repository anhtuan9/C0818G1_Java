package ex.hello.change_arr;

import java.util.Scanner;

public class change_arr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        int index, value;
        System.out.println("nhập số cần thêm");
        value = input.nextInt();
        System.out.println("nhập vị trí cần thay đổi");
        index = (input.nextInt()) - 1;

        if (index >= arr.length && index < 0) {
            System.out.println("vị trí không phù hợp");
        } else {
            for (int i = arr.length - 1; i >= index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = value;
        }
        for (int so : arr){
            System.out.print(so + " ");
        }
    }
}
