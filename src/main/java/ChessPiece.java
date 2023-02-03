import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class ChessPiece {
    private final int x;
    private final int y;
    private BufferedImage bufferedImage;

    public ChessPiece(int x, int y, NamesOfPawns namesOfPawns) {
        this.x = x;
        this.y = y;
        try {
            this.bufferedImage = ImageIO.read(Objects.requireNonNull(ChessPiece.class.getResource("/chess pieces/" + namesOfPawns.getName() + ".png")));

        } catch (IllegalArgumentException | IOException e) {
            e.printStackTrace();
        }
    }

    void render(Graphics g) {
        g.drawImage(bufferedImage, x * Board.getSIZE_OF_FIELD(), y * Board.getSIZE_OF_FIELD(), null);
    }
}
