package Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height, String color, double bankinh) {
        super(color,bankinh);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getvolume(){
        return getperimeter() * height;
    }
    @Override
    public String toString() {
        return "A Cylinder with color of "
                + getColor()
                + "perimeter"
                + getperimeter()
                +"acreage"
                + getacreage()
                +"volume"
                +getvolume();

    }
}
