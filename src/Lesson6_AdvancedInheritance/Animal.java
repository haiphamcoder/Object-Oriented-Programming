package Lesson6_AdvancedInheritance;

import java.awt.*;

public class Animal implements CanMove {
    // attribute
    protected String name;

    //methods
    @Override
    public void run() {
        System.out.println("run from Animal");
    }

    @Override
    public void back(Graphics g, int x, int y) {
        System.out.println("back from Animal");
    }

    @Override
    public void getVelocity(Graphics g) {
        System.out.println("getVelocity from Animal");
    }
}
