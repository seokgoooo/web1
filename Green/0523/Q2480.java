import java.util.Scanner;
public class Q2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = 0;
		int prize3 = 10000 + (a * 1000);
		int prize2 = 1000 + (a * 100);
		int prize2b = 1000 + (b * 100);
		int prize1a = (a * 100);
		int prize1b = (b * 100);
		int prize1c = (c * 100);
	
		if (a == b && b == c) {
			result = prize3;
		} else if (a == b) {
			result = prize2;
		} else if (a == c) {
			result = prize2;
		} else if (b == c) {
			result = prize2b;
		} else if (a > b && a > c) {
			result = prize1a;
		} else if (b > a && b > c) {
			result = prize1b;
		} else if (c > a && c > b) {
			result = prize1c;
		}
		System.out.print(result);
	}
}