import java.util.Scanner;
public class Q2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int i = 1;
				
		while (i <= 9) {
			System.out.println(x + " * " + i + " = " + (x * i));
			i++;
		}
	}
}