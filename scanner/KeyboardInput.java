package scanner;

import java.util.Scanner;

public class KeyboardInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user name: ");

        // reads the terminal until enter command from the keyboard.
        String userName = scanner.nextLine();
        System.out.println("Your user name is : " + userName);

        scanner.close();

    }
}
