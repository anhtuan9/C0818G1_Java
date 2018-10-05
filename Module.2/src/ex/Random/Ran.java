package ex.Random;
import java.util.Random;

public class Ran {
    public static void main(String[] args) {
        Random rd = new Random();

        for (int i = 1; i <= 50 ; i ++){
            System.out.println(rd.nextInt(100));
        }
    }
}