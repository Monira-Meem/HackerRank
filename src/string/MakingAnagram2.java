package string;

public class MakingAnagram2 {

    public static void main(String[] args) {

//        String s1 = "cde";
//        String s2 = "abc";
//        String s1 = "abc";
//        String s2 = "amnop";
//        String s1 = "abc";
//        String s2 = "abc";
        String s1 = "aacbhe";
        String s2 = "abe";


        int count = 0;

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
            count += Math.abs(s1Counts[i] - s2Counts[i]);
        }

        System.out.println(count);
    }
}
