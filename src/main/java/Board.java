import java.awt.*;

public class Board {
    private final int SIZE_OF_FIELD = 100;

    void render(Graphics g) {
        g.translate(10, 10);
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

    private void displayNumbers(Graphics g) {// CHECK : 02.02.2023 displayNumbers i displayLetters są bardzo podobne. Czy trzeba to zmienić?
        int yCord = 20;
        for (int i = 8; i > 0; i--) {
            g.setColor(Color.GRAY);
            if (i % 2 != 0) {
                g.setColor(Color.WHITE);
            }
            g.drawString("" + i, 5, yCord);
            yCord += SIZE_OF_FIELD;
        }
    }

    private void displayLetters(Graphics g) {
        char letter = 97;
        int xCord = SIZE_OF_FIELD - 10;
        for (int i = 8; i > 0; i--) {
            g.setColor(Color.GRAY);
            if (i % 2 == 0) {
                g.setColor(Color.WHITE);
            }
            g.drawString("" + letter, xCord, (SIZE_OF_FIELD * 8) - 5);
            xCord += SIZE_OF_FIELD;
            letter++;
        }
    }
}
