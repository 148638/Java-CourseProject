package preCodedFiles.b;

public class b_2_ReferToOtherMethod1 {
    public static void main(String[] args) {
        System.out.println("This is in the main method!");
        printSmiley(); // Referring to other method
    }
    public static void printSmiley() {
        String smiley = ":)";
        System.out.println("This is in the printSmiley method " + smiley);
    }
}
