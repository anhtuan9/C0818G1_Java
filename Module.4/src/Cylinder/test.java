package Cylinder;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Circle a = new Circle("red", 13);
        System.out.println(a.toString());
        Cylinder b = new Cylinder(20,"black",20);
        System.out.println(b.toString());
    }
}
