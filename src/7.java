import java.util.*;
import java.io.*;

public class SchoolProject {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = input.nextInt();
    
    if (num % 2 == 0) {
      System.out.println("The number is even.");
    } else {
      System.out.println("The number is odd.");
    }
  }
}
