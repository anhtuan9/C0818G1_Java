package ex.StopWatch;

public class run {
    public static void main(String[] args) {
        StopWatch time = new StopWatch();
        int a = time.start();
        System.out.println(time.start());
        long i = 0, j = 0, x = 0;
        while (i < 1000000000) {
            while (j < 100000000) {
                while (x < 1000000000) {
                    x++;
                }
                j++;
            }
            i++;

        }
        int b = time.end();
        System.out.println(time.end());
        System.out.println(time.getElapsedTime(b,a));
    }
}
