package Logic_Practice;

import java.util.Scanner;

public class Q2Triangle {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter a Side a");
        int a =  sc.nextInt();


        System.out.println("Enter a Side b ");
        int b = sc.nextInt();

        System.out.println("Enter a Side c");
        int c = sc.nextInt();

        if(a + b > c && a+c >b && b+c > a ){

            if(a == b && b ==c ){
                System.out.println("This is Foam a Equilateral Triangle !");

            } else if (a == b || b == c || c == a) {
                System.out.println("This is a Isosecles Triangle");
            }else{
                System.out.println("Scalen Triangle");
            }
            }else {
                System.out.println("Not a Valid Triangle");

        }
          sc.close();
    }
}
