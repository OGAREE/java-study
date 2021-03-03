package study.java08.switchcase;

import java.util.Scanner;

/*
 * switch ~ case
 * - if ~ else if 하고 비슷하다, 하지만 성능은 switch ~ case가 더 좋다!
 * 
 * ex) switch(값){
 * 			case (값 일치하면):
 * 			문장
 * 			break;
 * 
 * 			case (값 일치하면):
 * 			문장
 * 			break;
 * 
 * 			default:
 * 			문장
 * }
 * 	- break를 반드시 작성해야 하고, break를 작성하지 않았을 경우에는 결과가 원하는대로 동작하지 않는다.
 *  - 값 => byte, int, String, enum 타입 
 * 
 * */
public class SwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("고길동");
			break;

		case 2:
			System.out.println("홍길동");
			break;
			
		case 3:
			System.out.println("김길동");
			break;
			
		default:
			System.out.println("해당 사항없음");
			break;
		}
		// switch case 문에서 값에 들어가는 타입중에 byte는 사용하지 않고
			// 될수있으면 int형을 사용하자.
			// 정수형의 기본은 변수로 처리할 때 자동으로 int로 변환한다.
			// 그래서 오류가 발생할 수 있기 때문에, 정수는 int형태로 사용한다!
	}
}
