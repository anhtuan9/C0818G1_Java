package ex.hello.prime_100;

public class prime_100 {
    public static void main(String[] args) {
        boolean check = true;
        int number;
        for (number = 1; number <= 100; number++) {
            if (isprime(number)) {
                System.out.println(number);
            }
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

