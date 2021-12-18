package warmup;

public class PangramsTest {

    public static void main(String[] args) {

        String s = "The quick brown fox jumps over the lazy dog";
        String smallS = s.toLowerCase();
        smallS = smallS.replace(" ", "");

        String isPangram = "";

        long length = smallS.chars().distinct().count();

        if (length == 26)
            isPangram = "pangram";
        else
            isPangram = "not pangram";

        System.out.println(isPangram);


//        int length = s.length();
//        boolean pan = false;
//
//        for (int i = 0; i < length; i++) {
//            char ch = chars[i];
//
//            System.out.print(ch);
//        }
//        System.out.println(count);

    }
}
