import java.util.Scanner;

public class Page73Two {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("받은 돈을 입력하시오: ");
		int firstm = input.nextInt();
		
		System.out.print("상품의 총액을 입력하시오: ");
		int item = input.nextInt();
		
		double tax = (item * 0.1);
		int finalm = (firstm - item);
		
		System.out.println("받은 돈: " + firstm);
		System.out.println("상품의 총액: " + item);
		System.out.println("부가세: " + tax);
		System.out.println("잔돈: " + finalm);
	}
}