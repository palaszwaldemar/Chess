public class Cords {

    static int letterToPixels(char letter) {
        char[] letters = {97, 98, 99, 100, 101, 102, 103, 104};
        int [] xCords = {10, 110, 210, 310, 410, 510, 610, 710};
        for (int i = 0; i < letters.length; i++) {
            if (letter == letters[i]) {
                return xCords[i];
            }
        }
        return -1;
    }

    static int numberToPixels(int number) {
        char[] numbers = {8, 7, 6, 5, 4, 3, 2, 1};
        int [] yCords = {10, 110, 210, 310, 410, 510, 610, 710};
        for (int i = 0; i < numbers.length; i++) {
            if (number == numbers[i]) {
                return yCords[i];
            }
        }
        return -1;
    }
}
