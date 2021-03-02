package study.java06.magicsquare;

public class OddMagicSquare {
	private int[][] magic; // 마방진 저장할 변수
	private int maxNum;// x-1<0 최대값 저장

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

	// 초기화 하는 메소드
	private void init(int num) {
		magic = new int[num][num];//배열 초기화 0으로 초기화 된다.
		maxNum = num - 1; // 최대 위치는 num보다 1작다.
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
	}//make()

	//마방진 출력하기
	public void print() {
		int count = maxNum+1;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				System.out.print(magic[i][j]+"\t");
			}
			System.out.println();			
		}
	}// 출력하기

	// 마방진 로직 검증하기
	public boolean isCheck() {
		boolean isT = true;
		int count = maxNum+1;
		// 같은 타입이 여러개 저장될 방을 만든다.
		// 2*n+2개의 방을 만든다. 
		int[] mCheck = new int [2*count+2];
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				// 가로줄
				mCheck[i]+=magic[i][j];
				// 세로줄
				mCheck[i+count]+=magic[j][i];
				// \대각선
				if (i==j) {
					mCheck[2*count]+=magic[i][j];
				}
				// /대각선
				if (i+j==count-1) {
					mCheck[2*count+1]+=magic[i][j];
				}
			}
		}

		for (int i = 1; i < mCheck.length; i++) {
			if (mCheck[0]!=mCheck[i]) {
				isT = false;
				break;
			}
		}

		return isT;
	}

}