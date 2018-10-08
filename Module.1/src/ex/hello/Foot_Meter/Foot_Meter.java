package ex.hello.Foot_Meter;

public class Foot_Meter {
    public static double footToMeter(double foot){
        return 0.305 * foot;
    }
    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        System.out.println(footToMeter(123156));
        System.out.println(meterToFoot(2514));
    }
}
