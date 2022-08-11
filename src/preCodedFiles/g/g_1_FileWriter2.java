package preCodedFiles.g;

import java.io.File;
import java.util.Scanner;

public class g_1_FileWriter2 {

    public static String fileName;

    public static void main(String[] args) {
        createFile(); // Refer to createFile method
    }

    public static String getFileName() {
        Scanner scanner = new Scanner(System.in); // Create the scanner object
        System.out.println("Please insert the name of the file:");
        fileName = scanner.nextLine() + ".txt"; // Initialize the scanner
        // -> Assign it to the fileName String
        // -> Include .txt to create a basic text file
        return fileName; // Return modified String
    }

    public static void createFile() {
        getFileName();
        String fileLoc = "src\\fileWriter\\" + fileName; // Location for the files
        try {
            File file = new File(fileLoc);
            if (file.createNewFile()) { // File Created
                System.out.println("Creating file in: " + fileLoc);
            } else { // Error in file Creation
                System.out.println("Failed to create file in: " + fileLoc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
