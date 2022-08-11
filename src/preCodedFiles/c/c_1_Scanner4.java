package preCodedFiles.c;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class c_1_Scanner4 { // Login System
    public static String userInputData;

    // Register the users under an array (not safe for actual login systems)
    public static String[] registeredUsers = {"john-applesmad", "anna-ilovetrees", "bob-iambob", "mary-flowersarecute"};

    public static void main(String[] args) {
        String userInputArray[] = getUserInput().toLowerCase(Locale.ROOT).split("-"); // Assigns the values to an array
                                                                                            // -> Referring the method automatically executes it
        if (Arrays.stream(registeredUsers).toList().contains(userInputData.toLowerCase(Locale.ROOT))) { // If the registeredUsers array contains the userInputData String
            System.out.println("Hello " + userInputArray[0]);
            System.out.println("Password: " + userInputArray[1]);
        } else { // If the username or password are incorrect
            System.err.println("No user found under: " + userInputArray[0] + " With Password: " + userInputArray[1]);
        }
    }
    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in); // Create the scanner
        System.out.println("Please input your name:");
        String name = scanner.nextLine(); // Initiate the scanner -> assigns value to a String called name
        System.out.println("Please input your password:");
        String password = scanner.nextLine(); // Initiate the scanner -> assigns value to a String called password
        userInputData = name + "-" + password;
        return userInputData;
    }
}
