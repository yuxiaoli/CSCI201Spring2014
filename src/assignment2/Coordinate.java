package assignment2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Coordinate {
	private double value1, value2;
	public Coordinate(double val1, double val2) {
		value1 = val1;
		value2 = val2;
	}
	
	public abstract double getDistance(Coordinate c);
	
	public abstract double getSlopeOfLine(Coordinate c);
	
	protected double getValue1() {
		return value1;
	}
	
	protected double getValue2() {
		return value2;
	}
	
	public abstract double getInterceptOfLine(Coordinate c);
	
	public static void main(String[] args) {
		InputStreamReader istream = new InputStreamReader(System.in);
		BufferedReader bufRead = new BufferedReader(istream);
		
		try {
			while (true) {
				
				System.out.println("[polar] Ploar Coordinates (r, theta)");
				System.out.println("[cartesian] Cartesian Coordinates (x, y)");
				System.out.println("[file] File Input");
				System.out.println("[exit] Exit program");
				
				System.out.println("What type of coordinates?");
				
				if (bufRead.readLine().equals("polar")) {
					break;
				}
				else if (bufRead.readLine().equals("cartesian")) {
					break;
				}
				else if (bufRead.readLine().equals("file")) {
					break;
				}
				else if (bufRead.readLine().equals("exit")) {
					break;
				}
				else {
					System.out.println("Please enter one of the options provided.");
				}
			}
			
		}
		catch (IOException err) {
			System.out.println("Error reading line");
		}
		
		
	}
	
}
