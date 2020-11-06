public class Messages {
    void startGame(){
        System.out.println("Начало игры!\n\n" + "На столе 20 спичек.\n" +
                "Во время каждого хода можно брать от 1 до 3 спичек.\n\n" +
                "Компьютер делает ход первым.\n" +
                " - Количество спичек, выбранных компьютером, = 3.\n" +
                "На столе осталось 17 спичек.");
    }

    void matchesInGame(int matches) {
        System.out.println("На столе осталось " + matches + " спичек.");
    }

    void playerMove() {
        System.out.println("Ваш ход. Введите количество спичек: ");
    }

    void computerMove(int count, int matches) {
        int countToComputer = 4 - count;
        System.out.println(" - Количество спичек, выбранных компьютером, = " + countToComputer + ".");
    }

    void endGame() {
        System.out.println("Для Вас осталась последняя спичка. Вы проиграли.");
    }

    void error() {
        System.out.println("Неверное количество спичек. Введите от 1 до 3.");
    }
}