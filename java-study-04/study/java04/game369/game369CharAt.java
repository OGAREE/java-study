package study.java04.game369;

public class game369CharAt {
	/*
	 * 3,6,9가 나오는 갯수만큼 *를 출력하는 프로그램
	 * 3,6,9가 들어있는지를 판단
	 * 3,6,9가 몇개 있는지를 판단.
	 * */
	public int count369(int n) {
		// 3,6,9를 판단해서 갯수를 리턴
		int result =0;
		String strNum = n+""; 
		//" "를 붙힌 이유! int타입인 n을 String타입으로 바꾸기 위해(String 타입의 특징 : concatenation)  
		for (int i = 0; i < strNum.length(); i++) {
			if (strNum.charAt(i)=='3') {
				result++;
			}
			else if (strNum.charAt(i)=='6') {
				result++;
			}
			else if (strNum.charAt(i)=='9'){
				result++;
			}
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
