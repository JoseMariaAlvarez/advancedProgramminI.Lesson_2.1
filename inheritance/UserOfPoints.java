package inheritance;

public class UserOfPoints {

	public static void main(String[] args) {

		Point pnt1, pnt2; // local variables

		pnt1 = new Point(1, 43);
		System.out.println(pnt1.abscissa());

		pnt1.abscissa(0.0);
		System.out.println(pnt1.abscissa());
		System.out.println(pnt1);

		Particle part1 = new Particle (10.0d, 20.0d, 7.0d);
		System.out.println(part1);

		Point part2;
		part2 = new Particle (10.0d, 20.0d, 7.0d);

		System.out.println(part2);

		Point p3 = null;
		part2 = p3;
		
		pnt1 = new Particle(9.0);
		
		Particle part3 = (Particle)pnt1;
		System.out.println(part3.attraction(part1));
	}

}

		
