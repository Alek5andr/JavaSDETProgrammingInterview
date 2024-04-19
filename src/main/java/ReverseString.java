/**
 * This class prints string in a reverse.
 */

public class ReverseString {

    /**
     * Reverse the input string.
     *
     * @param inputString The input string to be reversed.
     * @return The reversed string.
     */
    public static String reverse(String inputString) {
        String reverseString = "";

        for (int i = inputString.length() - 1; i >= 0 ; i--) reverseString += inputString.charAt(i);

        return  reverseString;
    }

    public static void main(String[] args) {
        String inputString = "This is a string";
        String result = reverse(inputString);
        System.out.print(result);
    }
}
