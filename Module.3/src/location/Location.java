package location;

import java.util.Scanner;

public class Location {
    static Scanner input = new Scanner(System.in);
    private static int row , column,a = 1;
    private static int maxValue = 0;
    private static int[][] arr;
    public Location(int row, int column){
        this.row = row;
        this.column = column;
    }
    static public void locateLargest(int row, int column) {
        arr =new int[column][row];
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.println("nhập số thứ " + a);
                a++;
                arr[i][j] = Integer.parseInt(input.next());
                if (maxValue < arr[i][j]) {
                    maxValue = arr[i][j];
                }
            }
        }
    }

    public static int getMaxValue() {
        return maxValue;
    }
}
