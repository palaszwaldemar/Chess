import java.awt.*;

public class Pawn {
    private int x;
    private int y;

    public Pawn(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void render(Graphics g) {
        g.setColor(Color.ORANGE);
        g.fillRect(x, y, 50, 50);
    }
}
