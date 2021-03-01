package study.java07.abstractclass.magicsquare;

public class SixMagicSquare extends AbstractMagicSquare {
	public SixMagicSquare() {
		this(6);
	}

	public SixMagicSquare(int n) {
		this.init(n);
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
		OddMagicSquare odd = new OddMagicSquare(count/2);
		odd.make();
		int[][] oddM = odd.getMagic();
		
		for (int i = 0; i < count/2; i++) {
			for (int j = 0; j < count/2; j++) {
				magic[i][j] += oddM[i][j];
				magic[i][j+count/2] += oddM[i][j];
				magic[i+count/2][j] += oddM[i][j];
				magic[i+count/2][j+count/2] += oddM[i][j];
			}
		}
	}
}
