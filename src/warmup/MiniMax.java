package warmup;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMax {

    static void miniMax(int[] arr){

        Arrays.sort(arr);

        long miniSum =0;
        long maxSum =0;

        for (int i = 0; i< arr.length-1; i++){
            long number = arr[i];
            miniSum+=number;
        }

        for (int i =1; i<  arr.length; i++){
            long number = arr[i];
            maxSum+=number;
        }
        System.out.println(miniSum +" "+maxSum);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++){
            int number = input.nextInt();
            nums[i] = number;
        }
        miniMax(nums);
    }
}
