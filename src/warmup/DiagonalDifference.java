package warmup;

public class DiagonalDifference {

    public static void main(String[] args) {

        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};


        for (int i = 0; i < 3; i++){
        // System.out.println(array[i][i]);
        }
        //System.out.println(array.length);
        int j =0;
        for (int i = array.length -1; i>=0; i--){
            System.out.println(array[j][i]);
            j++;
        }

    }
}
