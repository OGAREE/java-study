package study.java02.exam03;

public class StringExam {
	/*
	 * String은 문자열을 받을 수 있는 참조타입이다.
	 * 특징 
	 *  참조타입이지만 기본타입의 성질을 갖고 있다.
	 *  1) immutable : 값을 다시할당 하기 전까지 변하지 않는다.
	 *  2) concatenation : String 타입을 만나는 순간 String 타입이 된다.
	 * */
	
	public static void main(String[] args) {
		
		//immutable
		System.out.println(" immutable");
		System.out.println("-------------");
		String s = "홍길동";
		s.replace("홍", "고");
		System.out.println(s);
		
		int a = 10;
		int b = a + 20;
		System.out.println(a);
		
		//concatenation
		System.out.println("\n concatenation");
		System.out.println("--------------");
		
		System.out.println((1+2)+3+"고길동");
		System.out.println(1+2+3+"고길동");
		System.out.println(1+2+"고길동"+3);
		System.out.println(1+"고길동"+2+3);
		System.out.println("고길동"+1+(2+3));
		
		//String의 기본타입의 성질
		String str = "고길동";
		String str1 = new String("고길동");
		String str2 = "고길동";
		
		
		System.out.println(str==str1); //false
		System.out.println(str==str2); // true
		System.out.println(str.equals(str1)); //true
		System.out.println(str.equalsIgnoreCase(str2)); //true
		
		// String 관련 문자열 클래스
		// String, StringBuffer, StringBuilder
		// String : 참조타입이지만 기본타입의 성질을 가지고 있는 문자열 클래스
		// StringBuffer: 진정한 참조타입 클래스이다!(thread-safety) 동기화(synchronized), 속도느림!					 		 	
		// StringBuilder: 진정한 참조타입 클래스이다!(thread-unsafety) 속도빠름!!							 
		StringBuffer sb = new StringBuffer("고길동");
		sb.append(" 소드마스터");
		System.out.println(sb);
		
		
	}

}
