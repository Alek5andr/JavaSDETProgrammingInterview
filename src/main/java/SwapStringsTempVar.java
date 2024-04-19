/**
 * This class swaps two strings using a temp variable.
 */

public class SwapStringsTempVar {
    /**
     * Swaps the contents of two strings using the temp variable.
     */
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "World!";
        String temp = string1;
        string1 = string2;
        string2 = temp;

        System.out.print(string1);
        System.out.print(string2);
    }
}
