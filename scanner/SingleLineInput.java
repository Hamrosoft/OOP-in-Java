package scanner;

import java.util.Scanner;

public class SingleLineInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name, age and salary : ");

        String input = scanner.nextLine();

        String[] inputArray = input.split(" ");

        scanner.close();

        String name = inputArray[0];
        int age = Integer.parseInt(inputArray[1]);
        double salary = Double.parseDouble(inputArray[2]);

        // Console it to log.
        System.out.println("Your name is: " + name + ". Age is : " + age + ". And salary is : " + salary);

    }

}
