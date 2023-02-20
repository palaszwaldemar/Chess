public class Launcher {
    public static void main(String[] args) {
        Display display = new Display("Chess");
        Gameplay gameplay = new Gameplay();
        display.addListener(gameplay);

        GameEngine gameEngine = new GameEngine(display, gameplay);
        gameEngine.start();
    }
}

// TODO: 09.02.2023 osobna klasa do organizacji ruchem figur
// CHECK : 03.02.2023 testy jednostkowe?
// TODO: 04.02.2023 dostosowanie wyświetlania planszy i figur do okna. Na środku okna?