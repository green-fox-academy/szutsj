import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

    public static void mainDraw(Graphics graphics) {
        int division = 132;
        int max = 320;
        int numberOfLines = ((int)Math.sqrt(division) * 2 + 1) / 2;

        for (int i = 1; i < numberOfLines; i++) {
            drawALine(graphics, 0,i * max / numberOfLines, max, i * max / numberOfLines);
            drawALine(graphics, i * max / numberOfLines, 0, i * max / numberOfLines, max);
        }
    }

    public static void drawALine(Graphics g, int x1, int y1, int x2, int y2){
        g.drawLine(x1, y1, x2, y2);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 310;

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