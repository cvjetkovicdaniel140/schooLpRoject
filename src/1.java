import java.util.Random;

public class SchoolProject {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println("The generated number is: " + randomNumber);
    }
}