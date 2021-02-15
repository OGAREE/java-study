package study.java04.game369;

public class game369Divide {
	public int count369(int n) {
		// 3,6,9를 판단해서 갯수를 리턴
		int result =0;
		// 들어온 숫자를 받는 변수
		int a = 0;
		a=n;
		for (int i = 0; i < (n+"").length(); i++) {
			if((a%10)!=0 && (a%10)%3==0) {
				result++;
			}
			a = a/10;
		}
		
		return result;
	}
	
	//값을 출력
	public void play(int max) {
		for (int i = 1; i <= max; i++) {
			if (count369(i)>0) {
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
	
	public static void main(String[] args) {
		game369CharAt play369 = new game369CharAt();
		play369.play(100);
	}
}
