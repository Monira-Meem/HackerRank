package warmup;

public class LoveLetterMystery {

    public static void main(String[] args) {

//        String s = "abc";
//        String s = "abcba";
//        String s = "abcd";
        String s = "cba";

        char[] chars = s.toCharArray();

        int  first = 0;
        int last = chars.length-1;
        int result = 0;


        while (first <= last){

            if (chars[first] != chars[last]){
                if (chars[first] < chars[last]){
                    result = result + (chars[last] - chars[first]);
                }else {
                    result = result + (chars[first] - chars[last]);
                }
            }
            first++;
            last--;
        }
        System.out.println(result);

    }
}
