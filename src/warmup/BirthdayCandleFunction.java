package warmup;

import java.util.List;

public class BirthdayCandleFunction {

    public static int countCandle(List<Integer> candles){

        int count = 0;
        int max = candles.get(0);

        for (int i =0; i < candles.size(); i++){
            if (candles.get(i) > max){
                max = candles.get(i);
            }
        }
        for (int i = 0; i< candles.size(); i++){
            if ( max == candles.get(i)){
                count++;
            }
        }
        return count;
    }
}
