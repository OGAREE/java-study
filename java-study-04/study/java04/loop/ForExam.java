package study.java04.loop;

import java.util.Iterator;

/*
 * 반복문 for
 * for(int i=0; i<10; i++){
 * 	   (타입 변수초기값; 조건식; 증감값;)
 * }
 * 
 * 기준값이 있거나 일정한 규칙으로 값이 증가나 감소할 때 사용
 * 
 * 지역변수(local variable)는 값을 초기화 해주지 않으면 오류가 발생한다.
 * 
 * */
public class ForExam {
	//홀수, 짝수 합 구하기
	
	//짝수의 합
	public void sum1(int n) {
		int sum =0;
		for (int i = 1; i <= n; i++) {
			if (i%2==0) {
				continue;
			}
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("1~"+n+" 홀수의 합 : "+sum );
	}
	
	//홀수의 합
	public void sum2(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i%2==1) {
				continue; //continue는 어떤 조건일 경우에는 아래로 진행하지 않고 다시 위로 이동한다.(한 스텝 건너뛴다.)
			}
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("1~"+n+" 짝수의 합 : "+sum );
	}
	
	public static void main(String[] args) {
		ForExam f =  new ForExam();
		f.sum1(10);
		f.sum2(10);
	}
}
