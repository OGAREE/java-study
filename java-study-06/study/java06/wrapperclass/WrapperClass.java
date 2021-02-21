package study.java06.wrapperclass;

public class WrapperClass {
	public static void main(String[] args) {
		/*
		 * Wrapper class
		 * - 기본타입을 참조타입으로, 참조타입을 기본타입으로 변환할 때 사용하는 클래스
		 * 
		 * - Byte, Short, Integer, Long, Float, Double, Boolean, Character
		 * */
		
		int n = 10; 
		Integer i = new Integer(n);// 기본 → 참조 (래퍼 클래스)
		int n1 = i.intValue(); // 참조 (래퍼 클래스) → 기본
		int n2 = i;//참조 (래퍼 클래스) → 기본
		
		
		Object o = 10; // 기본 → 참조 (래퍼 클래스)
		int n3 = (int) o; // 참조 (래퍼 클래스) → 기본
		int n4 = (Integer)o; // 참조 (래퍼 클래스) → 기본
		
		// Boxing : 기본 → 참조타입 (래퍼 클래스)
		// unBoxing : 참조타입 (래퍼 클래스) → 기본타입
		// Boxing과 unBoxing을 할때 사용하는 클래스 Wrapper class
		
		// Integer.parseInt();
		// - 문자열을 기본타입 숫자 int로 변환할 때 사용하는 메소드 
		int pwd = Integer.parseInt("12345");
		
		// 단축 대입 연산자 
		// +=, -=, /=, *=, %=
		// a+=1 => a = a + 1, a-=1 => a = a-1
	}
}
