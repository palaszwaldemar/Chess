import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class ChessPiece {
    private int x;
    private int y;
    private Image image;
    private  final ChessPieceColor chessPieceColor;

    public ChessPiece(int x, int y, ChessPieceType chessPieceType, ChessPieceColor chessPieceColor) {
        this.x = x;
        this.y = y;
        this.chessPieceColor = chessPieceColor;
        try {
            BufferedImage bufferedImage = ImageIO.read(Objects.requireNonNull(ChessPiece.class.getResource("/chess pieces/" + chessPieceType.getName() + chessPieceColor.getName() + ".png")));
            this.image = bufferedImage.getScaledInstance(Board.getSIZE_OF_FIELD(), Board.getSIZE_OF_FIELD(), Image.SCALE_DEFAULT); // CHECK : 03.02.2023 możliwość zmiany rozmiaru figur szachowych ze zmianą rozmiaru szachownicy
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
        g.drawImage(image, x * Board.getSIZE_OF_FIELD(), y * Board.getSIZE_OF_FIELD(), null);
    }
}
