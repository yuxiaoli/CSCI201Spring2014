package assignment2;

public class CartesianCoordinate extends Coordinate {

	public CartesianCoordinate(double val1, double val2) {
		super(val1, val2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getDistance(Coordinate c) {
		// TODO Auto-generated method stub
		// to do - check the coordinate passed in c is Cartesian
		return Math.pow((Math.pow(c.getValue1() - getValue1(), 2) + Math.pow(c.getValue2() - getValue2(), 2)), 1.0/2);
	}

	@Override
	public double getSlopeOfLine(Coordinate c) {
		// TODO Auto-generated method stub
		// assume the coordinate passed in c is Cartesian
		return (c.getValue2() - getValue2()) / (c.getValue1() - getValue1());
	}
	
	public CartesianCoordinate(PolarCoordinate pc) {
		super(pc.getValue1() * Math.cos(pc.getValue2()), pc.getValue1() * Math.sin(pc.getValue2()));
	}

	@Override
	public double getInterceptOfLine(Coordinate c) {
		// TODO Auto-generated method stub
		// assume check the coordinate passed in c is Cartesian
		return (c.getValue1() * getValue2() - getValue1() * c.getValue2()) / (c.getValue1() - getValue1());
	}

}
