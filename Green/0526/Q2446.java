import java.util.Scanner;
public class Q2446 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = n; i > 0; i--) {
			
			for (int j = 1; j <= n - i; j++) {
				
				System.out.print(" ");
				
			}
			
			for (int j = i; j > 0; j--) {
				
				System.out.print("*");
			
			}
			
			
			for (int j = i; j > 1; j--) {
				
				System.out.print("*");
			
			}
			
			System.out.println();
			
		}

		for (int i = 1; i < n; i++) {
				
			for (int j = n - 1; j > i; j--) {
				
				System.out.print(" ");
			
			}
			
			for (int j = 0; j <= i; j++) {
				
				System.out.print("*");
				
			}
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print("*");
				
			}	
			
			System.out.println();
			
		}
	}
}

// *********
 // *******
  // *****
   // ***
    // *
   // ***
  // *****
 // *******
// *********