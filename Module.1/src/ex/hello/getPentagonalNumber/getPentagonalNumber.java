package ex.hello.getPentagonalNumber;

public class getPentagonalNumber {
    public static int PentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void main(String[] args) {
        System.out.println(getPentagonalNumber.PentagonalNumber(5));

    }
}
