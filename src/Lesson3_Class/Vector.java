package Lesson3_Class;

public class Vector {
    // attributes
    private int x;
    private int y;

    // default constructor
    public Vector() {

    }

    // parameterized constructor
    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // accessor and mutator methods
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Vector addition(Vector other) {
        return new Vector(this.x + other.x, this.y + other.y);
    }

    public Vector subtraction(Vector other) {
        return new Vector(this.x - other.x, this.y - other.y);
    }

    public Vector multiplyByConstant(int n) {
        return new Vector(this.x * n, this.y * n);
    }

    public int multiplyScalar(Vector other) {
        return this.x * other.x + this.y * other.y;
    }

    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }
}
