package preCodedFiles.a;

public class a_4_DataTypesPrintln2 {
    public static void main(String[] args) {
        String myName = "Bob"; // A String can have a value that includes any letters/characters that are within the quotation marks ("")
        int myAge = 25; // An int can only have a value containing whole numbers -> An integer can hold up to 32 bits of data
        boolean finishedCoding = false; // A boolean can have a true or false value -> Most commonly used for "if" statements

        // Printing out the assigned values of our previously created data types
        System.out.println(myName);
        System.out.println(myAge);
        System.out.println(finishedCoding);
        // Adding multiple elements into one System.out.println -> Make sure to include the plus symbol (+)!
        System.out.println("My name is " + myName);
        System.out.println("I am " + myAge + " years old");
        System.out.println("finishedCoding boolean is " + finishedCoding);
        // Adding the previous 3 System.out.println into one System.out.println
        System.out.println("My name is " + myName + ", I am " + myAge + " years old, finishedCoding boolean is " + finishedCoding + ".");
    }
}