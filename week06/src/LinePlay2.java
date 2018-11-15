import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlay2 {

  public static void mainDraw(Graphics graphics) {
    int[][] coordinates = {{320, 20, 20, 0}, {0, 20, 20, 320}};
    int[][] colors = {{244, 66, 223}, {75, 244, 66}};
    int x1;
    int x2;
    int y1;
    int y2;

    for (int i = 0; i < coordinates.length; i++) {
      drawPlayLine(graphics, coordinates[i][0], coordinates[i][1], coordinates[i][2], coordinates[i][3], colors[i % 2][0], colors[i % 2][1], colors[i % 2][2]);
    }
  }

  public static void drawPlayLine(Graphics graphics, int x1, int y1, int x2, int y2, int r, int g, int b){
    graphics.setColor(new Color(r, g, b));

    for (int j = 0; j < 15; j++) {
      graphics.drawLine(x1, y1, x2, y2);
      y1 += 20;
      x2 += 20;
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