package preCodedFiles.c;

import java.util.Scanner;

public class c_1_Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create the scanner to scan the console for input
        System.out.println("Please input your name:");
        String nameScanner = scanner.nextLine(); // Assign the scanner to a string
                                           // -> scanner.nextLine() is a method that uses the Scanner to "scan" the next line for any written input
        System.out.println("Hi " + nameScanner + "!"); // println -> Prints the results of the scan
    }
}
