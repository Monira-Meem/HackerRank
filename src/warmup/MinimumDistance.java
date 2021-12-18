package warmup;

public class MinimumDistance {

    public static void main(String[] args) {

        int[] a = {7, 1, 3, 4, 1, 7};
//        int[] a = {1,2,3,4,7};
        int min=0;
        int temp = 0;

        for (int i = 0; i < a.length; i++){
            for (int j = i+1; j< a.length; j++){
                if (a[i] == a[j]){
                    temp = Math.abs(i-j);
//                    System.out.println("I--" + i + "j---" + j);
//                    System.out.println(temp);

                    if (min==0){
                        min = temp;
                    }
                    if ( min > temp){
                        min = temp;
                    }
                }
            }
        }
//        System.out.println("Temp --" + temp);
        System.out.println(min);
    }
}
