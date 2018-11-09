import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics graphics){
        graphics.setColor(Color.GREEN);

        int x1 = 160;
        int y1 = 0;
        int x2 = 160 - 10;
        int y2 = 160;

        for (int i = 0; i < 16 ; i++) {
            drawALine(graphics, x1, y1, x2, y2);
            y1 += 10;
            x2 -= 10;
        }

        x1 = 160;
        y1 = 0;
        x2 = 160 + 10;
        y2 = 160;

        for (int i = 0; i < 16 ; i++) {
            drawALine(graphics, x1, y1, x2, y2);
            y1 += 10;
            x2 += 10;
        }

        x1 = 160;
        y1 = 320;
        x2 = 160 + 10;
        y2 = 160;

        for (int i = 0; i < 16; i++) {
            drawALine(graphics, x1, y1, x2, y2);
            y1 -= 10;
            x2 += 10;
        }


        x1 = 160;
        y1 = 320;
        x2 = 160 - 10;
        y2 = 160;

        for (int i = 0; i < 16; i++) {
            drawALine(graphics, x1, y1, x2, y2);
            y1 -= 10;
            x2 -= 10;
        }

        drawALine(graphics, 160, 0, 160, 320);
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