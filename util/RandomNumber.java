package util;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random random = new Random();
        // random integer will be  bound within less than 2000
        // int randomInteger = random.nextInt(2000);

        // random integer will be bound between 1000 and 9999 
        int randomInteger = random.nextInt(1000,9999 );

        System.out.println(randomInteger);

        int otp = (int) (1000 + (Math.random() * 9999));
        System.out.println(otp);
    }
}
