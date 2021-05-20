import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args){

        double a;
        double b;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of side a: ");
        a = scanner.nextDouble();
        System.out.println("Enter the length of side b: ");
        b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

        System.out.println("The hypotenuse is "+c+" long");
        
    }
}
