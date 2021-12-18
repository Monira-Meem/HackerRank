package warmup;

public class AlternatingCharacter {

    public static void main(String[] args) {

//        String s = "AAABBB";
//        String s = "BBBBB";
        String s = "ABABABAB";

        char[] chars = s.toCharArray();
        int count = 0;

        for (int i = 0; i < chars.length -1; i++){

            if (chars[i] == 'A'){
                if (chars[i+1] != 'B')
                    count++;
            } else if (chars[i] == 'B'){
                if (chars[i+1] != 'A')
                    count++;
            }
        }
        System.out.println(count);

    }
}
