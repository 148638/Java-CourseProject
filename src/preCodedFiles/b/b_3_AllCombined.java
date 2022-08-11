package preCodedFiles.b;

import java.util.Arrays;

public class b_3_AllCombined {
    public static String name;
    public static int age;
    public static boolean finishedWorking;
    public static String[] returnedData = {"", "", ""}; // Each field will get data assigned to them

    public static void main(String[] args) {
        returnJohn();
        System.out.println(Arrays.stream(returnJohn()).toList()); // Prints out the array into a list
    }

    public static String[] returnJohn() {
        name = "John";
        age = 28;
        finishedWorking = false;

        // Assining each previously defined value onto one part of the string array
        returnedData[0] = name;
        returnedData[1] = String.valueOf(age);
        returnedData[2] = String.valueOf(finishedWorking);

        // Returning the array -> Assigned in the previous 3 lines
        return returnedData;
    }
}
