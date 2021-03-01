package study.java07.abstractclass.magicsquare;

public class Main {
	public static void main(String[] args) {
		AbstractMagicSquare oddmagic = new OddMagicSquare();
		oddmagic.make();
		oddmagic.print();
		System.out.println(oddmagic.isCheck());
		
		AbstractMagicSquare fourmagic = new FourMagicSquare();
		fourmagic.make();
		fourmagic.print();
		System.out.println(fourmagic.isCheck());
		
		AbstractMagicSquare sixmagic = new SixMagicSquare();
		sixmagic.make();
		sixmagic.print();
		System.out.println(sixmagic.isCheck());
	}
}
