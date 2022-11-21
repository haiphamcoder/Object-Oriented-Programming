package Lesson4_CreationAndUsingClass;

public class TestStringStringBuffer {
    public static void main(String[] args) {
        System.out.println("Task: Add 100000 strings of \"Hello\" together.");
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += "Hello ";
        }
        long end = System.currentTimeMillis();
        System.out.println("Time complete when using addition string: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 10000; i++) {
            buffer.append("Hello ");
        }
        end = System.currentTimeMillis();
        System.out.println("Time complete when using method append() of class StringBuffer: " + (end - start) + "ms");
    }
}
