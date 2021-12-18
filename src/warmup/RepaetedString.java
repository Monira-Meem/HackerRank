package warmup;

public class RepaetedString {

    public static void main(String[] args) {

        String s = "a";
        long n = 10;
        long count = 0;

        StringBuilder newS = new StringBuilder();

        for (int i = 0; i < n; i++){
            char ch = s.charAt(i%s.length());
            String ss = Character.toString(ch);
            if (newS.length()<n){
                newS.append(ss);
            }
        }
        System.out.println(newS);

        for (int i = 0; i < n; i++){
            if (newS.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println(count);

    }
}
