import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {

  public static void mainDraw(Graphics graphics) {
    int quarters = 64;
    int[] yMaxQ = new int[quarters];
    int[] yMinQ = new int[quarters];
    int[] xMaxQ = new int[quarters];
    int[] xMinQ = new int[quarters];
    int[] xStartQ = new int[quarters];
    int[] yStartQ = new int[quarters];
    int[][][] coordinatesQuarters = new int[quarters][2][4];
    int patternInARow = (int) Math.sqrt(quarters);
    int step = 20 / patternInARow;
    int[][] colors = {{244, 66, 223}, {75, 244, 66}};

    fillStartPoints(quarters, yMaxQ, yMinQ, xMaxQ, xMinQ, xStartQ, yStartQ, patternInARow, step);
    fillStartPointArray(quarters, yMaxQ, yMinQ, xMaxQ, xMinQ, xStartQ, yStartQ, coordinatesQuarters);

    for (int j = 0; j < coordinatesQuarters.length; j++) {
      for (int l = 0; l < coordinatesQuarters[l].length; l++) {
        drawPlayLine(graphics, coordinatesQuarters[j][l][0], coordinatesQuarters[j][l][1], coordinatesQuarters[j][l][2], coordinatesQuarters[j][l][3], step, colors[l % 2][0], colors[l % 2][1], colors[l % 2][2]);
      }
    }
  }

  public static void drawPlayLine(Graphics graphics, int x1, int y1, int x2, int y2, int step, int r, int g, int b) {
    graphics.setColor(new Color(r, g, b));

    for (int j = 0; j < 15; j++) {
      graphics.drawLine(x1, y1, x2, y2);
      y1 += step;
      x2 += step;
    }
  }

  public static void fillStartPoints(int quarters, int[] yMaxQ, int[] yMinQ, int[] xMaxQ, int[] xMinQ, int[] xStartQ, int[] yStartQ, int patternInARow, int step) {
    int row = 1;

    for (int i = 0; i < quarters; i++) {
      yMaxQ[i] = row * HEIGHT / patternInARow;
      yMinQ[i] = yMaxQ[i] - HEIGHT / patternInARow;
      xMaxQ[i] = ((i % patternInARow) + 1) * WIDTH / patternInARow;
      yStartQ[i] = yMinQ[i] + step;
      if (i == 0) {
        xMinQ[i] = 0;
        xStartQ[i] = step;
      } else {
        if (xMaxQ[i - 1] == WIDTH) {
          xMinQ[i] = 0;
        } else {
          xMinQ[i] = xMaxQ[i - 1];
        }
        if (xMaxQ[i - 1] == WIDTH) {
          xStartQ[i] = step;
        } else {
          xStartQ[i] = xMaxQ[i - 1] + step;
        }
      }
      if ((i + 1) % patternInARow == 0) {
        row++;
      }
    }
  }

  public static void fillStartPointArray(int quarters, int[] yMaxQ, int[] yMinQ, int[] xMaxQ, int[] xMinQ, int[] xStartQ, int[] yStartQ, int[][][] coordinatesQuarters){

    for (int i = 0; i < quarters; i++) {
      coordinatesQuarters[i][0][0] = xMaxQ[i];
      coordinatesQuarters[i][0][1] = yStartQ[i];
      coordinatesQuarters[i][0][2] = xStartQ[i];
      coordinatesQuarters[i][0][3] = yMinQ[i];
      coordinatesQuarters[i][1][0] = xMinQ[i];
      coordinatesQuarters[i][1][1] = yStartQ[i];
      coordinatesQuarters[i][1][2] = xStartQ[i];
      coordinatesQuarters[i][1][3] = yMaxQ[i];
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