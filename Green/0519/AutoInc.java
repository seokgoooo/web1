public class AutoInc {
	public static void main(String[] args) {
		int a = 10;
		
		// 복합 대입 연산자 += -= *= /=
		// a += 1;
		// a -= 1;
		
		// 증감연산자 -> 순서에 따라 값이 달라진다.
		// a++; -> a 이후 +1
		// ++a; -> +1 이후 a
		// 문장 위아래 순서를 통해서 사용해보자
		
		System.out.println(a++);
		System.out.println(a);
	}
}