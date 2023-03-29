package circle;

import circle.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double volume(){
        return super.area()*height;
    }
}
