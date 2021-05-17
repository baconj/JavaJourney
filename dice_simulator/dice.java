import java.util.Random;

public class dice {
    public static void main(String[] args) {

        Random rollOfDice = new Random();
        int num = 1 + rollOfDice.nextInt(6);

        System.out.println("You rolled a: " + num);
    }
}
