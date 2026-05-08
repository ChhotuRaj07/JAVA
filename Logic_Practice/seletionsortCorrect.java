package Logic_Practice;

public class seletionsortCorrect {
    public static void main(String[] args) {
        int array[] = {9,2,3,7,1,9,4};

        for (int i = 0; i < array.length; i++){
            int min = i;
        for (int j = i+1; j < array.length; j++){
            if (array[j] > array[min]) {
         // swap value because we store minum value in  the variable in min so now i can camapre a value in.
         int temp = array[min];
         array[min] = array[j];
         array[j] = temp;


            }
         }     
        }
        for (int i =0; i < array.length ; i++) {
            System.out.print(array[i] + "");
        }
    }
}
