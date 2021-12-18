package warmup;

import java.util.ArrayList;
import java.util.List;

public class CompareTripletFuction {

    static List<Integer> compare(List<Integer> a,List<Integer> b){

        List<Integer> scores = new ArrayList<>();

        int aScore = 0;
        int bScore = 0;

        for (int i = 0; i < 3; i++){

            if (a.get(i) < b.get(i)){
                bScore++;
            } else if (a.get(i) > b.get(i)){
                aScore++;
            }
        }

        scores.add(aScore);
        scores.add(bScore);


        return scores;
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(3);
        list.add(22);
        list.add(33);
        list.add(44);
        System.out.println(list);

        List<Integer> list1 = new ArrayList<>(3);
        list1.add(11);
        list1.add(22);
        list1.add(33);
        System.out.println(list1);



    }
}
