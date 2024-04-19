/**
 * This class finds duplicate characters in a given string.
 */

public class FindDuplicateStringCharacter {
    /**
     * This class finds duplicate characters in a given string and prints them.
     * If no duplicates are found, it prints a message,
     */

    public static void main(String[] args) {
        String s = "hackerearth".toLowerCase();
        char[] character = s.toCharArray();
        boolean isNotDuplicate = false;

        for (int i = 0; i < s.length(); i++) {
            boolean isDuplicate = false;

            for (int j = i + 1; j < s.length(); j++) {
                if (character[i] == character[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                System.out.print(character[i]);
                isNotDuplicate = true;
            }
        }

        if (!isNotDuplicate) System.out.println("No duplicates found!");
    }
}
