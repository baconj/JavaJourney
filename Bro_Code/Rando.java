import java.util.Random;

public class Rando {

    public static void main(String[] args) {

        Random random = new Random();

        //int x = random.nextInt(6);
        //double y = random.nextDouble();
        boolean z = random.nextBoolean();

        if(z==false){
            System.out.println("Dare");
        }
        else {
            System.out.println("Truth");
        }
    }

}
