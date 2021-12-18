package string;

public class FunnyString {

    public static String funnyString(String s) {

        int length = s.length();
        char[] chars = s.toCharArray();

        int[] diff = new int[length-1];

        for (int i = 0; i < length-1; i++){
            diff[i] = Math.abs((int)chars[i] - (int) chars[i+1]);
        }

        int j = diff.length-1;
        for (int i = 0; i < j; i++){
            if (diff[i] != diff[j])
                return "Not Funny";
            j--;
        }
        return "Funny";
    }

    public static void main(String[] args) {

        System.out.println(funnyString("acxz"));
        System.out.println(funnyString("bcxz"));

    }
}
