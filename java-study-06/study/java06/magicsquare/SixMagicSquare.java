package study.java06.magicsquare;

public class SixMagicSquare {
	private int[][] magic;

	public SixMagicSquare() {
		this(6);
	}

	public SixMagicSquare(int n) {
		this.init(n);
	}

	private void init(int n) {
		this.magic = new int[n][n];
	}

	public void make() {
		makeA();
		makeB();
		makeCD();
		Multiples();
		addABCD();
	}

	private void makeA() {
		int count = magic.length;

		for(int i=0;i<count/2;i++) {
			for (int j = 0; j < count/4; j++) {
				if(count/4==i) {
					magic[i][j+1]=3;
				}else {
					magic[i][j]=3;
				}
			}
		}

	}

	private void makeB() {
		int count = magic.length;
		for (int i = 0; i < count/2; i++) {
			for (int j = 0; j < count/2; j++) {
				magic[i][j+count/2]=1;
			}
		}

		for (int i = 0; i < count/2; i++) {
			for (int j = 0; j < count/2-(count/4-1); j++) {
				magic[i][j+count/2]=2;
			}
		}

	}

	private void makeCD() {
		int count = magic.length;
		//C
		for (int i = 0; i < count/2; i++) {
			for (int j = 0; j < count/2; j++) {
				if(magic[i][j]==0) {
					magic[i+count/2][j]=3;
				}
				else {
					magic[i+count/2][j]=0;
				}
			}

			//D
			for (int j = 0; j < count/2; j++) {
				if(magic[i][j+count/2]==2) {
					magic[i+count/2][j+count/2]=1;
				}
				else {
					magic[i+count/2][j+count/2]=2;
				}
			}
		}

	}

	private void Multiples() {
		int count = magic.length;
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				magic[i][j]*=(count/2)*(count/2);
			}
		}
	}

	private void addABCD() {
		int count = magic.length;
		OddMagicSquare odd = new OddMagicSquare();
		odd.make();
		int[][] oddM = odd.getMagic();
		for (int i = 0; i < count/2; i++) {
			for (int j = 0; j < count/2; j++) {
				magic[i][j]+=oddM[i][j];
				magic[i][j+count/2]+=oddM[i][j];
				magic[i+count/2][j]+=oddM[i][j];
				magic[i+count/2][j+count/2]+=oddM[i][j];
			}
		}
	}

	//마방진 출력하기
	public void print() {
		int count = magic.length;
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
		int count = magic.length;
		// 같은 타입이 여러개 저장될 방을 만든다.
		// 2*n+2개의 방을 만든다. 
		int[] mCheck = new int [2*count+2];
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				// 가로 3줄
				mCheck[i]+=magic[i][j];
				// 세로 3줄
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
