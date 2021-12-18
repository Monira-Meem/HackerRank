package string;

import java.util.Arrays;

public class Anagram {

    public static int countAnagramMove(String s){

        String s1 = s.substring(0,s.length()/2);
        String s2 = s.substring(s.length()/2);
        int count = 0;

        if (s1.length() != s2.length()){
            return -1;
        }

        int[] s1counts = new int[26];
        int[] s2counts = new int[26];

        for (int i = 0; i < s1.length(); i++){
            char s1Char = s1.charAt(i);
            int s1Ind = s1Char - 'a';
            s1counts[s1Ind]++;
        }

        for (int i = 0; i < s2.length(); i++){
            char s2Char = s2.charAt(i);
            int s2Ind = s2Char - 'a';
            s2counts[s2Ind]++;
        }

        for (int i = 0; i < 26; i++){
            count += Math.abs(s1counts[i] - s2counts[i]);
        }
        return count/2;
    }

    public static void main(String[] args) {

//        String s = "aaabbb";
//        String s = "abc";
//        String s = "abccde";
//        String s = "mnop";
//        String s = "xyyx";
        String s = "xaxbbbxx";

        String s1 = s.substring(0,s.length()/2);
        String s2 = s.substring(s.length()/2);
        int count = 0;

        if (s1.length() != s2.length()){
            System.out.println("-1");
        }

        int[] s1counts = new int[26];
        int[] s2counts = new int[26];

        for (int i = 0; i < s1.length(); i++){
            char s1Char = s1.charAt(i);
            int s1Ind = s1Char - 'a';
            s1counts[s1Ind]++;
        }

        for (int i = 0; i < s2.length(); i++){
            char s2Char = s2.charAt(i);
            int s2Ind = s2Char - 'a';
            s2counts[s2Ind]++;
        }

        for (int i = 0; i < 26; i++){
            count += Math.abs(s1counts[i] - s2counts[i]);
        }

        System.out.println(Arrays.toString(s1counts));
        System.out.println(Arrays.toString(s2counts));

        System.out.println(count);

//        System.out.println(countAnagramMove(s));
    }
}
