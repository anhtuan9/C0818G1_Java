package ex.hello.draw;

public class draw {
    public static void main(String[] args) {
        int choice = -1;
        java.util.Scanner input = new java.util.Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i <= 5; i++) {
                        for (int n = 0; n <= i; n++) {
                            System.out.print("*" + " ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (int i = 0; i <= 5; i++) {
                        for (int n = 0; n <= 5; n++) {
                            System.out.print("*" + " ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (int i = 0; i <= 5; i++) {
                        for (int n = 0; n <= 10; n++) {
                            System.out.print("*" + " ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}