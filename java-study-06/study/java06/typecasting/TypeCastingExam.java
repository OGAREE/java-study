package study.java06.typecasting;

public class TypeCastingExam {
	public static void main(String[] args) {
		/*
		 * 형변환(TypeCasting)
		 * - 기본 데이터 타입 크기    → 갈수록 커짐
		 * 	boolean char byte short int long float double  
		 *  
		 * 	예시 
		 * 
		 * 	//낮은 데이터 타입 → 높은 데이터 타입
		 * 	byte a = 10;  
		 * 	int b = a; //(auto)promotion, up casting [implicit(암시적)]
		 * 
		 * 
		 *  //높은 데이터 타입 → 낮은 데이터 타입
		 * 	int c = 20;
		 * 	byte d = (byte)c; // (down)casting [explicit(명시적)]		
		 *	//주의 : 범위가 벗어나면 쓰레기 값이 저장될 수 있다.	 
		 * 	
		 * - 참조 타입
		 * 	Student s =  new Student();
		 * 
		 *  //자식 클래스 → 부모 클래스
		 * 	People p = s; //(auto)promotion, up casting [implicit(암시적)]
		 * 	
		 *  //부모 클래스 → 자식 클래스
		 *  Student s1 = (Student)p; // (down)casting [explicit(명시적)]
		 * 
		 * */
		
		Student s = new Student();
		People p = s;
		Student s1 = (Student)p;
	}
}
