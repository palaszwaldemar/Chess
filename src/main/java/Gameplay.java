import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Gameplay implements MouseListener {
    private final Board board = new Board();
    private Pawn pawn = new Pawn(10, 610);


    public Gameplay() {
    }

    public void tick() {
    }

    public void render(Graphics g) {
        board.render(g);
        pawn.render(g);
    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

//podgląd aktualnego
//postawienie aktualnego chowa podgląd
//również aktywuje przycisk
//również blokuje stawianie klocka
//przycisk zatwierdzenia - naciśnięcie pokazuje podgląd kolejnego
//przyleganie dróg - zezwala lub nie na położenie tile
