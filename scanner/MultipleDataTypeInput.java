package utils;

import java.util.Scanner;

public class MultipleDataTypeInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name, age and salary : ");
        // name
        String name = scanner.nextLine();

        // int input
        int age = scanner.nextInt();
        double salary = scanner.nextDouble();

        scanner.close();

        // Console it to log.
        System.out.println("Your name is: " + name + ". Age is : " + age + ". And salary is : " + salary);

    }
}
