package L5.Lab;

import java.util.Scanner;

public class P11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int multiplier = Integer.parseInt(scanner.nextLine());
        int beginFrom = Integer.parseInt(scanner.nextLine());

        int result = 0;


        if (beginFrom > 10) {
            result = multiplier * beginFrom;
            System.out.printf("%d X %d = %d", multiplier, beginFrom, result);
        } else {
            for (int i = beginFrom; i <= 10 ; i++) {
                result = multiplier * i;
                System.out.printf("%d X %d = %d%n", multiplier, i, result);
            }
        }
    }
}
