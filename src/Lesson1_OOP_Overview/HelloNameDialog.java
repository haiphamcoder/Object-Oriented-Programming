package Lesson1_OOP_Overview;

import javax.swing.*;

public class HelloNameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Hay nhap ten cua ban: ");
        if (name != null && !name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Xin chao " + name + "!");
        }
        System.exit(0);
    }
}
