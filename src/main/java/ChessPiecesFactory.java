import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ChessPiecesFactory {
    private final List<Pawn> pawns = new ArrayList<>();

    public ChessPiecesFactory() {
        XCord[] xCords = XCord.values();
        for (int i = 0; i < 8; i++) {
            pawns.add(new Pawn(xCords[i], 2, NamesOfPawns.WHITEPAWN));
            pawns.add(new Pawn(xCords[i], 7, NamesOfPawns.BLACKPAWN));
            if (xCords[i] == XCord.valueOf("A") || xCords[i] == XCord.valueOf("H")) {
                pawns.add(new Pawn(xCords[i], 1, NamesOfPawns.WHITEROOK));
                pawns.add(new Pawn(xCords[i], 8, NamesOfPawns.BLACKROOK));
            }
            if (xCords[i] == XCord.valueOf("B") || xCords[i] == XCord.valueOf("G")) {
                pawns.add(new Pawn(xCords[i], 1, NamesOfPawns.WHITEKNIGHT));
                pawns.add(new Pawn(xCords[i], 8, NamesOfPawns.BLACKKNIGHT));
            }
            if (xCords[i] == XCord.valueOf("C") || xCords[i] == XCord.valueOf("F")) {
                pawns.add(new Pawn(xCords[i], 1, NamesOfPawns.WHITERUNNER));
                pawns.add(new Pawn(xCords[i], 8, NamesOfPawns.BLACKRUNNER));
            }
            if (xCords[i] == XCord.valueOf("D")) {
                pawns.add(new Pawn(xCords[i], 1, NamesOfPawns.WHITEQUEEN));
                pawns.add(new Pawn(xCords[i], 8, NamesOfPawns.BLACKQUEEN));
            }
            if (xCords[i] == XCord.valueOf("E")) {
                pawns.add(new Pawn(xCords[i], 1, NamesOfPawns.WHITEKING));
                pawns.add(new Pawn(xCords[i], 8, NamesOfPawns.BLACKKING));
            }
        }
    }

    void render(Graphics g) {
        for (Pawn pawn : pawns) {
            pawn.render(g);
        }
    }
}


