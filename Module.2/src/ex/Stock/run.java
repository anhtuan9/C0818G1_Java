package ex.Stock;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String symbol, name;
        double old, now;
        System.out.println("nhập id cổ phiếu");
        symbol = input.next();
        System.out.println("nhập tên cổ phiếu");
        name = input.next();
        System.out.println("nhập giá hôm qua");
        old = input.nextDouble();
        System.out.println("nhập giá hôm nay");
        now = input.nextDouble();

        Stock stock = new Stock(symbol,name,old,now);
        System.out.println("thông tin: " + stock.display());
        System.out.println("tỉ lệ chuyển đổi: " + stock.getChangePercent());
    }
}
