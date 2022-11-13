package Lesson3_Class;

public class Exercise2 {
    public static void main(String[] args) {
        Vector vectorA = new Vector(3, 5, 7);
        Vector vectorB = new Vector(4, 6, 6);
        System.out.println(vectorA + " + " + vectorB + " = " + vectorA.addition(vectorB));
        System.out.println(vectorA + " - " + vectorB + " = " + vectorA.subtraction(vectorB));
        System.out.println(vectorA + " * 3 = " + vectorA.multiplyByConstant(3));
        System.out.println(vectorA + " * " + vectorB + " = " + vectorA.multiplyScalar(vectorB));
    }
}
