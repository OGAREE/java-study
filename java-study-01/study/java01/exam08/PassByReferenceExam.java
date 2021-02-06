package study.java01.exam08;

public class PassByReferenceExam {

	public static void main(String[] args) {
		//pass by reference 예시 1
		int[] a = {1,2,3,4,5};
		int[] c = a;
		
		c[0]=100;
		
		for(int i=0;i<5;i++)
		System.out.print(a[i]+" ");
		
		System.out.println();
	
		//pass by reference 예시 2
		String str = "식빵";
		str = str.replace("식", "건");
		System.out.println(str);
	}
}
