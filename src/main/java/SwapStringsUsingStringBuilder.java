/**
 * This class swaps two strings using StringBuilder class.
 */

public class SwapStringsUsingStringBuilder {
    /**
     * Swaps the contents of two strings using StringBuilder class.
     */
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "World!";
        StringBuilder sb = new StringBuilder();
        sb.insert(0, string1);
        sb.insert(0, string2);
        System.out.println(sb);

        sb = new StringBuilder(string1);
        sb.append(string2);

        string2 = sb.substring(0, string1.length());
        string1 = sb.substring(string2.length());
        System.out.println(string1);
        System.out.println(string2);

    }
}
