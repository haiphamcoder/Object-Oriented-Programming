package Lesson3_Class;

public class Circle {
    // attributes
    private int radius;

    // default constructor
    public Circle() {

    }

    // parameterized constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    // accessor and mutator methods
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return radius * 2 * Math.PI;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
