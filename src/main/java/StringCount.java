/**
 * This class calculates count of non-space characters in a string.
 */
public class StringCount {

    /**
     * Calculates count of non-space characters in the given string.
     * @param args
     */
    public static void main(String[] args) {
        String someString = "This is a string";
        int counter = 0;

        for (char character : someString.toCharArray()) if (!Character.isWhitespace(character)) counter++;
        System.out.println(counter);

        /*counter = 0;
        for (int i = 0; i < someString.length(); i++) if (someString.charAt(i) != ' ') counter++;
        System.out.print(counter);*/
    }
}
