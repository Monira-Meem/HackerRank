package warmup;

import java.util.Scanner;

public class PlusMinusFaction {

    public static void countPlusminus(int[] nums){
        double plus = 0;
        double minus = 0;
        double zero = 0;
        int n = nums.length;

        for (int num : nums){
            if (num < 0){
                minus++;
            } else if ( num > 0){
                plus++;
            } else {
                zero++;
            }
        }

        System.out.println(String.format("%.6f",(plus/n)));
        System.out.println(String.format("%.6f",(minus/n)));
        System.out.println(String.format("%.6f",(zero/n)));

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++){
            int number = input.nextInt();
            numbers[i] = number;
        }

        countPlusminus(numbers);

    }

}
