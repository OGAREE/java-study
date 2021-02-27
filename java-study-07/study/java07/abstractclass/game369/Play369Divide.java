package study.java07.abstractclass.game369;

public class Play369Divide extends Game369Abstract{
	public int count369(int n){
		// 3,6,9를 판단해서 갯수를 리턴하는 변수
		int result = 0;
		// 들어온 숫자를 받는 변수 
		int a = 0;
		a = n;
		for (int i = 0; i < (n+"").length(); i++) {
			if( (a%10)!=0 && (a%10)%3==0 ) {
				result++;
			}
			a = a/10;
		}
		
		return result;
	}
}
