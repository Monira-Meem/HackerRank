package implementation.easyBasic;

public class Number_Line_Jump {

    public static String kangaroo(int x1, int v1, int x2, int v2) {

        if (v1 > v2){
            int rem = (x2 - x1) % (v1 -v2);

            if (rem == 0)
                return "YES";
        }
        return "NO";
    }

}
