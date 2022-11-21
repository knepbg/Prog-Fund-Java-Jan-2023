package L5.Exercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = new StringBuilder(username).reverse().toString();

        int counter = 1;

        while (true) {
            String newPassword = scanner.nextLine();

            if (password.equals(newPassword)) {
                System.out.printf("User %s logged in.", username);
                break;
            }

            if (counter >= 4) {
                System.out.printf("User %s blocked!", username);
                break;
            }
            System.out.printf("Incorrect password. Try again.%n");
            counter++;

        }

    }
}
