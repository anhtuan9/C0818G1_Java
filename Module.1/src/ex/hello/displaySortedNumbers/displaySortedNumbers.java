package ex.hello.displaySortedNumbers;

import java.util.Arrays;

public class displaySortedNumbers {
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double[] arr = {num1, num2, num3};
        double temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        displaySortedNumbers(156168,844,9600);
    }
}
