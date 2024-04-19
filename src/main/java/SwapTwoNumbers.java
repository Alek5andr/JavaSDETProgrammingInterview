/**
 * This class swaps two numbers.
 */

public class SwapTwoNumbers {
    /**
     * Swaps two numbers.
     */
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        System.out.print(number1);
        System.out.println(number2);

        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;

        System.out.print(number1);
        System.out.print(number2);
    }
}
