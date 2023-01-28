import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Pawn {
    private int x;
    private int y;
    private BufferedImage bufferedImage;

    public Pawn(int x, int y) {
        this.x = x;
        this.y = y;
        try {
            this.bufferedImage = ImageIO.read(Objects.requireNonNull(Pawn.class.getResource("/chess pieces/pawns/whitePawn.png")));

        } catch (IllegalArgumentException | IOException e) {
            System.out.println("błąd"); // TODO: 28.01.2023 usunąć
        }
    }

    void render(Graphics g) {
        g.drawImage(bufferedImage, x, y, null);
    }
}
