// 문제
// 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
// 입력
// 첫째 줄에는 현재 시각이 나온다. 현재 시각은 시 A (0 ≤ A ≤ 23) 와 분 B (0 ≤ B ≤ 59)가 정수로 빈칸을 사이에 두고 순서대로 주어진다. 두 번째 줄에는 요리하는 데 필요한 시간 C (0 ≤ C ≤ 1,000)가 분 단위로 주어진다.
// 출력
// 첫째 줄에 종료되는 시각의 시와 분을 공백을 사이에 두고 출력한다. (단, 시는 0부터 23까지의 정수, 분은 0부터 59까지의 정수이다. 디지털 시계는 23시 59분에서 1분이 지나면 0시 0분이 된다.)

import java.util.Scanner;
public class Q2525 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("시간");
		int A = sc.nextInt();
		System.out.print("분");
		int B = sc.nextInt();
		System.out.println("요리시간");
		int C = sc.nextInt();
		
		int hourc = C / 60;
		int minc = C % 60;
		
		int h = A + hourc;
		int m = B + minc;
		
		if (m >= 60) {
			if (h + 1 > 23) {
				h = h + 1 - 24;
				m = m - 60;
			} else {
				h = h + 1;
				m = m - 60;
			}
		}
		else {
			if (h > 23) {				
				h = h - 24;
				m = m;
			} else {
				h = h;
				m = m;
			}
		}
		System.out.print(h + " " + m);
	}
}
