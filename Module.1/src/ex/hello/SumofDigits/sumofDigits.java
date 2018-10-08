package ex.hello.SumofDigits;

public class sumofDigits {
    static public int sumDigits(int n) {
        int sum = 0, balance;
        while (n > 0) {
            balance = n % 10;
            sum += balance;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumofDigits.sumDigits(289391930));
    }
}

