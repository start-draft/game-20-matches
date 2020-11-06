public class ComputerLogic{
    int matches = 17;

    public void playerCount(int count, int matches) {
        matches -= count;
        this.matches = matches;
    }

    public void computerCount(int count, int matches) {
        int countToComputer = 4 - count;
        matches -= countToComputer;
        this.matches = matches;
    }
}