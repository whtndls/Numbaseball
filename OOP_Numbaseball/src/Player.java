import java.util.HashSet;
import java.util.Set;

public class Player {

    private int[] numbers;

    public Player(boolean checkComputer) {
        this.numbers = new int[Game.STRIKE_NUMBER];
        if (checkComputer) {
            computerNumberCreate();
        }
    }

    private void computerNumberCreate() {
        Set<Integer> comNum = new HashSet<>();
        while (comNum.size() < Game.STRIKE_NUMBER) {
            int tempNum = (int)(Math.random() * 9 + 1);
            comNum.add(tempNum);
        }
        int i = 0;
        for (Integer num : comNum)
            numbers[i++] = num;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int[] getNumbers() {
        return numbers;
    }
}