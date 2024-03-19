package inheritance;

public class ParticleTest {

	public static void main(String[] args) {
		Point p = new Point (0.0,0.0);
		
		System.out.println(p.abscissa());
		p.move(2.0, 0);
		System.out.println(p.abscissa());
		
		Particle prt = new Particle(5.0);
		prt = new Particle(0.0, 0.0, 5.0);

		System.out.println(prt.abscissa());
		prt.move(2.0, 0);
		System.out.println(prt.abscissa());
	}

}
