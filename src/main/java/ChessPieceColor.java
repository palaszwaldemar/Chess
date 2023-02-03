public enum ChessPieceColor {
    WHITE("White"),
    BLACK("Black");

    private final String name;

    ChessPieceColor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
