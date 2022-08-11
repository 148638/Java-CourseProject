package preCodedFiles.g;

import java.io.File;
import java.util.Scanner;

public class g_1_FileWriter4 {
    public static String fileName;
    public static String fileLoc;
    public static String fileContents;

    public static void main(String[] args) {
        getFileName();
        getFileContents();
        System.out.println(fileContents + "\n" ); // Print the file Contents
    }

    public static String getFileName() {
        Scanner scanner = new Scanner(System.in); // Create a scanner
        System.out.println("Please insert name of the file:");
        fileName = scanner.nextLine() + ".txt"; // Initialize scanner
        // -> Assign it to a String
        // -> Add .txt for text files
        fileLoc = "src\\fileWriter\\" + fileName; // Assign values to the fileLoc String
        // -> Add the "src\\fileWriter\\" so the file will be located on the correct path
        return fileName + fileLoc; // Return 2 Strings
        // -> Returns the fileName (fileName.txt)
        // -> Returns the fileLoc (src\\fileWriter\\fileName.txt)
    }

    public static String getFileContents() {
        try {
            File file = new File(fileLoc); // Register the File object under the location
            Scanner fileReader = new Scanner(file); // Create a scanner under the "file" object
            fileContents = ""; // First line should not be null
            // -> This prevents that
            while (fileReader.hasNextLine()) { // Initiate the scanner
                fileContents = fileContents + "\n" + fileReader.nextLine(); // Assign the data to the String
            }
            return fileContents; // return fileContents when while is not true
        } catch (Exception e) { // Catch Errors in "try"
            e.printStackTrace();
        }
        return null; // Error
        // -> Returns Nothing
    }
}
