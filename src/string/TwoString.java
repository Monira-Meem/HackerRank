package string;

public class TwoString {

    public static String twoString(String s1, String s2){
        int[] s1Counts = new int[26];
        int[] s2Counts = new int[26];

        for (int i = 0; i < s1.length(); i++){
            char s1Char = s1.charAt(i);
            int s1Ind = s1Char - 'a';
            s1Counts[s1Ind]++;
        }

        for (int i = 0; i < s2.length(); i++){
            char s2Char = s2.charAt(i);
            int s2Ind = s2Char - 'a';
            s2Counts[s2Ind]++;
        }

        for (int i = 0; i < 26; i++){
            if (s1Counts[i] > 0 && s2Counts[i] >0){
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {

        String s1 = "hello";
        String s2 = "world";

//        int[] s1Counts = new int[26];
//        int[] s2Counts = new int[26];
//
//        for (int i = 0; i < s1.length(); i++){
//            char s1Char = s1.charAt(i);
//            int s1Ind = s1Char - 'a';
//            s1Counts[s1Ind]++;
//        }
//
//        for (int i = 0; i < s2.length(); i++){
//            char s2Char = s2.charAt(i);
//            int s2Ind = s2Char - 'a';
//            s2Counts[s2Ind]++;
//        }
//
//        for (int i = 0; i < 26; i++){
//
//        }

        System.out.println(twoString(s1,s2));

    }
}
