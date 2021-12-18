package warmup;

public class RepeatedStringTest {

    public static long solution(String s, long n){
        long totalCount = 0;

        int length = s.length();
        int count = 0;
        int mCount = 0;

        long mod = n % length;
        long div = n / length;

        for (int i = 0; i < length; i++){
            if (s.charAt(i) == 'a'){
                count++;
            }
        }

        for (int i = 0; i < mod; i++){
            if (s.charAt(i)== 'a'){
                mCount++;
            }
        }

        totalCount = (count * div) + mCount;


        return totalCount;
    }

    public static void main(String[] args) {

        String s = "a";
        long n = 1000000000000l;

        long result = solution(s,n);
        System.out.println(result);
    }
}
