package collections;


public class MultiDimArray {
    public static void main(String[] args) {

        int matrix1[][] = new int[][] {
                { 1, 2, 3 },
                { 4, 5, 5 },
                { 7, 8, 9 },

        };

        // displaying results using for each loop
        for (int[] arr : matrix1) {
            for (int element : arr) {
                System.out.printf("%d ", element);
            }
            System.out.println();
        }
    }
}
