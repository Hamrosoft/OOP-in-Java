package collections;

import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many number to compare? :");

        int size = scanner.nextInt();

        System.out.printf("Provide %d numbers to compare : ", size);

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {

            System.out.println("Enter number  " + (1 + i) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("print numbers");

        for (int i = 0; i < size; i++) {

            System.out.println(numbers[i]);

        }

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (min > numbers[i]) {

                // assign the value to min if min is greater than numbers[i]
                min = numbers[i];
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }

        System.err.println("Minimum value in the collection: " + min);
        System.err.println("Maximum value in the collection: " + max);

        scanner.close();

    }

}
