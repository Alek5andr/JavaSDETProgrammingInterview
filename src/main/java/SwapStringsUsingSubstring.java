/**
 * This class swaps two strings using a substring
 */

public class SwapStringsUsingSubstring {
    /**
     * Swaps the contents of two strings using the substring method.
     */
    public static void main(String[] args) {
        String inputString = "Hello World!";
        String[] array = inputString.split(" ");
        System.out.println(array[1] + " " + array[0]);

        String string1 = array[0];
        String string2 = array[1];
        string1 = string1 + string2;
        string2 = string1.substring(0, string1.length() - string2.length());
        string1 = string1.substring(string2.length());
        System.out.print(string1 + " " + string2);
    }
}
