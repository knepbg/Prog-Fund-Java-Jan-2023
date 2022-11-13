package L5.Lab;

import java.util.Scanner;

public class P03PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double greats = Double.parseDouble(scanner.nextLine());

        if (greats >= 3.00) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }

    }
}
