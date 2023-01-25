import java.awt.*;

public class Board {
    private boolean filedIsBlack;

    void render(Graphics g) {
        for (int i = 0, y = 10; i < 8; i++, y += 100) {
            for (int j = 0, x = 10; j < 8; j++, x += 100) {
                if (filedIsBlack) {
                    g.fillRect(x, y, 100, 100);
                } else {
                    g.drawRect(x, y, 100, 100);
                }
                filedIsBlack = !filedIsBlack;
            }
            filedIsBlack = !filedIsBlack;
        }
    }
}
