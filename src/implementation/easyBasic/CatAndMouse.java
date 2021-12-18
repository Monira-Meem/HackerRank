package implementation.easyBasic;

public class CatAndMouse {

    public static String catAndMouse(int x,int y, int z){

        int catA = Math.abs(x-z);
        int catB = Math.abs(y-z);

        if (catA > catB){
            return "Cat B";
        } else if (catA < catB){
            return  "Cat A";
        }
        return "Mouse C";
    }

    public static void main(String[] args) {

        System.out.println(catAndMouse(1,2,3));
        System.out.println(catAndMouse(1,3,2));
    }
}
