import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar2 {

    public static void mainDraw(Graphics graphics){
       graphics.setColor(Color.GREEN);

       int[][] coordinates = {{160, 0, 150, 160}, {160, 0, 170, 160}, {160, 320, 170, 160}, {160, 320, 150, 160}};
       Boolean [][] coordinatesToRise = {{true, false}, {true, true}, {false, true}, {false, false}};
       int x1;
       int x2;
       int y1;
       int y2;
       drawALine(graphics, 160, 0, 160, 320);

       for (int i = 0; i < coordinates.length; i++) {

           x1 = coordinates[i][0];
           y1 = coordinates[i][1];
           x2 = coordinates[i][2];
           y2 = coordinates[i][3];

           for (int j = 0; j < 16; j++) {
               drawALine(graphics, x1, y1, x2, y2);
               if (coordinatesToRise[i][0]) {
                   y1 += 10;
               } else {
                   y1 -= 10;
               }
               if (coordinatesToRise[i][1]) {
                  x2 += 10;
               } else {
                  x2 -= 10;
               }
           }
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