package TwoD_Arrays;

public class Main {
    public static void main(String[] args){

        // 2D array = An array where each element is an array
        //            Useful for storing a matrix of data



        String[][] groceries = {{"apple", "orange", "banana"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "pork", "beef", "fish"}};

        // changing element
        groceries[0][0] = "pineapple";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.println(food + " ");
            }
            System.out.println();
        }
    }
}
