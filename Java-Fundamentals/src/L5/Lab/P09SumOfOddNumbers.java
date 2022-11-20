package L5.Lab;

import java.util.Scanner;

public class P09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 1;

        int sum = 0;


        for (int i = 1; i <= n + n; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(String.format("Sum: %d", sum));

    }
}
