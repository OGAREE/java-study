package study.java06.magicsquare;

public class Main {
	public static void main(String[] args) {
		OddMagicSquare oddmagic = new OddMagicSquare();
		oddmagic.make();
		oddmagic.print();
		System.out.println(oddmagic.isCheck());
		
		FourMagicSquare fourmagic = new FourMagicSquare();
		fourmagic.make();
		fourmagic.print();
		System.out.println(fourmagic.isCheck());
		
		SixMagicSquare sixmagic = new SixMagicSquare();
		sixmagic.make();
		sixmagic.print();
		System.out.println(sixmagic.isCheck());
	}
}
