package Logic_Practice;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers And Check Both are Even Or Odd OR Single Even Or Odd ");
        int  num1  = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Both Are Even !");
        }
         else if (num1 % 2 != 0 && num2 % 2 != 0 ) {
            System.out.println("Both Are Odd Numbers ");
        } 
        else {
            if (num1 % 2 == 0){
                System.out.println("Num1 Is Even And Num2 is Odd !");
            } else {
                System.out.println("Num2 is Odd And Num1 is Even !");
            }
        }  
       
        sc.close();
    }
    
}
