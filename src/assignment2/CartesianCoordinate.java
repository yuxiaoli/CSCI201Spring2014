package assignment2;

public class CartesianCoordinate extends Coordinate {

	public CartesianCoordinate(double val1, double val2) {
		super(val1, val2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDistance(Coordinate c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getSlopeOfLine(Coordinate c) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public CartesianCoordinate(PolarCoordinate pc) {
		super(pc.getValue1() * Math.cos(pc.getValue2()), pc.getValue1() * Math.sin(pc.getValue2()));
	}

	@Override
	public double getInterceptOfLine(Coordinate c) {
		// TODO Auto-generated method stub
		return 0;
	}

}
