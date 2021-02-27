package study.java07.abstractclass.game369;

public abstract class Game369Abstract {
	// overriding할 메소드 선언
	public abstract int count369(int n);
	
	// 값을 출력
	public void play(int max) {
		for (int i = 1; i <= max; i++) {
			if(count369(i)>0) {
				for (int j = 0; j < count369(i); j++) {
					System.out.print("*");
				}
				System.out.print("\t");
			}
			else {
				System.out.print(i+"\t");
			}
			
			if (i%10==0) {
				System.out.println();				
			}
		}
	}
}
