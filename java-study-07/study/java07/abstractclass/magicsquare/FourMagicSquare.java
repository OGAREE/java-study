package study.java07.abstractclass.magicsquare;


public class FourMagicSquare extends AbstractMagicSquare{
	public FourMagicSquare() {
		this(4);
	}

	public FourMagicSquare (int num) {
		init(num);
	}

	//4마방진을 구현하는 로직!!
	public void make() {
		makeRigth(); // 기본흐름
		makeLeft(); // 역흐름
	}
	
	private void makeRigth() {
		int count = magic.length;
		for (int i = 0; i < magic.length; i++) {
			for (int j = 0; j < magic.length; j++) {
				magic[i][j]=i*count+j+1;
			}
		}

	}

	private void makeLeft() {
		int count = magic.length;
		for(int i=0; i<count; i++) {
			for (int j = 0; j < count; j++) {
				if( i>= count/4 && i < count/4*3) {
					if(j >= 0 && j<count/4 || j >= count/4*3 && j< count) {
						magic[i][j] = (count*count) - (i * count + j);
					}
				}
				else {
					if(j >= count/4 && j < count/4*3) {
						magic[i][j] = (count*count)-(i * count +j);
					}
				}
			}
		}
	}
}
