package preCodedFiles.b;

public class b_2_ReferToOtherMethod3 {
    public static void main(String[] args) {
        System.out.println(returnString());
        System.out.println(returnInt());
        System.out.println(returnBoolean());
    }
    public static String returnString() {
        String myName = "John";
        return myName;
    }
    public static int returnInt() {
        int myAge = 28;
        return myAge;
    }
    public static boolean returnBoolean() {
        boolean myBoolean = true;
        return myBoolean;
    }
}
