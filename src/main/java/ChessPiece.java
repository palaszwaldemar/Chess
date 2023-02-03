import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class ChessPiece {
    private final int x;
    private final int y;
    private Image image;

    public ChessPiece(int x, int y, NamesOfPawns namesOfPawns) {
        this.x = x;
        this.y = y;
        try {
            BufferedImage bufferedImage = ImageIO.read(Objects.requireNonNull(ChessPiece.class.getResource("/chess pieces/" + namesOfPawns.getName() + ".png")));
            this.image = bufferedImage.getScaledInstance(Board.getSIZE_OF_FIELD(), Board.getSIZE_OF_FIELD(), Image.SCALE_DEFAULT);

        } catch (IllegalArgumentException | IOException e) {
            e.printStackTrace();
        }
    }

    void render(Graphics g) {
        g.drawImage(image, x * Board.getSIZE_OF_FIELD(), y * Board.getSIZE_OF_FIELD(), null);
    }
}
