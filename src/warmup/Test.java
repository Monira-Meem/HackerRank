package warmup;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        for( int i=0; i<n; i++ ) {
            for(int x=0; x<n; x++) {
                int element = input.nextInt();
                matrix[i][x] = element;
            }
        }
        int result = Math.abs(sumPrimaryDiagonal(matrix, n) - sumSecondaryDiagonal(matrix, n));
        System.out.println(result);
        input.close();
    }

    private static int sumPrimaryDiagonal(int[][] matrix, int n) {
        int[] numbers = new int[n];
        for(int i = 0; i<n; i++ ) {
            numbers[i] = matrix[i][i];
        }
        return sum(numbers);
    }

    private static int sumSecondaryDiagonal(int[][] matrix, int n) {
        int[] numbers = new int[n];
        int j = 0;
        for(int i = n-1; i>=0; i-- ) {
            numbers[i] = matrix[j][i];
            j++;
        }
        return sum(numbers);
    }

    private static int sum(int[] numbers) {
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
