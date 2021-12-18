package implementation.easyBasic;

import java.util.List;

public class Hurdle_Race {

    public static int hurdleRace(int k, List<Integer> height) {

        int max = Integer.MIN_VALUE;

        for (int n : height){
            if (n > max)
                max = n;
        }

        if (max - k > 0)
            return max - k;
        return 0;
    }

}
