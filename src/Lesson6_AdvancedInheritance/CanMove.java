package Lesson6_AdvancedInheritance;

import java.awt.*;

public interface CanMove {
    void run();

    void back(Graphics g, int x, int y);

    void getVelocity(Graphics g);
}
