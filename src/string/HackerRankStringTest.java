package string;

public class HackerRankStringTest {

    public static void main(String[] args) {

        String s = "haaaccerrank";

        if (s.matches("(.*)h(.*)a(.*)c(.*)k(.*)e(.*)r(.*)r(.*)a(.*)n(.*)k(.*)")){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
}
