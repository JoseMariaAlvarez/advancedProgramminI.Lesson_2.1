
public class PoligonSquareTest {

	public static void main(String[] args) {
		Point [] sqrVertices = {new Point(0.0, 0.0), new Point(0.0, 1.0),
				                new Point(1.0, 1.0), new Point(1.0, 0.0)}; 
		Square sqr = new Square(sqrVertices);

		Double per = sqr.perimeter(); // method of class Poligon
		System.out.println(per);


	}

}
