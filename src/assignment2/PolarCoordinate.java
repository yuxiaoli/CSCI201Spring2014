package assignment2;

public class PolarCoordinate extends Coordinate {

	public PolarCoordinate(double val1, double val2) {
		super(val1, val2);
		// TODO Auto-generated constructor stub
		
		// debug msg
		System.out.println("raw val1 = " + getValue1() + " val2 = " + getValue2());
		
		// val1 - r
		// val2 - theta in radians [0, 2*pi)
		// to do - normalize input to become within the range
		
		// debug msg
		System.out.println("normalized val1 = " + getValue1() + " val2 = " + getValue2());
	}

	@Override
	public double getDistance(Coordinate c) {
		// TODO Auto-generated method stub
		// to do - check the coordinate passed in c is polar
		
		CartesianCoordinate coord1 = new CartesianCoordinate(this);
		CartesianCoordinate coord2 = new CartesianCoordinate((PolarCoordinate) c);
		
		return coord1.getDistance(coord2);
	}

	@Override
	public double getSlopeOfLine(Coordinate c) {
		// TODO Auto-generated method stub
		// assume the coordinate passed in c is polar
		
		CartesianCoordinate coord1 = new CartesianCoordinate(this);
		CartesianCoordinate coord2 = new CartesianCoordinate((PolarCoordinate) c);
		
		return coord1.getSlopeOfLine(coord2);
	}
	
	public PolarCoordinate(CartesianCoordinate cc) {
		// public static double atan2(double y, double x) - radians
		// (r, theta)
		super(Math.pow(Math.pow(cc.getValue1(), 2) + Math.pow(cc.getValue2(), 2), 1.0/2), Math.atan2(cc.getValue2(), cc.getValue1()));
		// all pts might be mapped to qudra 1 and 4 check (1, 1), (1, -1), (-1, -1), (-1, 0)
	}

	@Override
	public double getInterceptOfLine(Coordinate c) {
		// TODO Auto-generated method stub
		// assume the coordinate passed in c is polar
		
		CartesianCoordinate coord1 = new CartesianCoordinate(this);
		CartesianCoordinate coord2 = new CartesianCoordinate((PolarCoordinate) c);
		
		return coord1.getInterceptOfLine(coord2);
	}

}
