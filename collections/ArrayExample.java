package collections;

public class ArrayExample {

    public static void main(String[] args) {

        int size = 10;
        int[] ages = new int[size];

        int i = 0;

        // iterating over array
        for (i = 0; i < size; i++) {

            System.out.println(ages[i]);

        }

        // assigning values manually to array
        ages[5] = 10;
        ages[6] = 10;

        for (i = 0; i < size; i++) {

            System.out.println(ages[i]);

        }

        String[] names = { "ram", "shyam", "ronit", "eren", "tanchohang", "pushpa" };

        for (i = 0; i < names.length; i++) {

            System.out.println(names[i]);

        }

    }

}