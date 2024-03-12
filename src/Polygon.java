public class Polygon {
	private final Point[] vert;
	
	public Polygon(Point[] vs) {
		vert = vs;
	}
	
	public double perimeter() { 
		Point ant = vert[vert.length-1];
		double res = 0.0;
		for(Point pnt : vert) {
			 res += pnt.distance(ant);
			 ant = pnt;
		}
		return res;
	}
		
}
