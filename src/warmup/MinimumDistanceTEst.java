package warmup;

import java.util.ArrayList;
import java.util.List;

public class MinimumDistanceTEst {



    public static void main(String[] args) {

        List<Integer> a =new ArrayList<>();
        a.add(7);a.add(1); a.add(3); a.add(4); a.add(1); a.add(7);
        System.out.println(a);

        int min = 0;
        int temp = 0;

        for (int i = 0; i < a.size(); i++){
            for (int j = i+1; j < a.size(); j++){

                if (a.get(i).equals(a.get(j))){
                    temp = Math.abs(i-j);

                    if (min == 0){
                        min = temp;
                    }
                    if (min > temp){
                        min = temp;
                    }
                }
            }
        }

        if (min == 0){
            min = -1;
        }
        System.out.println(min);
    }
}
