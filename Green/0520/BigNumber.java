// 3개의 정수를 입력받아 가장 큰 수를 출력
import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력하세요. ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
				
		int max;
		if (x > y && x > z) {
			max = x;
		} else if (y > x && y > z) {
			max = y;
		} else {
			max = z;
		}
		System.out.println("가장 큰수는 : " + max);
		
		// int max;
		// if (a > b) {
			// if (a > c) {
				// max = a;
			// } else {
				// max = c;
			// }
		// } else {
			// if (b > c) {
				// max = b;
			// } else {
				// max = c;
			// }
		// }
		// System.out.println("가장 큰수는 : " + max);
	}
}