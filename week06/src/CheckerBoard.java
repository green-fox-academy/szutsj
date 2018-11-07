import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.

        int r = 0;
        int g = 0;
        int b = 0;
        int szamlalo = 1;
        for (int x = 0; x < 320; x += 40) {
            for (int y = 0; y < 320; y += 40) {
                graphics.setColor(new Color(r,g,b));
                graphics.fillRect(x, y, 40, 40);
                if (r == 0 && ((szamlalo % 8) != 0)){
                    r = 255;
                    b = 255;
                    g = 255;
                } else if (r == 255 && ((szamlalo % 8) != 0)){
                    r = 0;
                    b = 0;
                    g = 0;
                }
                szamlalo++;
            }
        }
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}