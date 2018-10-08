package ex.hello.Palindrome_integer;

public class Palindrome_integer {
    public static int reverse(int number) {
        int temp, reversedNumber = 0;
        while (number > 0) {
            temp = number % 10;
            reversedNumber = reversedNumber * 10 + temp;
            number = number / 10;
        }
        return reversedNumber;
    }
    public static boolean isPalindrome(int number){
        if(number == Palindrome_integer.reverse(number)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(Palindrome_integer.reverse(456123451));
        System.out.println(Palindrome_integer.isPalindrome(465546487));
    }
}
