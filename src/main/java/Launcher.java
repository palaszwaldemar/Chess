public class Launcher {
    public static void main(String[] args) {
        Display display = new Display("Chess");
        Gameplay gameplay = new Gameplay();
        display.addListener(gameplay);

        GameEngine gameEngine = new GameEngine(display, gameplay);
        gameEngine.start();
    }
}
