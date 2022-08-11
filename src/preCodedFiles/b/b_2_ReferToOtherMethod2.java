package preCodedFiles.b;

public class b_2_ReferToOtherMethod2 {
    static boolean cookingStatus = false; // Creating the boolean that shows the cookingStatus (true, false, undefined)

    public static void main(String[] args) { // Main class is static so all referenced variables/methods must be static
                                             // -> lets us refer to variables defined outside of method
        System.out.println(cookingStatus); // Will print the original value
        changeCookingStatus(); // Referring to the method below
        System.out.println(cookingStatus); // Will print the returned value from method called "cookingStatus"
    }

    public static boolean changeCookingStatus() {
        cookingStatus = true; // Changing the value of the previously created boolean
        return cookingStatus; // Returns the data of the boolean
                              // -> changes the value in the previous class and makes the System.out.println show 2 different results
    }
}
