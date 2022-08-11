package preCodedFiles.g;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class g_1_FileWriter3 {
    public static boolean fileExists;
    public static String fileLoc;
    public static String fileName;
    public static String contents;

    public static void main(String[] args) {
        getFileName(); // Get the specified file name
        // -> Utilizing a scanner
        contents = "[" + fileName + "]"; // Change the String to have the fileName at the top
        // -> Otherwise first line in the file will be "null"
        getFileExisting(); // Find the file
        // -> if not give error
        if (fileExists == false) {
            System.err.println("Error Occurred when locating: " + fileName);// Error Occurred
            return; // Ends the process
        }
        editFile(); // ✅Filename collected, ✅File found
        // -> File Data collection
    }

    public static String getFileName() {
        Scanner scanner = new Scanner(System.in); // Create a scanned
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

    public static boolean getFileExisting() {
        File fileExisting = new File(fileLoc); // Create an instance of "File"
        if (fileExisting.exists()) { // File exists
            fileExists = true;
            System.out.println("\nFound File!\n");
        } else { // File does not exist
            fileExists = false;
        }
        return fileExists; // Return fileExists boolean
    }


    public static void editFile() {
        Scanner scanner = new Scanner(System.in); // Create a scanner object
        System.out.println("Please provide text to place into file:");
        try {
            while (scanner.hasNextLine()) { // Initialize the scanner
                String exitTextWriter = "exitFile"; // Used to exit the scanner object
                contents = contents + "\n" + scanner.nextLine(); // Assign the contents
                // -> Add contents from last line
                // -> Add a line break "\n"
                // -> Add data from scanner.nextLine()
                if (contents.contains(exitTextWriter)) { // If "exitFile" are included in the latest line
                    FileWriter fileWriter = new FileWriter(fileLoc); // Create a FileWriter object
                    // -> Assign the "fileLoc" to the file location
                    fileWriter.write(contents); // Write the "contents" into the file
                    // -> Initializes the fileWriter object
                    fileWriter.close(); // Close the fileWriter object
                    System.out.println("File Data Saved!");
                    return; // Successful save
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); // Unsuccessful save
        }
    }
}
