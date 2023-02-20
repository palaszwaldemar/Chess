import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class ChessPiece {
    private int x;
    private int y;
    private BufferedImage bufferedImage;
    private final ChessPieceColor chessPieceColor;

    public ChessPiece(int x, int y, ChessPieceType chessPieceType, ChessPieceColor chessPieceColor) {
        this.x = x;
        this.y = y;
        this.chessPieceColor = chessPieceColor;
        try {
            bufferedImage = ImageIO.read(Objects.requireNonNull(ChessPiece.class.getResource("/chess pieces/" + chessPieceType.getName() + chessPieceColor.getName() + ".png")));
        } catch (IllegalArgumentException | IOException e) {
            e.printStackTrace();
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public ChessPieceColor getChessPieceColor() {
        return chessPieceColor;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    void render(Graphics g) {
        g.drawImage(bufferedImage, x * Board.SIZE_OF_FIELD, y * Board.SIZE_OF_FIELD, Board.SIZE_OF_FIELD, Board.SIZE_OF_FIELD, null);
    }
}
