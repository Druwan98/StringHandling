package exercises.stringHandling;

public class stringhandling {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "How are you?";
        String charArray = string1.substring(0,2) + string2.substring(10);
        System.out.println(charArray);
    }
}

