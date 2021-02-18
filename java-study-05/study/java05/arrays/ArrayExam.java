package study.java05.arrays;
/*
 * 배열(Array)
 * - 정의 : 같은 타입을 여러개 나열한 것
 * - 용도 : 같은 타입의 변수를 여러개 만들 경우에 사용
 * 
 * 	a[]		a[][]	  a[][][] , ...
 * 1차원		2차원		  3차원		다차원
 * 
 * - 배열을 기본타입도 참조타입도 다 만들 수 있다.
 * - 배열을 참조타입이다.
 * 
 * 배열 사용법
 * 
 * -1) int[] a = {1,2,3,4,5}
 * -2) int[] b = new int[]{1,2,3,4,5}
 * -3) int[] c;
 * 		c = new int[5];
 * 		c[0]=1;
 * 		c[1]=2;
 * 		c[2]=3;
 * 		c[3]=4;
 * 		c[4]=5;
 * 
 * */
public class ArrayExam {
	public static void main(String[] args) {
		//1)
		int[] a = {1,2,3,4,5};
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
		
		//2)
		
		//enhanced for (향상된 for문)
		// - 배열이나 리스트같은 JCF(자료구조)에 있는 값을 뽑을때 사용한다.
		// iterator pattern (내용물이 바닥날 때까지 뽑는다.)
		// - 값을 빼낼 수 있는 방법이 없을때, 
		// - 그 안에 값이 들어있면 들어있는 내용을 뽑아내는 패턴
		int[] b =  new int[] {11,22,33,44,55};
		for(int i : b) {
			System.out.print(i+"/");
		}
		System.out.println();
		
		//3)
		int[] c = null;
		c = new int[5];
		c[0]=111;
		c[1]=222;
		c[2]=333;
		c[3]=444;
		c[4]=555;
		for (int i : c) {
			System.out.print(i+"/");
		}
		System.out.println();
		
		//배열의 복사(copy)
		//shallow copy(얕은 복사)
		//배열의 주소값을 넘긴다.
		//reference assignment
		int[] d= {1,2,3,4,5};
		int[] e=d;
		e[4]=100;
		System.out.println(d[4]);
		
		//deep copy(깊은 복사)
		//배열의 값 자체를 넘긴다.
		//value assignment
		int[] d1= {1,2,3,4,5};
		int[] e1= new int [5];
		
		System.arraycopy(d1, 0, e1, 0, d.length);
		e1[3]=50;
		System.out.println(d1[3]);
	}
}
