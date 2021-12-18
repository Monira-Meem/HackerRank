package warmup;

import java.util.Arrays;

public class StringConstruction {

    public static void main(String[] args) {

        String s = "abcdabcd";

        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        int count = 0;

        if (s.length() > 0){
            count = 1;
        }

        for (int i =0; i < chars.length-1; i++){
            char ch = chars[i];

            if (ch != chars[i+1]){
                count++;
            }
        }
        System.out.println(count);

    }
}
