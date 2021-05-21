import java.util.Scanner;
public class Logic {

    public static void main(String[] args) {

        int temp = 1;

        if (temp > 30) {
            System.out.println("It is hot outside");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside");
        } else {
            System.out.println("it is cold outside");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")){
            System.out.println("You have quit the game!");
        }else{
            System.out.println("You are still playing the game!");
        }

    }
}
