import java.util.Random;

public class SchooLpProject {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        System.out.println("Your randomly generated number is: " + randomNumber);
    }
}
