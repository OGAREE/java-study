package study.java07.abstractclass.magicsquare;

public class OddMagicSquare extends AbstractMagicSquare{
	// 외부에서 만들어진 마방진을 가져가는 메소드
	public int[][] getMagic(){
		return magic;
	}

	public OddMagicSquare() {//생성자
		this(3);
	}

	public OddMagicSquare(int num) {
		this.init(num);
	}
	
	//	마방진을 만들 메소드
	public void make() {
		//위치값
		int x = 0;
		int y = maxNum/2;
		magic[x][y] = 1;

		// 값세팅
		for (int i = 2; i <= (maxNum+1)*(maxNum+1) ; i++) {
			// 원래 위치 기억하기
			int tempX = x;
			int tempY = y;

			// x의 위치
			if (x-1<0) {
				x = maxNum;
			}else {
				x--;
			}

			//y의 위치
			if (y-1<0) {
				y = maxNum;
			}else {
				y--;
			}

			// 값이 들어있을 경우
			if (magic[x][y]!=0) {
				x = tempX+1;
				y = tempY;
			}

			// 마방진에 셋팅하기
			magic[x][y] = i;
		}//for
	}//make
}