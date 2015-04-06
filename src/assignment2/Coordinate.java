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
		
		boolean limbo = true;
		
		try {
			while (limbo) {
				
				System.out.println("[polar] Ploar Coordinates (r, theta)");
				System.out.println("[cartesian] Cartesian Coordinates (x, y)");
				System.out.println("[file] File Input");
				System.out.println("[exit] Exit program");
				
				System.out.println("What type of coordinates?");
				
				if (bufRead.readLine().equals("polar")) {
					while (true) {
						System.out.println("[degrees] Degrees");
						System.out.println("[radians] Radians");
						
						if (bufRead.readLine().equals("degrees")) {
							System.out.println("Coordinate 1 - Please enter the radius: ");
							double r1 = Integer.parseInt(bufRead.readLine());
							System.out.println("Coordinate 1 - Please enter theta (degrees): ");
							double t1 = Integer.parseInt(bufRead.readLine());
							System.out.println("Coordinate 2 - Please enter the radius: ");
							double r2 = Integer.parseInt(bufRead.readLine());
							System.out.println("Coordinate 2 - Please enter theta (degrees): ");
							double t2 = Integer.parseInt(bufRead.readLine());
							
							while (true) {
								System.out.println("[convert] Convert to Cartesian coordinates");
								System.out.println("distance] Find the distance between the two points");
								System.out.println("[slope] Find the slope of the line between the points");
								System.out.println("[equaltion] Find the equation of the line between the points");
								System.out.println("[menu] Return to main menu");
								
								System.out.println("What would you like to do?");
								if (bufRead.readLine().equals("convert")) {
									break;
								}
								else if (bufRead.readLine().equals("distance")) {
									break;
								}
								else if (bufRead.readLine().equals("slope")) {
									break;
								}
								else if (bufRead.readLine().equals("equation")) {
									break;
								}
								else if (bufRead.readLine().equals("menu")) {
									break;
								}
								else {
									System.out.println("Please enter one of the options provided.");
								}
							}
							
							break;
						}
						else if (bufRead.readLine().equals("radians")) {
							break;
						}
						else {
							System.out.println("Please enter one of the options provided.");
						}
					}
					//break;
				}
				else if (bufRead.readLine().equals("cartesian")) {
					while (true) {
						System.out.println("Coordinate 1 - Please enter x: ");
						double x1 = Integer.parseInt(bufRead.readLine());
						System.out.println("Coordinate 1 - Please enter y: ");
						double y1 = Integer.parseInt(bufRead.readLine());
						System.out.println("Coordinate 2 - Please enter x: ");
						double x2 = Integer.parseInt(bufRead.readLine());
						System.out.println("Coordinate 2 - Please enter y: ");
						double y2 = Integer.parseInt(bufRead.readLine());
						
						while (true) {
							System.out.println("[convert] Convert to Cartesian coordinates");
							System.out.println("distance] Find the distance between the two points");
							System.out.println("[slope] Find the slope of the line between the points");
							System.out.println("[equaltion] Find the equation of the line between the points");
							System.out.println("[menu] Return to main menu");
							
							System.out.println("What would you like to do?");
							if (bufRead.readLine().equals("convert")) {
								break;
							}
							else if (bufRead.readLine().equals("distance")) {
								break;
							}
							else if (bufRead.readLine().equals("slope")) {
								break;
							}
							else if (bufRead.readLine().equals("equation")) {
								break;
							}
							else if (bufRead.readLine().equals("menu")) {
								break;
							}
							else {
								System.out.println("Please enter one of the options provided.");
							}
						}
					}
					//break;
				}
				else if (bufRead.readLine().equals("file")) {
					System.out.println("Enter the input filename: ");
					String inputFilename = bufRead.readLine();
					System.out.println("Enter the output filename: ");
					String outputFilename = bufRead.readLine();
					
					System.out.println("File was parsed and output generated.");
					//break;
				}
				else if (bufRead.readLine().equals("exit")) {
					System.out.println("Thank you for using my program!");
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
