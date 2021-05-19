import java.util.Scanner;

public class UserInput {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        scanner.nextLine();/* Must be added in order to clear the scanner
         otherwise \n is trapped in the scanner and it skips the "What is your
         favorite food */

        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello "+name);
        System.out.println("You are "+age+" years old");
        System.out.println("You like "+food);
    }
}
