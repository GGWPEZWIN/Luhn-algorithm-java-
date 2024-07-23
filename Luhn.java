import java.util.Scanner;

public class Main {

    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the credit carb number (8 digits) >");
        String cardNum = scanner.nextLine();
        System.out.println();
        int[] digits = new int[8];
        for (int i = 0; i < 8; i++) {
            digits[i] = Character.getNumericValue(cardNum.charAt(i));
        }

        int sumOdd = 0;

        System.out.print("Sum of every other digit starting from the rightmost digit: ");
        for (int i = 0; i < 8; i += 2) {
            sumOdd += digits[7 - i];
            System.out.print(digits[7 - i] + " ");
        }
        System.out.println("= " + sumOdd);

        int sumEven = 0;
        System.out.print("Double each of the digits not included in the previous step: ");
        for (int i = 1; i < 8; i += 2) {
            int doubled = digits[7 - i] * 2;
            System.out.print(doubled + " ");
            sumEven += (doubled / 10) + (doubled % 10);
        }
        System.out.print(" = " + sumEven + "\n");

        int sum = sumEven + sumOdd;
        System.out.println("Total sum: " + sumOdd + " + " + sumEven + " = " + sum);


        if(sum % 10 == 0) {
            System.out.println("Your credit card numbers is valid!");
        } else {
            System.out.println("Your credit card numbers is invalid!");
        }
    }
}
