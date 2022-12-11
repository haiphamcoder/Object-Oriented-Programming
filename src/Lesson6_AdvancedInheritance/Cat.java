package Lesson6_AdvancedInheritance;

import java.awt.*;

public class Cat extends Animal implements CanEat, CanDrink {
    // attribue
    protected String name;

    // methods
    public String getName() {
        return name;
    }

    @Override
    public void drink() {
        System.out.println("drink from Cat");
    }

    @Override
    public void eat() {
        System.out.println("eat from Cat");
    }

    @Override
    public void back(Graphics g, int x, int y) {
        System.out.println("back from Cat");
    }

    @Override
    public void getVelocity(Graphics g) {
        System.out.println("getVelocity from Cat");
    }
}
