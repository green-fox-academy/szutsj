import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawFractal {

  public static void mainDraw(Graphics graphics){
    int xstart = 0;
    int ystart = 0;
    int size = WIDTH;
    int limit = 5;

    drawFractal(graphics, xstart, ystart, size, limit);

  }

  public static void drawFractal(Graphics g, int x, int y, int size, int limit) {
    if (limit > 0) {


      g.drawLine(x + size /3, y + 0, x + size / 3, y + size);
      g.drawLine(x + 2 * size /3, y + 0, x + 2 * size / 3, y + size);
      g.drawLine( x + 0, y + size /3,x + size, y + size / 3);
      g.drawLine(x + 0, y + 2 * size / 3, x + size, y + 2 * size / 3);

      drawFractal(g, x + size / 3, y + 0, size / 3, limit -1);
      drawFractal(g, x + 0, y + size / 3, size / 3, limit -1);
      drawFractal(g, x + 2 * size / 3, y + size / 3, size / 3, limit -1);
      drawFractal(g, x + size / 3, y + 2 * size / 3, size / 3, limit -1);

    }
  }

  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

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
      this.setBackground(Color.YELLOW);
      mainDraw(graphics);
    }
  }
}






