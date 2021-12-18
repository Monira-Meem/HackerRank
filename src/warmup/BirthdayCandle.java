package warmup;

public class BirthdayCandle {

    public static void main(String[] args) {


        int[] numbers = {1,2,3,4,4,5};

        int highest= numbers[0];

        int tallestCandle= 0;

        for (int i = 0; i < numbers.length; i++){
           if (highest < numbers[i]){
               highest = numbers[i];
           }
        }
        for (int i = 0; i < numbers.length; i++){
            if (highest == numbers[i]){
                tallestCandle++;
            }
        }
        System.out.println(tallestCandle);
    }
}
