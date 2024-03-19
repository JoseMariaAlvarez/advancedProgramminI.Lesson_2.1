package inheritance.redefinition;

public class Square extends Polygon {
	private double side;

	public Square(Point[] vs){
		super(vs);
		this.side = vs[0].distance(vs[1]);
	}
	
	@Override
	public double perimeter() {
		System.out.println("Square perimeter");
		return 4.0 * side;
	}
	
	@Override
	public String toString() {
		return "(" + side + ")"; 
	}
	
}
