package Lesson3_Class;

public class Exercise1 {

    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.printf("Square with side length %d\n\t-Circumference: %d\n\t-Area: %d\n",
                square.getSide(), square.getCircumference(), square.getArea());
        Circle circle = new Circle(4);
        System.out.printf("Circle with radius length %d\n\t-Circumference: %.2f\n\t-Area: %.2f\n"
                , circle.getRadius(), circle.getCircumference(), circle.getArea());
    }
}
