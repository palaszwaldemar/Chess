import java.awt.*;

public class Board {
    private final int HEIGHT_OF_FIELD = 100;// CHECK : 27.01.2023 czy te pola powinienem umieścić w metodzie render?
    private final int WIDTH_OF_FIELD = 100;// CHECK : 27.01.2023 zmiana wymiarów pola na parzyste źle rysuje
    private int x = 10;
    private int y = 10;

    void render(Graphics g) {// CHECK : 27.01.2023 render odpala się na okrągło?
        displayChessBoard(g);
        displayInfoAboutFields(g);
    }

    private void displayChessBoard(Graphics g) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (((x + y) / 100) % 2 != 0) {
                    g.fillRect(x, y, WIDTH_OF_FIELD, HEIGHT_OF_FIELD);
                } else {
                    g.drawRect(x, y, WIDTH_OF_FIELD, HEIGHT_OF_FIELD);
                }
                x += WIDTH_OF_FIELD;
            }
            y += HEIGHT_OF_FIELD;
            x = 10;
        }
        y = 10;
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
