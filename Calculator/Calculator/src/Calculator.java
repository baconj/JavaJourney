import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        Scanner jaime = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter first num: ");
        fnum = jaime.nextDouble();
        System.out.println("Enter second num: ");
        snum = jaime.nextDouble();
        answer = fnum + snum;
        System.out.println("The sum is: " + answer);
    }
}
