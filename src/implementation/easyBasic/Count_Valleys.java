package implementation.easyBasic;

public class Count_Valleys {

    public static int countValley(int steps, String path){
        int count = 0;
        int x = 0;

        for (char c : path.toCharArray()){
            if (c == 'U'){
                if (x == -1){
                    count++;
                }
                x++;
            }

            if (c == 'D')
                x--;
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countValley(8,"UDDDUDUU"));

    }
}
