package implementation.easyBasic;

import java.util.ArrayList;
import java.util.List;

public class BreakingRecords {

    public static List<Integer> countRecords(List<Integer> scores) {

        List<Integer> list = new ArrayList<>();
        int countMax = 0;
        int countMin = 0;
        int min = scores.get(0);
        int max = scores.get(0);

        for (int n : scores){
            if (n < min){
                min = n;
                countMin++;
            }
            if (n > max){
                max = n;
                countMax++;
            }
        }
        list.add(countMax);
        list.add(countMin);

        return list;
    }

    public static void main(String[] args) {

        int[] nums = {3,4,21,36,10,28,35,5,24,42};

        int countMax = 0;
        int countMin = 0;
        int min = nums[0];
        int max = nums[0];

        for (int n : nums){
            if (n < min){
                min = n;
                countMin++;
            }
            if (n > max){
                max = n;
                countMax++;
            }
        }
        System.out.println("Min : " + countMin);
        System.out.println("Max : " + countMax);
    }
}
