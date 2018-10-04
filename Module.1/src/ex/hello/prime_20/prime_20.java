package ex.hello.prime_20;

public class prime_20 {
    public static void main(String[] args) {
        boolean check = true;
        int number = 1;
        for (int cout = 1; cout <= 20; ) {
            if (isprime(number)) {
                System.out.println(number);
                cout++;
            }
            number ++;
        }
    }

    private static boolean isprime(int num) {
        for (int i = 2; i < (num - 1); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}