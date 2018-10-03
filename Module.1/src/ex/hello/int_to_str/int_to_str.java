package ex.hello.int_to_str;

import java.util.Scanner;

public class int_to_str {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số");
        int number = input.nextInt();
        if (number < 0 && number > 1000) {
            System.out.println("out of ability");
        } else if (number <= 10) {
            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("ten");
                    break;
            }
        } else if (number > 10 && number < 20) {
            int donvi = number - 10;
            switch (donvi) {
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fiveteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eightteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;

            }
        } else if (number >= 20 && number < 100) {
            int num = number / 10;
            int num1 = number - num * 10;
            String s = "";
            switch (num1) {
                case 0:
                    s = "";
                    break;
                case 1:
                    s = "one";
                    break;
                case 2:
                    s = "two";
                    break;
                case 3:
                    s = "three";
                    break;
                case 4:
                    s = "four";
                    break;
                case 5:
                    s = "five";
                    break;
                case 6:
                    s = "six";
                    break;
                case 7:
                    s = "seven";
                    break;
                case 8:
                    s = "eight";
                    break;
                case 9:
                    s = "nine";
                    break;
            }
            switch (num) {
                case 2:
                    System.out.println("twenty " + s);
                    break;
                case 3:
                    System.out.println("thirty " + s);
                    break;
                case 4:
                    System.out.println("fourty " + s);
                    break;
                case 5:
                    System.out.println("fivety " + s);
                    break;
                case 6:
                    System.out.println("sixty " + s);
                    break;
                case 7:
                    System.out.println("seventy " + s);
                    break;
                case 8:
                    System.out.println("eighty " + s);
                    break;
                case 9:
                    System.out.println("ninety " + s);
                    break;
            }
        } else if (number >= 100 && number <= 999) {
            int num2 = number / 100;
            int num34 = number - num2 * 100;
            int num3 = num34 / 10;
            int num4 = num34 - num3 * 10;
            String donvi = "";
            String chuc = "";
            switch (num4) {
                case 0:
                    donvi = "";
                    break;
                case 1:
                    donvi = "one";
                    break;
                case 2:
                    donvi = "two";
                    break;
                case 3:
                    donvi = "three";
                    break;
                case 4:
                    donvi = "four";
                    break;
                case 5:
                    donvi = "five";
                    break;
                case 6:
                    donvi = "six";
                    break;
                case 7:
                    donvi = "seven";
                    break;
                case 8:
                    donvi = "eight";
                    break;
                case 9:
                    donvi = "nine";
                    break;
            }
            switch (num3) {
                case 0:
                    chuc = "";
                    break;
                case 1:
                    chuc = "ten";
                    break;
                case 2:
                    chuc = "twenty";
                    break;
                case 3:
                    chuc = "thirty";
                    break;
                case 4:
                    chuc = "fourty";
                    break;
                case 5:
                    chuc = "fivety";
                    break;
                case 6:
                    chuc = "sixty";
                    break;
                case 7:
                    chuc = "seventy";
                    break;
                case 8:
                    chuc = "eighty";
                    break;
                case 9:
                    chuc = "ninety";
                    break;
            }
            switch (num2) {
                case 1:
                    System.out.println("one hundred" + " and " + chuc + " " + donvi);
                    break;
                case 2:
                    System.out.println("two hundred" + " and " + chuc + " " + donvi);
                    break;
                case 3:
                    System.out.println("three hundred" + " and " + chuc + " " + donvi);
                    break;
                case 4:
                    System.out.println("four hundred" + " and " + chuc + " " + donvi);
                    break;
                case 5:
                    System.out.println("five hundred" + " and " + chuc + " " + donvi);
                    break;
                case 6:
                    System.out.println("six hundred" + " and " + chuc + " " + donvi);
                    break;
                case 7:
                    System.out.println("seven hundred" + " and " + chuc + " " + donvi);
                    break;
                case 8:
                    System.out.println("eight hundred" + " and " + chuc + " " + donvi);
                    break;
                case 9:
                    System.out.println("nine hundred" + " and " + chuc + " " + donvi);
                    break;
            }
        }
    }
}

