import java.util.Scanner;

public class Value_FInd_Inside_array_Yes {
    public static void main(String[] args) {
        	int [] arr = {10,20,40,80,90};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value check Inside The array");
		int Value = sc.nextInt();
        
		sc.close();   // ✅ closes scanner

		boolean found = false;
		
		
		for (int i = 0; i < arr.length; i++){
		    if (arr[i]  == Value){
		          found = true;
		          break;
		    }
		}
		
		if(found) {
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}

	}
    }

