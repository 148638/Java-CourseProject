package preCodedFiles.a;

public class a_4DataTypesPrintln3 {
    public static void main(String[] args) {
        String exampleArray[] = {"Value 1", "Value 2", "Value 3"};  // A String array -> signified by the "[]" -> A string array can hold multiple items or String values
        System.out.println(exampleArray[0]); // To refer to a String Array: add "[]" after the name and add the number of the value
        /* How to find the number of each value:
                                     0         1        2
        String numberOfArray[] = {"number 0", "1", "value 2"};
         */

        System.out.println(exampleArray[0] + exampleArray[1]); // Print multiple values in the String array
        System.out.println("This is " + exampleArray[0] + "\nThis is" + exampleArray[1]); // Adding "\n" in a string will add a line break -> Enter is not viable to add a line break
    }
}
