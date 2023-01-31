import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Objects;

public class Pawn {
    private final char letter;
    private final int number;
    private BufferedImage bufferedImage;

    public Pawn(char letter, int number, NamesOfPawns namesOfPawns) {
        String name = namesOfPawns.getName();
        this.letter = letter;
        this.number = number;
        try {
            this.bufferedImage = ImageIO.read(Objects.requireNonNull(Pawn.class.getResource("/chess pieces/pawns/" + name + ".png")));

        } catch (IllegalArgumentException | IOException e) {
            e.printStackTrace();// CHECK : 31.01.2023 czemu ta metoda ?
        }
    }

    void render(Graphics g) {
        g.drawImage(bufferedImage, Cords.letterToPixels(letter), Cords.numberToPixels(number), null);
    }
}
