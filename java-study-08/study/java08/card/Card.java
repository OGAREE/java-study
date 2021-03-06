package study.java08.card;

//카드 객체 만들기 
//1 ~ J Q K(13) * H,D,C,S = 52개의 카드가 만들어지도록 구현
//Card card = new Card() 했을때 52개중 하나가 만들어지도록 하기
public class Card {
	private String card;

	// 카드 그림 : heart, diamond, clover, spade
	public static final String[] image = {"H", "D", "C", "S"};

	// 카드 숫자 : A~10,J,Q,K
	public static final String[] number = {"A","2","3","4","5","6","7","8","9","T","J","Q","k"};

	//객체를 생성할 때 마다 카드를 하나 생성한다.
	// Card card = new Card(); -> 카드 생성

	public Card() {
		init();
	}

	private void init() {
		// 0 ~ 3
		int img = (int)(Math.random()*image.length);

		// 0 ~ 12
		int num = (int)(Math.random()*number.length);

		card = image[img]+number[num];
	}

	public String getCard() {
		return card;
	}

	// 값 보기
	@Override
	public String toString() {
		return "["+card+"]";
	}

	// equals overriding
	// hashCode도 같이 오버라이딩을 시켜 줘야한다.
	@Override
	public boolean equals(Object obj) {
		boolean isT = false;
		Card cd = new Card();
		if (card.equals(cd.getCard())) {
			isT=true;
		}
		return isT;
	}

	@Override
	public int hashCode() {
		// 소수를 더해준다.
		return card.hashCode()+31;
	}
}
