
public class EnclosedPoint extends Point {
	private Point cornerBL, cornerTR; 

	public EnclosedPoint(Point cBL, Point cTR) {
		// implicit invocation of super()
		if (abscissa() > cTR.abscissa() || abscissa() < cBL.abscissa()) {
			throw new RuntimeException("abcissa out of bounds");
		}
		cornerBL = cBL;
		cornerTR = cTR;
	}

	public EnclosedPoint(double x, double y, Point cBL, Point cTR) {
		super(x, y);
		cornerBL = cBL;
		cornerTR = cTR;
	}

	
	public double width() { 
		return cornerTR.abscissa() - cornerBL.abscissa();
	}
	public double height() { 
		return cornerTR.ordinate() - cornerBL.ordinate(); 
	}
	public void move(double a, double b) {
		super.move(a, b);
		if (abscissa() < cornerBL.abscissa()) 
			this.abscissa(cornerBL.abscissa());
		if (abscissa() > cornerTR.abscissa()) 
			super.abscissa(cornerTR.abscissa());
		if (ordinate() < cornerBL.ordinate()) 
			ordinate(cornerBL.ordinate());
		if (ordinate() > cornerTR.ordinate()) 
			ordinate(cornerTR.ordinate());
	}
}
