package L5.Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peoples = Integer.parseInt(scanner.nextLine());
        String group = scanner.nextLine();
        String day = scanner.nextLine();

        double totalPrice = 0.00;

        if (group.equals("Students")) {
            if (day.equals("Friday")) {
                totalPrice = peoples * 8.45;
            } else if (day.equals("Saturday")) {
                totalPrice = peoples * 9.80;
            } else if (day.equals("Sunday")) {
                totalPrice = peoples * 10.46;
            }
            if (peoples >= 30) {
                totalPrice = totalPrice * 0.85;
            }
        } else if (group.equals("Business")) {
            if (peoples >= 100) {
                peoples -= 10;
            }
            if (day.equals("Friday")) {
                totalPrice = peoples * 10.90;
            } else if (day.equals("Saturday")) {
                totalPrice = peoples * 15.60;
            } else if (day.equals("Sunday")) {
                totalPrice = peoples * 16;
            }
        } else if (group.equals("Regular")) {
            if (day.equals("Friday")) {
                totalPrice = peoples * 15;
            } else if (day.equals("Saturday")) {
                totalPrice = peoples * 20;
            } else if (day.equals("Sunday")) {
                totalPrice = peoples * 22.50;
            }
            if (peoples >= 10 && peoples <= 20) {
                totalPrice = totalPrice * 0.95;
            }
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }

}
