import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Gameplay implements MouseListener {
    private final Board board = new Board();
    private final ChessPiecesFactory chessPiecesFactory = new ChessPiecesFactory();
    private ChessPiece actualChessPiece = null;

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
            moveChessPiece(e);
            return;
        }
        for (int i = 0; i < chessPiecesFactory.getChessPieces().size(); i++) {
            if (Cords.xToCord(e.getX()) == chessPiecesFactory.getChessPieces().get(i).getX() && Cords.yToCord(e.getY()) == chessPiecesFactory.getChessPieces().get(i).getY()) {
                actualChessPiece = chessPiecesFactory.getChessPieces().get(i);
            }
        }
    }

    private void moveChessPiece(MouseEvent e) {
        for (int i = 0; i < chessPiecesFactory.getChessPieces().size(); i++) {
            if (chessPiecesFactory.getChessPieces().get(i).getX() == actualChessPiece.getX() && chessPiecesFactory.getChessPieces().get(i).getY() == actualChessPiece.getY()) {
                chessPiecesFactory.getChessPieces().get(i).setX(Cords.xToCord(e.getX()));
                chessPiecesFactory.getChessPieces().get(i).setY(Cords.yToCord(e.getY()));
                actualChessPiece = null;
                return;
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
