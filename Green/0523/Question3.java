// 자판기 프로그램 입력 : 돈 반복하여 입력을 받아
// 1번 콜라 : 1500
// 2번 사이다 : 1300
// 3번 계산
// 총 몇 개의 캔을 구입하고 거스름돈은 얼마인지 출력
import java.util.Scanner;
public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("돈 입력.");
		int moneyc = sc.nextInt();
		int moneys = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			// 연산
			sum = sc.nextInt();
			if (sum % 2 == 0) {
				sum2 += sum;
				y++;
			}
			else {
				sum1 += sum;
				x++;
			}
		}
		
		// 출력
		System.out.println("콜라: " + sum1);
		System.out.println("사이다: " + sum1 / x);
		System.out.println("거스름돈: " + sum2);
	}
}