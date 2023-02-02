import java.awt.*;

public class Board {
    private final int HEIGHT_OF_FIELD = 100;
    private final int WIDTH_OF_FIELD = 100;// CHECK : 27.01.2023 zmiana wymiarów pola na parzyste źle rysuje
    private int x = 10;
    private int y = 10;

    void render(Graphics g) {// CHECK : 27.01.2023 render odpala się na okrągło?
        displayChessBoard(g);
        displayInfoAboutFields(g);
    }

    private void displayChessBoard(Graphics g) {
        g.setColor(Color.GRAY);
        for (int y = 0; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if ((y + x) % 2 != 0) {
                    g.fillRect(x * SIZE_OF_FIELD, y * SIZE_OF_FIELD, SIZE_OF_FIELD, SIZE_OF_FIELD);
                }
                g.drawRect(x * SIZE_OF_FIELD, y * SIZE_OF_FIELD, SIZE_OF_FIELD, SIZE_OF_FIELD);
            }
        }
    }

    private void displayInfoAboutFields(Graphics g) {
        displayNumbers(g);
        displayLetters(g);
    }

    private void displayNumbers(Graphics g) {
        for (int i = 8; i > 0; i--) {
            if (((x + y) / 100) % 2 != 0) {
                g.setColor(Color.WHITE);
            } else {
                g.setColor(Color.BLACK);
            }
            g.drawString("" + i, x + 5, y + 20);
            y += HEIGHT_OF_FIELD;
        }
        x = 10;
        y = 10;
    }

    private void displayLetters(Graphics g) {
        char letter = 97;
        for (int i = 8; i > 0; i--) {
            if (((x + y) / 100) % 2 != 0) {
                g.setColor(Color.BLACK);
            } else {
                g.setColor(Color.WHITE);
            }
            g.drawString("" + letter, x + 90, y + 790);
            letter++;
            x += WIDTH_OF_FIELD;
        }
        x = 10;
        y = 10;
    }
}
