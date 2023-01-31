public enum NamesOfPawns {
    BLACKPAWN("pawnBlack"),
    WHITEPAWN("pawnWhite"),
    BLACKROOK("rookBlack"),
    WHITEROOK("rookWhite"),
    BLACKKNIGHT("knightBlack"),
    WHITEKNIGHT("knightWhite"),
    BLACKRUNNER("runnerBlack"),
    WHITERUNNER("runnerWhite"),
    BLACKQUEEN("queenBlack"),
    WHITEQUEEN("queenWhite"),
    BLACKKING("kingBlack"),
    WHITEKING("kingWhite");

    private final String name;

    NamesOfPawns(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
