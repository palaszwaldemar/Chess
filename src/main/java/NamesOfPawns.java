public enum NamesOfPawns {
    BLACKPAWN("pawnBlack"),
    WHITEPAWN("pawnWhite");

    private final String name;

    NamesOfPawns(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
