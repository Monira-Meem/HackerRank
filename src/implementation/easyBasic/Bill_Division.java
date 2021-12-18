package implementation.easyBasic;

import java.util.List;

public class Bill_Division {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int total = 0;
        for (int n : bill){
            total += n;
        }
        int cost = total - bill.get(k);
        int pp = cost /2;
        int aCost = b - pp;

        if (aCost == 0){
            System.out.println("Bon Appetit");
        } else {
            System.out.println(aCost);
        }
    }
}
