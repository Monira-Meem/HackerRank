package string;

public class HackerRankString {

    public static void main(String[] args) {

        String s = "haaacckerrank";
        String target = "hackerrank";

        int length = target.length();
        int count = 0;

        for (char a : s.toCharArray()){
            if (a == target.charAt(count)){
                count++;
            }
        }
        if (count == length){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
