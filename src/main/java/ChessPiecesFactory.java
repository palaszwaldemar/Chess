import java.util.ArrayList;
import java.util.List;

public class ChessPiecesFactory {
    private final List<ChessPiece> chessPieces = new ArrayList<>();

    public ChessPiecesFactory() {
        for (int i = 0; i < 8; i++) {
            chessPieces.add(new ChessPiece(i, 6, NamesOfPawns.WHITEPAWN));
            chessPieces.add(new ChessPiece(i, 1, NamesOfPawns.BLACKPAWN));
            if (i == 0 || i == 7) {
                chessPieces.add(new ChessPiece(i, 7, NamesOfPawns.WHITEROOK));
                chessPieces.add(new ChessPiece(i, 0, NamesOfPawns.BLACKROOK));
            }
            if (i == 1 || i == 6) {
                chessPieces.add(new ChessPiece(i, 7, NamesOfPawns.WHITEKNIGHT));
                chessPieces.add(new ChessPiece(i, 0, NamesOfPawns.BLACKKNIGHT));
            }
            if (i == 2 || i == 5) {
                chessPieces.add(new ChessPiece(i, 7, NamesOfPawns.WHITERUNNER));
                chessPieces.add(new ChessPiece(i, 0, NamesOfPawns.BLACKRUNNER));
            }
            if (i == 3) {
                chessPieces.add(new ChessPiece(i, 7, NamesOfPawns.WHITEQUEEN));
                chessPieces.add(new ChessPiece(i, 0, NamesOfPawns.BLACKQUEEN));
            }
            if (i==4) {
                chessPieces.add(new ChessPiece(i, 7, NamesOfPawns.WHITEKING));
                chessPieces.add(new ChessPiece(i, 0, NamesOfPawns.BLACKKING));
            }
        }
    }

    public List<ChessPiece> getPawns() {
        return chessPieces;
    }
}


