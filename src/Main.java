import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ComputerLogic computerLogic = new ComputerLogic();
        Messages messages = new Messages();
        Scanner num = new Scanner(System.in);

        messages.startGame();

        while(computerLogic.matches != 1) {
            messages.playerMove();
            int count = num.nextInt();
            if(count >= 1 && count <= 3) {
                computerLogic.playerCount(count, computerLogic.matches);
                messages.matchesInGame(computerLogic.matches);
                computerLogic.computerCount(count, computerLogic.matches);
                messages.computerMove(count, computerLogic.matches);
                messages.matchesInGame(computerLogic.matches);
            } else {
                messages.error();
            }
            if(computerLogic.matches == 1)
                messages.endGame();
        }
    }
}