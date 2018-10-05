package ex.Account;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account tuan = new Account();
        tuan.create(12,50000,45);
        String infor = tuan.display();
        System.out.println(infor);
        System.out.println("nhập số tiền cần rút");
        tuan.withdraw(input.nextDouble());
        infor = tuan.display();
        System.out.println(infor);
        System.out.println("nhập số tiền cần thêm");
        tuan.deposit(input.nextDouble());
        infor = tuan.display();
        System.out.println(infor);
    }
}
