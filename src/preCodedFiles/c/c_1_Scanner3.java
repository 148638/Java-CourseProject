package preCodedFiles.c;

import java.util.Scanner;

public class c_1_Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please input your name:");
            String nameScanner = scanner.nextLine(); // Assigning the value of the next line to a String
            System.out.println("Please input your age:");
            int ageScanner = scanner.nextInt(); // Assigning the value of the next line to a int
            System.out.println("\nProfile:");
            System.out.println("[NAME: " + nameScanner + ", AGE: " + ageScanner + "]");
        }
        catch (Exception e) { // Catch is connected with a try
                              // -> If error occurs it will catch it and prevent any damage
            System.err.println("An error occurred:"); // Great use of the System.err.println
            e.printStackTrace(); // Prints the error to the console
        }
    }
}
