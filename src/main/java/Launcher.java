public class Launcher {
    public static void main(String[] args) {
        Display display = new Display("Chess");
        Gameplay gameplay = new Gameplay();
        display.addListener(gameplay);

        GameEngine gameEngine = new GameEngine(display, gameplay);
        gameEngine.start();
    }
}


// CHECK : 04.02.2023 zmiana aktualnego branchu na inny bez commitowania aby na nowym branchu można było wporwadzać inne zmiany?
// CHECK : 03.02.2023 testy jednostkowe?
// TODO: 04.02.2023 dostosowanie wyświetlania planszy i figur do okna. Na środku okna?
