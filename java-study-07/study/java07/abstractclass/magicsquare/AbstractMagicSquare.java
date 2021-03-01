package study.java07.abstractclass.magicsquare;

public abstract class AbstractMagicSquare {
	public int[][] magic;
	public int maxNum;
	
	public abstract void make();
	
	public void init(int num) {
		magic =new int[num][num];
		maxNum = num-1;
	}
	
	// 만들어진 마방진을 출력하는 메서드!!
	public void print() {
		int count =  magic.length;
		
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < count; j++) {
				System.out.print(magic[i][j]+"\t");
			}
			System.out.println();
		}
	}//print
	
	//마방진 로직 검사하기
			public boolean isCheck() {
				boolean isT = true;
				int count=maxNum+1;
			//같은 타입이 여려개 저장될 방을 만든다.
			//2*n+2개의 방을 만든다.
				int[] mCheck = new int[2*count+2];
				for (int i = 0; i < count; i++) {
					for (int j = 0; j < count; j++) {
						//가로줄
						mCheck[i] += magic[i][j];
						//세로줄
						mCheck[i+count] +=magic[j][i];
						// \대각선
						if(i==j) {
						mCheck[2*count] +=magic[i][j];
						}
						// /대각선
						if(i+j==count-1) {
							mCheck[2*count+1] += magic[i][j];
						}
						
					}//j for문
				}// i for문
				
				//마방진 검증
				for (int i = 1; i < mCheck.length; i++) {
					if(mCheck[0]!=mCheck[i]) {
						isT=false;
						break;
					}
				}
				
				return isT;
			}
}
