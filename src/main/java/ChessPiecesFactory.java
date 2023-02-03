import java.util.ArrayList;
import java.util.List;

public class ChessPiecesFactory {
    private final List<ChessPiece> chessPieces = new ArrayList<>();

    public ChessPiecesFactory() {
        for (int i = 0; i < 8; i++) {
            chessPieces.add(new ChessPiece(i, 6,ChessPieceType.PAWN, ChessPieceColor.WHITE));
            chessPieces.add(new ChessPiece(i, 1, ChessPieceType.PAWN, ChessPieceColor.BLACK));
            if (i == 0 || i == 7) {
                chessPieces.add(new ChessPiece(i, 7, ChessPieceType.ROOK, ChessPieceColor.WHITE));
                chessPieces.add(new ChessPiece(i, 0, ChessPieceType.ROOK, ChessPieceColor.BLACK));
            }
            if (i == 1 || i == 6) {
                chessPieces.add(new ChessPiece(i, 7, ChessPieceType.KNIGHT, ChessPieceColor.WHITE));
                chessPieces.add(new ChessPiece(i, 0, ChessPieceType.KNIGHT, ChessPieceColor.BLACK));
            }
            if (i == 2 || i == 5) {
                chessPieces.add(new ChessPiece(i, 7, ChessPieceType.RUNNER, ChessPieceColor.WHITE));
                chessPieces.add(new ChessPiece(i, 0, ChessPieceType.RUNNER, ChessPieceColor.BLACK));
            }
            if (i == 3) {
                chessPieces.add(new ChessPiece(i, 7, ChessPieceType.QUEEN, ChessPieceColor.WHITE));
                chessPieces.add(new ChessPiece(i, 0, ChessPieceType.QUEEN, ChessPieceColor.BLACK));
            }
            if (i==4) {
                chessPieces.add(new ChessPiece(i, 7, ChessPieceType.KING, ChessPieceColor.WHITE));
                chessPieces.add(new ChessPiece(i, 0, ChessPieceType.KING, ChessPieceColor.BLACK));
            }
        }
    }

    public List<ChessPiece> getPawns() {
        return chessPieces;
    }
}


