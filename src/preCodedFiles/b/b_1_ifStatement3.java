package preCodedFiles.b;

public class b_1_ifStatement3 {
    public static void main(String[] args) {
        String listOfNames[] = {"Bob", "Anna", "John", "Mary"}; // Creates a basic String array with 4 values (0,1,2,3)

        String myName = listOfNames[0]; // Currently refers to "Bob". Change: "Bob" -> "Anna"

        if (myName == listOfNames[0]) { // If "myName" is equal to value at place 0 in the array -> so if "myName" is equal to "Bob"
            System.out.println("You are " + listOfNames[0]); // Printing "You are Bob" to console
        } else if (myName == listOfNames[1]) { // If "myName" is equal to value at place 1 in the array -> so if "myName" is equal to "Anna"
            System.out.println("You are " + listOfNames[1]); // Printing "You are Anna" to console
        } else if (myName == listOfNames[2]) { // If "myName" is equal to value at place 2 in the array -> so if "myName" is equal to "John"
            System.out.println("You are " + listOfNames[2]); // Printing "You are John" to console
        } else if (myName == listOfNames[3]) { // If "myName" is equal to value at place 3 in the array -> so if "myName" is equal to "Mary"
            System.out.println("You are " + listOfNames[3]); // Printing "You are Mary" to console
        }
    }
}
