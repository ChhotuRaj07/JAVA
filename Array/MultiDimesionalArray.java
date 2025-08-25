package Array;


public class MultiDimesionalArray {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int[][] myNumber = {{1,2,3},{4,5,6},{7,8,9}};

        for (i =0; i < myNumber.length; i++){
            for(j = 0; j<myNumber.length;j++){
                System.out.print(myNumber[i][j] + " ");
            }
            System.out.println();
        }

        
    }
}
