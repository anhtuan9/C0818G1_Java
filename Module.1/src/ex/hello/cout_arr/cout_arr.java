package ex.hello.cout_arr;

import java.util.Objects;
import java.util.Scanner;

public class cout_arr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cout = 0;
        String target;
        System.out.println("nhập số lượng kí tự để lọc ");
        String[] arr = new String[input.nextInt()];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("nhập kí tự thứ " + (i + 1));
            arr[i] = input.next();
        }

        System.out.println("nhập kí tự cần tìm");
        target = input.next();
        for (int i = 0; i< arr.length ; i++){
            if (Objects.equals(arr[i], target)){
                cout +=1;
            }
        }
        if (cout == 0){
            System.out.println("không tìm thấy kí tự");
        }else {
            System.out.println("kí tự xuất hiên " + cout + " lần");
        }

    }
}
