import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Gameplay implements MouseListener {
    private final Board board = new Board();
    private final ChessPiecesFactory chessPiecesFactory = new ChessPiecesFactory();
    private static ChessPiece actualChessPiece = null;

    public static ChessPiece getActualChessPiece() {
        return actualChessPiece;
    }

    public Gameplay() {
    }

    public void tick() {
    }

    public void render(Graphics g) {
        board.render(g);
        for (ChessPiece chessPiece : chessPiecesFactory.getChessPieces()) {
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
        for (ChessPiece chessPiece : chessPiecesFactory.getChessPieces()) {
            if (Cords.xToCord(e.getX()) == chessPiece.getX() && Cords.yToCord(e.getY()) == chessPiece.getY()) {
                actualChessPiece = chessPiece;
            }
        }
    }

    private void killChessPiece(MouseEvent e) {
        ChessPiece chessPieceToKill = null;
        for (ChessPiece chessPiece : chessPiecesFactory.getChessPieces()) {
            if (Cords.xToCord(e.getX()) == chessPiece.getX() &&
                    Cords.yToCord(e.getY()) == chessPiece.getY() &&
                    !actualChessPiece.getChessPieceColor().equals(chessPiece.getChessPieceColor())) {
                chessPieceToKill = chessPiece;
            }
        }
        chessPiecesFactory.removeChessPieceFromFactory(chessPieceToKill); // CHECK : 07.02.2023 dlaczego to działa?? przecież chessPieceToKill tylko wskazuje na to samo co chessPiece
    }

    private void moveChessPiece(MouseEvent e) {
        for (ChessPiece chessPiece : chessPiecesFactory.getChessPieces()) {
            if (chessPiece == actualChessPiece) {
                chessPiece.setX(Cords.xToCord(e.getX()));
                chessPiece.setY(Cords.yToCord(e.getY()));
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
