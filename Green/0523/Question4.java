// 입력 : 정수 / 출력 : 짝수 나열하고 총 개수
import java.util.Scanner;
public class Question4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n개의 정수 입력.");
		int total = sc.nextInt();
			
		int x = 0;
		int y;
		for (int i = 0; i < total; i++) {
			System.out.println("정수 입력.");
			int count = sc.nextInt();
			
			if (count % 2 == 0) {
				y = count;
			System.out.println(y);
				x++;
			}
			else {
				x++;
			}
		}
		System.out.println("짝수 개수 " + x);
	}
}