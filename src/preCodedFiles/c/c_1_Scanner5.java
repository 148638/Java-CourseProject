package preCodedFiles.c;

import java.util.Locale;
import java.util.Scanner;

public class c_1_Scanner5 {
    public static String paragraph;
    public static String exitWriter = "ExitWriter"; // Write this in the paragraph for the scanner to close


    public static void main(String[] args) {
        System.out.println(getInputParagraph()); // Refer to the getInputParagraph method -> Automatically executes the method
    }

    public static String getInputParagraph() {
        Scanner scanner = new Scanner(System.in); // Create the scanner object
        System.out.println("Please insert you paragraph:");
        while (scanner.hasNextLine()) { // Initialize scanner object
            paragraph = paragraph + "\n" + scanner.nextLine(); // Utilize scanner object to bind values to a String
            if (paragraph.toLowerCase().contains(exitWriter.toLowerCase(Locale.ROOT))) { // If the paragraph String contains the exitWriter
            return paragraph;                                                            // -> return the paragraph and stop
            }
        }
        return null;
    }
}
