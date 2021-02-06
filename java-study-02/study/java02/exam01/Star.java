package study.java02.exam01;

public class Star {

	public static void star1(int n) {
		for(int i =0; i<n; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void star2(int n) {
		for (int i = 0; i < n; i++) {
			for (int  j= 0; j< 2*i+1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void star3(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i-1; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <2*i+1 ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		star1(5);
		star2(5);
		star3(5);
	}

}