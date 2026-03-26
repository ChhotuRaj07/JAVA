package Logic_Practice;

import java.util.Scanner;

// Grade Print 
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: "); 
         int marks = sc.nextInt();
         
         if (marks >= 80 && marks <= 100) {
            System.out.println("You got a Grade A !");
         } else if (marks >= 60 && marks <= 79){
            System.out.println("You Got a  Grade B !");
         }else if (marks >= 40 && marks <= 59 ){
            System.out.println("You Got a Grade c !");
         } else if (marks >= 30 && marks <= 39) {
            System.out.println("You Got a Grade D !");
         }else if (marks >= 0 && marks <= 29) {
            System.out.println("Fail !");
         }
         sc.close();
    }
    
}
