package string;

public class Pangrams {

    public static String pangram(String s){

        s = s.replace(" ","");
        s = s.toLowerCase();

        int[] frequences = new int[26];

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int chInd = ch - 'a';
            frequences[chInd]++;
        }

        for (int i = 0; i < 26; i++){
            if (frequences[i] == 0)
                return "not pangram";
        }

        return "pangram";
    }
}
