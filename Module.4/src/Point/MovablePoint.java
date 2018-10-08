package Point;

public class MovablePoint extends Point {
    float xSpeed, ySpeed, Speed;

    public MovablePoint() {
        this.xSpeed = 0;
        this.ySpeed = 0;
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getSpeed() {
        return Speed;
    }

    public void setSpeed(float speed) {
        Speed = speed;
    }

    @Override
    public void move(){
        float a = getX(),b = getY();
        a += xSpeed;
        b += ySpeed;
        this.setXY(a,b);
    }
    @Override
    public String toString() {
        return "MovablePoint\n"
                + "(" + getX() + "," + getY() + ")"
                + "Speed " + "(" + xSpeed + "," + ySpeed + ")";

    }
}
