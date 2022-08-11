package preCodedFiles.c;

import java.util.Scanner;

public class c_1_Scanner2 { // Scanner with integers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Register and create the scanner
        System.out.println("Please input your age:");
        int ageScanner = scanner.nextInt(); // Assign the scanner to an int
                                            // -> scanner.nextInt() is a method that uses the Scanner to "scan" the next int for any written input
        System.out.println(ageScanner + " years");
    }
}
