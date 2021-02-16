package study.java04.loop;

/*
 * while
 * 	해당하는 조건을 만족하는 동안 그 다음 문장을 실행한다.
 * 	while은 무한루프가 걸릴 수 있기 때문에, 반드시 해제하는 조건을 만들어 놔야 한다.
 * 	while(true or false){
 * 		...
 *	} 
 *
 *	do while은 do안에 있는 문장을 최소 1번은 무조건 실행해준다.
 *	그리고 나서 while에 있는 조건을 만족할 경우에는 do에 있는 문장을 실행한다.
 *
 *	do{
 *		...
 *	}while(조건식);
 * */
public class WhileExam {
	public void sum1() {
		int sum =0;
		int i =0;

		while(true) {
			sum = sum+i;
			i++;
			if(i>10) {
				break; //가장 가까운 반복문 하나를 벗어난다.
			}
		}
		System.out.println(sum);
		
	}
	
	public void sum2() {
		int sum =0;
		int i = 0;
		do {
			i++;
			sum=sum+i;
			System.out.println(i+"번째의 합 =" +sum);
		}while(false);
			
		
	}

	public static void main(String[] args) {
		WhileExam w = new WhileExam();
		w.sum1();
		w.sum2();
	}
}
