package study.java07.abstractclass.game369;

public class Play369CharAt extends Game369Abstract {
	public int count369(int n){
		// 3,6,9를 판단해서 갯수를 리턴하는 변수
		int result = 0;
		String strNum = n+"";
		for (int i = 0; i < strNum.length(); i++) {
			if (strNum.charAt(i)=='3') {
				result++;
			}else if(strNum.charAt(i)=='6') {
				result++;
			}else if(strNum.charAt(i)=='9') {
				result++;
			}
		}
		return result;
	}
}
