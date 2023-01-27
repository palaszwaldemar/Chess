import java.awt.*;

public class Board {
    private boolean filedIsBlack;
    private final int HEIGHT_OF_FIELD = 100;
    private final int WIDTH_OF_FIELD = 100;
    private int x = 10;
    private int y = 10;

    void render(Graphics g) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (filedIsBlack) {
                    g.fillRect(x, y, WIDTH_OF_FIELD, HEIGHT_OF_FIELD);
                } else {
                    g.drawRect(x, y, WIDTH_OF_FIELD, HEIGHT_OF_FIELD);
                }
                filedIsBlack = !filedIsBlack;
                x += 100;
            }
            filedIsBlack = !filedIsBlack;
            y += 100;
            x = 10;
        }
        y = 10;
    }
}
