import java.util.Scanner;
public class Methods {	
	// 숫자 하나가 짝수, 홀수 인지 알고 싶음. 이 기능을 할 수 있는 메소드.
	public static boolean isEven(long num) {
		return num % 2 == 0;
	}

	// int isEven(int)
	
	// char isEven(int)
	
	public static int increase(int a) {
		a++;
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		
		if (isEven(a)) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		// int a = 10;
		
		// System.out.println(increase(a));
		// System.out.println(a);
	}
	
	// public static int,int createTwoNumber() {
		// return 20,30;
	// }
	
	// public static boolean test() {
		// return 10;
	// }
	
}