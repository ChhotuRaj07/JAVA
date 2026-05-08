package Logic_Practice;

public class LeftRoation {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6};

        int k  = 2;
        int[] temp = new int[k];
         temp[0] = array[0];
         temp[1] = array[1];
        //  int j = 0;

        for (int i = 0 ; i < array.length - k; i++){
            array[i] = array[i+k];
        } 
         array[array.length -2] = temp[0];
         array[array.length - 1] = temp[1];

          for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + "");

          }
    }

     
    
}
