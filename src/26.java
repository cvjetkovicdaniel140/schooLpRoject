import java.util.Scanner;

public class StudyGuide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to your comprehensive study guide!");
        
        // Ask for user input
        System.out.print("Please enter the number of pages you want to read: ");
        int numPages = scanner.nextInt();
        
        // Calculate and display the total time spent reading
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numPages; i++) {
            System.out.println("Page " + (i + 1) + ": Reading...");
        }
        long endTime = System.currentTimeMillis();
        
        // Print the results to the console
        if (startTime >= endTime) {
            System.out.println("You have completed all of the readings!");
        } else {
            System.out.printf("It took you %.2f seconds to read %d pages.", 
                                (endTime - startTime), numPages);
        }
    }
}
