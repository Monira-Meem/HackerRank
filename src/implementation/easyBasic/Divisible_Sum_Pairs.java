package implementation.easyBasic;

import java.util.List;

public class Divisible_Sum_Pairs {

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

        int count = 0;

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++){
                int sum = ar.get(i) + ar.get(j);
                if (sum % k == 0)
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 6, 1, 2};
        int n = nums.length;
        int k = 3;

        int count = 0;

        for (int i = 0; i < n; i++){
            for (int j = i +1; j < n; j++){
                int sum = nums[i] + nums[j];
                if (sum % k == 0){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
