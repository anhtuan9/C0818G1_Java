package Point;

public class test {
    public static void main(String[] args) {
        Point a = new Point(5, 6);
        System.out.println(a.toString());
        MovablePoint b = new MovablePoint(5,6,7,8);
        System.out.println(b.toString());
        b.move();
        System.out.println(b.toString());
        System.out.println(a.toString());

    }
}
