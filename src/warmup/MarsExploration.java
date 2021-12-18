package warmup;

public class MarsExploration {

    public static void main(String[] args) {

       // String s = "SOSSPSSQSSOR";
       // String s = "SOSSOT";
        //String s = "SOS-OOS-OSO-SOS-OSS-OSO-SOS-OSO-SOS";

       // String s = "SOSOOSOSOSOSOSSOSOSOSOSOSOS";
        String s = "OOSDSSOSOSWEWSOSOSOSOSOSOSSSSOSOSOSS";

        int count = 0;

        for (int i = 0; i < s.length(); i+=3){

            if (s.charAt(i) != 'S')
                count++;

            if (s.charAt(i+1) != 'O')
                count++;

            if (s.charAt(i+2) != 'S')
                count++;
        }

        System.out.println(s.length());
        System.out.println(count);

    }
}
