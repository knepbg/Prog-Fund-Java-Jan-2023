package L5.Lab;

import java.util.Scanner;

public class P12EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        boolean isEven = true;

        while (isEven) {
            number = Math.abs(number);
            if (number % 2 == 1 || number == 0) {
                System.out.println("Please write an even number.");
                number = Math.abs(Integer.parseInt(scanner.nextLine()));
            } else {
                System.out.printf("The number is: %d", number);
                isEven = false;
            }
        }
    }
}
