package Recursion;

public class Q1 {
      static int factrorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factrorial(n-1);
    }

    public static void main(String[] args) {
        int  res = factrorial (5);
        System.out.println("Factorial is :" + res );
    }
}
