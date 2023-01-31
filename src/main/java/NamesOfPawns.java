public enum NamesOfPawns {
    BLACKPAWN("pawnBlack"),
    WHITEPAWN("pawnWhite");// TODO: 31.01.2023 dodać resztę figur

    private final String name;

    NamesOfPawns(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
