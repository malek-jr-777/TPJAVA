package tp2crcl;
import java.util.Scanner;

public class Test {
	public static void main (String[] args) {
		Scanner aff=new Scanner(System.in);
		
		System.out.print("rayon");
		double r = aff.nextDouble();
		
		Cercle c1 = new Cercle(r);
		System.out.println("surface de crcl :"+ c1.crclsurf());
		System.out.print("longeur");
		double l= aff.nextDouble();
		System.out.print("largeur");
		double lg=aff.nextDouble();
		
		Rectangle r1 = new Rectangle(l , lg);
		
		System.out.println("surface de rectng :"+ r1.surfcrec());
		
		
		aff.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}		

}
