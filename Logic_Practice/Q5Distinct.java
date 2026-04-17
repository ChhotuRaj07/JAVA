package Logic_Practice;

import java.util.Scanner;

public class Q5Distinct {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Take 3 Number and Check Number Is Distinct or not !");
        int  num1 = sc.nextInt();
        int  num2 = sc.nextInt();
        int  num3 = sc.nextInt();

        if (num1 != num2 && num2 != num3 && num1 != num3) {
            System.out.println("This is a Distinct");
        
        }else{
            System.out.println("This is Not a Distinct");
        }
        sc.close();
    }
}
