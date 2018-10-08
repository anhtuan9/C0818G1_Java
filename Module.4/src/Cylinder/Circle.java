package Cylinder;

public class Circle {
    private double bankinh;
    private String color;

    public Circle() {
        this.color = "RED";
    }

    public Circle(String color, double bankinh) {
        this.color = color;
        this.bankinh = bankinh;
    }

    public double getBankinh() {
        return bankinh;
    }

    public String getColor() {
        return color;
    }


    public double getacreage() {
        return this.bankinh * 2 * 3.14;
    }

    public double getperimeter() {
        return this.bankinh * this.bankinh * 3.14;
    }


    @Override
    public String toString() {
        return "A Circle with color of "
                + getColor()
                + "perimeter"
                + getperimeter()
                + "acreage"
                + getacreage();

    }
}
