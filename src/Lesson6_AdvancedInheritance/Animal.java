package Lesson6_AdvancedInheritance;

import java.awt.*;

public abstract class Animal implements CanMove {
    // attribute
    protected String name;

    //methods
    @Override
    public void run() {
        System.out.println("run from Animal");
    }
}
