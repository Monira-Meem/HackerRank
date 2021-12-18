package implementation;

public class SaveThePrisoner {

    public static int saveThePrisoner(int n, int m, int s) {

        int mod = m % n;
        int answer = (mod + s -1) % n;
        if (answer == 0)
            return n;

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(saveThePrisoner(5,2,1));
        System.out.println(saveThePrisoner(7,19,2));
        System.out.println(saveThePrisoner(3,7,3));
        System.out.println(saveThePrisoner(13,2,12));
        System.out.println(saveThePrisoner(13,3,12));
        System.out.println(3%13);

    }
}
