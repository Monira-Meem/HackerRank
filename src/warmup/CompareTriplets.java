package warmup;

public class CompareTriplets {

    public static void main(String[] args) {

        int[] alice = {22,33,44};
        int[] bobs = {11,22,44};

        int aliceScore = 0;
        int bobsScore = 0;
        int[] result = new int[2];

        for (int i = 0; i < 3; i++){
            if (alice[i] < bobs[i]){
                bobsScore++;
            } else if (alice[i] > bobs[i]){
                aliceScore++;
            }
        }
        result[0] = aliceScore;
        result[1] = bobsScore;

        for (int score : result){
            System.out.println(score);
        }

    }
}
