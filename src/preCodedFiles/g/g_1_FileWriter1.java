package preCodedFiles.g;

import java.io.File;
import java.io.IOException;

public class g_1_FileWriter1 {
    public static void main(String[] args) {
        createFile();
    }

    public static void createFile() {
        String fileName = "..\\fileWriter\\test.txt"; // Initiate the files in a folder under the src
        // -> YOU NEED TO: Create a folder under the src called "fileWriter"
        // -> src is location where everything is executed therefore unless specified files will be created in src
        try {
            File testFile = new File(fileName); // Create the file under the name and filepath
            // -> Specified in "fileName"
            if (testFile.createNewFile()) { // File created
                System.out.println("File created!");
            } else { // File Already Exists
                System.err.println("File already exists or location is invalid!");
            }
        } catch (IOException e) { // Catch Error Logic
            e.printStackTrace();
        }
    }
}
