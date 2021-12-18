package warmup;

public class StrongPassword {

    public static void main(String[] args) {

        String password = "#HackerRank";
        int length = password.length();

        String  numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";

        char c1 = '0';
        char c2 = '9';
        int cc1 = c1;
        int cc2 = c2;
        char cs = 58;
        int css = '#';
        System.out.println(css);

        int count = 0;
        for (int i = 0; i < length; i++){
            char ch = password.charAt(i);

            int ncl = 0;

            if (((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))){
                ncl++;
            }
            System.out.println(ncl);

//            if (!(ch >= 33 && ch <= 126)){
//                count++;
//            }

        }
        System.out.println(password);

    }
}
