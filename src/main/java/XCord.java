public enum XCord {
    A('a'),
    B('b'),
    C('c'),
    D('d'),
    E('e'),
    F('f'),
    G('g'),
    H('h');

    private final char name;

    XCord(char name) {
        this.name = name;
    }

    public char getName() {
        return name;
    }
}
