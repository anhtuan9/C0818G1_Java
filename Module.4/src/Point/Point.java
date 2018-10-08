package Point;

public class Point {
    private float x, y;

    public Point() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return "Point" + "\n"
                + "(" + x + "," + y + ")";
    }

    public void move() {
        x += 0;
        y += 0;
    }
}
