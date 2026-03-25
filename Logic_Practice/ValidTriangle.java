package Logic_Practice;

import java.util.Scanner;

public class ValidTriangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter a Side a");
        int a =  sc.nextInt();


        System.out.println("Enter a Side b ");
        int b = sc.nextInt();

        System.out.println("Enter a Side c");
        int c = sc.nextInt();

        if(a + b > c && a+c >b && b+c > a ){
            System.out.println("Valid  Triangle");
        } else{
            System.out.println("This is a Not a Valid Trainge !");
             
        }
    sc.close(); 
    }
}
