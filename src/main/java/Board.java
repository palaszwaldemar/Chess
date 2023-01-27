import java.awt.*;

public class Board {
    private final int HEIGHT_OF_FIELD = 100;// CHECK : 27.01.2023 czy te pola powinienem umieścić w metodzie render?
    private final int WIDTH_OF_FIELD = 100;
    private int x = 10;
    private int y = 10;

    void render(Graphics g) {// CHECK : 27.01.2023 render odpala się na okrągło?
        displayChessBoard(g);
    }

    private void displayChessBoard(Graphics g) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (((x + y) / 100) % 2 != 0 ) {
                    g.fillRect(x, y, WIDTH_OF_FIELD, HEIGHT_OF_FIELD);
                } else {
                    g.drawRect(x, y, WIDTH_OF_FIELD, HEIGHT_OF_FIELD);
                }
                x += 100;
            }
            y += 100;
            x = 10;
        }
        y = 10;
    }
}
