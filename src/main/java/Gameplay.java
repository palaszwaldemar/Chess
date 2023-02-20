import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class Gameplay implements MouseListener {
    private final Board board = new Board(this);
    private final ChessPiecesFactory chessPiecesFactory = new ChessPiecesFactory();
    private ChessPiece actualChessPiece = null;
    private final List<ChessPiece> chessPieces = chessPiecesFactory.createEveryChessPieces();

    ChessPiece getActualChessPiece() {
        return actualChessPiece;
    }

    public void tick() {
    }

    public void render(Graphics g) {
        board.render(g);
        for (ChessPiece chessPiece : new ArrayList<>(chessPieces)) {
            chessPiece.render(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (actualChessPiece != null) {
            killChessPiece(e);
            moveChessPiece(e);
            actualChessPiece = null;
            return;
        }
        chooseChessPiece(e);
    }

    private void killChessPiece(MouseEvent e) {// TODO: 10.02.2023 dodać do nowej klasy zarządzanie ruchami
        ChessPiece chessPieceToKill = null;
        for (ChessPiece chessPiece : new ArrayList<>(chessPieces)) {
            if (Cords.xToCord(e.getX()) == chessPiece.getX() &&
                    Cords.yToCord(e.getY()) == chessPiece.getY() &&
                    !actualChessPiece.getChessPieceColor().equals(chessPiece.getChessPieceColor())) {
                chessPieceToKill = chessPiece;
            }
        }
        chessPieces.remove(chessPieceToKill);
    }

    private void moveChessPiece(MouseEvent e) { // TODO: 10.02.2023 dodać do nowej klasy zarządzanie ruchami
        for (ChessPiece chessPiece : new ArrayList<>(chessPieces)) {
            if (chessPiece.equals(actualChessPiece)) {
                chessPiece.setX(Cords.xToCord(e.getX()));
                chessPiece.setY(Cords.yToCord(e.getY()));
            }
        }
    }

    private void chooseChessPiece(MouseEvent e) {// TODO: 10.02.2023 dodać do nowej klasy zarządzanie ruchami
        for (ChessPiece chessPiece : new ArrayList<>(chessPieces)) {
            if (Cords.xToCord(e.getX()) == chessPiece.getX() && Cords.yToCord(e.getY()) == chessPiece.getY()) {
                actualChessPiece = chessPiece;
            }
        }
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
