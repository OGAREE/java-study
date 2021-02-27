package study.java03.overloading;

/*
 * overloading(오버로딩)
 * - 메소드의 이름과 리턴타입은 같고,
 *   아규먼트 갯수와 타입이 다르면 다른 메소드처럼 행동하는 것
 * */
public class Overloading {
	String coffee;
	int milk;
	int price;

	public static void eat(String coffee, int price) {
		System.out.println(coffee+"를 "+ price+ "원에 먹었어요");
	}
	
	public static void eat(String coffee, int milk, int price) {
		System.out.println("라떼를 " + price+"원에 먹었어요");
	}
	
	public static void main(String[] args) {
		eat("에스프레소", 8000);
		eat(null, 1, 8000);
	}
}
