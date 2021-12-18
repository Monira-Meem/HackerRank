package warmup;

public class RepeatedString {

    public static void main(String[] args) {

        String s = "abcac";
        long n = 10;
        long count = 0;
        long temp = 0;
        long totalCount = 1;

        int length = s.length();

        for (int i =0; i < length; i++){
            if (s.charAt(i) == 'a'){
                count++;
            }
        }
        System.out.println("c"+count);

        long mod = n % length;
        System.out.println("m" + mod);

        for (int i = 0; i < mod; i++){
            if (s.charAt(i) == 'a'){
                temp++;
            }
        }
        System.out.println("t"+temp);

        long div = n/length;
        System.out.println("d"+div);

        totalCount = (count * div) + temp;
        System.out.println("tc"+totalCount);


    }

}
