import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Gameplay implements MouseListener {
    private final Board board = new Board();
    private final Pawn blackPawn1 = new Pawn('a', 7, NamesOfPawns.BLACKPAWN);// CHECK : 31.01.2023 czy dobrym pomysłem jest tworzenie pionków poprzez dodanie enum do liter i liczb
    private final Pawn whitePawn1 = new Pawn('a', 2, NamesOfPawns.WHITEPAWN);


    public Gameplay() {
    }

    public void tick() {
    }

    public void render(Graphics g) {
        board.render(g);
        blackPawn1.render(g);
        whitePawn1.render(g);
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
