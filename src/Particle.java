public class Particle extends Point {
	final static private double G = 6.67e-11;
	private double mass; 

	public Particle(double a, double b, double m) {
		super(a, b);
		mass = m; 
	}

	public Particle(double m) {
		this(0, 0, m);
		mass = m; 
	}
	public void mass(double m) { mass = m; }

	public double mass() { return mass; }

	public double attraction(Particle part) {
		double d = this.distance(part);
		return G * mass * part.mass() / (d * d);
	}
}
