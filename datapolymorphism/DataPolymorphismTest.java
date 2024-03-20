package datapolymorphism;

import java.util.ArrayList;

import dynamicBinding.points.EnclosedPoint;
import inheritance.Particle;
import inheritance.Point;

public class DataPolymorphismTest {

	public static void main(String[] args) {
		ArrayList<Point> alp = new ArrayList<>();
		
		alp.add(new Point (0.5, 0.7));
		alp.add(new Particle(1.2, 1.4, 0.56));
		alp.add(new EnclosedPoint(new Point(-5.0, -4.0), 
				                  new Point(10.0, 12.0)));
		System.out.println(alp);
		for (Point p : alp) {
			p.move(1.0, 1.0);
		}
		System.out.println(alp);

	}

}
