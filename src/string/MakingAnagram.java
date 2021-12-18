package string;

public class MakingAnagram {

    public static void main(String[] args) {

//        String s1 = "cde";
//        String s2 = "abc";
//        String s1 = "abc";
//        String s2 = "amnop";
        String s1 = "abc";
        String s2 = "abc";

        int count = 0;
        int length = 0;

        if (s1.length() > s2.length()){
            length = s2.length();
        }else {
            length = s1.length();
        }

        int[] counts = new int[26];

        for (int i = 0; i <length; i++ ){

            char fChar = s1.charAt(i);
            char sChar = s2.charAt(i);

            int fInd = fChar - 'a';
            counts[fInd]++;

            int sInd = sChar - 'a';
            counts[sInd]--;
        }

        for (int i = 0; i < counts.length; i++){
            if (counts[i] != 0){
                count++;
            }
        }

        count = count + Math.abs(s1.length()-s2.length());

        System.out.println(count);
    }
}
