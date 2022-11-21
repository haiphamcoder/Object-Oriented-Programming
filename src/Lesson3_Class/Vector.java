package Lesson3_Class;

public class Vector {
    // attributes
    private int x;
    private int y;
    private int z;

    // default constructor
    public Vector() {

    }

    // parameterized constructor
    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public Vector addition(Vector other) {
        return new Vector(x + other.x, y + other.y, z + other.z);
    }

    public Vector subtraction(Vector other) {
        return new Vector(x - other.x, y - other.y, z - other.z);
    }

    public Vector multiplyByConstant(int n) {
        return new Vector(x * n, y * n, z * n);
    }

    public int multiplyScalar(Vector other) {
        return x * other.x + y * other.y + z * other.z;
    }

    @Override
    public String toString() {
        return "(" + x + "; " + y + "; "+ z +")";
    }
}
