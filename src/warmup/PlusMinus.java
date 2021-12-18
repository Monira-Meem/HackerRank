package warmup;

import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {

        double plusNum = 0;
        double minusNum = 0;
        double zero = 0;

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++){
            int number = input.nextInt();
            numbers[i] = number;
        }

        for (int number : numbers){

            if (number < 0){
                minusNum++;
            } else if (number > 0){
                plusNum++;
            } else {
                zero++;
            }
        }

        System.out.println(plusNum);
        System.out.println(minusNum);
        System.out.println(zero);

        double plusDecimal = plusNum/n;
        double minusDecimal = minusNum/n;
        double zeroDecimal = zero/n;

        System.out.println( String.format("%.5f", plusDecimal));
        System.out.println( String.format("%.5f", minusDecimal));
        System.out.println( String.format("%.5f", zeroDecimal));
    }

}
