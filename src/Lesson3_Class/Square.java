package Lesson3_Class;

public class Square {
    // attributes
    private int side;

    // default constructor
    public Square() {

    }

    // parameterized constructor
    public Square(int side) {
        this.side = side;
    }

    // accessor and mutator methods
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getCircumference() {
        return side * 4;
    }

    public int getArea() {
        return side * side;
    }
}
