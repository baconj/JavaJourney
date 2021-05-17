import java.util.Random;

public class dice {
    public static void main(String[] args) {

        Random rollOfDice = new Random();
        int num = 1 + rollOfDice.nextInt(6);

        switch (num) {
            case 1: System.out.println("You rolled a 1!");
            break;
            case 2: System.out.println("You rolled a 2!");
            break;
            case 3: System.out.println("You rolled a 3!");
            break;
            case 4: System.out.println("You rolled a 4!");
            break;
            case 5: System.out.println("You rolled a 5!");
            break;
            case 6: System.out.println("You rolled a 6!");
            break;
        }

    }
}
