public class Single_s {
// Given an array and a number `x`, check if `x` is present in the array (linear search).

// *Input:* `[5, 8, 12, 7 ,1 ,1]` and `x = 12` → *Output:* `Found at index 1`.


    public static void main(String[] args) {

        int[] number = {1, 5, 1, 6, 2, 1, 5, 1};
        int count = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == 1){
                  count++;
            }
        }
         System.out.println("THE VALUE OF COUNT 1 = " + count);
    }
}
