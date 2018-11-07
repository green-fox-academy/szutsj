import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[][] coordinates = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] coordinates2 = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
        graphics.setColor(Color.GREEN);
        for (int i = 0; i < coordinates.length; i++) {
            if (i == coordinates.length - 1) {
                drawALine(graphics, coordinates[i][0], coordinates[i][1], coordinates[0][0], coordinates[0][1]);
            } else {
                drawALine(graphics, coordinates[i][0], coordinates[i][1], coordinates[i + 1][0], coordinates[i + 1][1]);
            }
        }
        for (int i = 0; i < coordinates2.length; i++) {
            if (i == coordinates2.length - 1) {
                drawALine(graphics, coordinates2[i][0], coordinates2[i][1], coordinates2[0][0], coordinates2[0][1]);
            } else {
                drawALine(graphics, coordinates2[i][0], coordinates2[i][1], coordinates2[i + 1][0], coordinates2[i + 1][1]);
            }
        }

    }

    public static void drawALine(Graphics p, int x1, int y1, int x2, int y2){
        p.drawLine(x1, y1, x2, y2);
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