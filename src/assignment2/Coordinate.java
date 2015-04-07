package assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

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
		
		//boolean limbo = true;
		
		try {
			while (true) {
				
				System.out.println("[polar] Ploar Coordinates (r, theta)");
				System.out.println("[cartesian] Cartesian Coordinates (x, y)");
				System.out.println("[file] File Input");
				System.out.println("[exit] Exit program");
				
				System.out.print("What type of coordinates?");
				
				String temp = bufRead.readLine();
				if (temp.equals("polar")) {
					while (true) {
						System.out.println("[degrees] Degrees");
						System.out.println("[radians] Radians");
						
						System.out.print("What type of angle?");
						
						temp = bufRead.readLine();
						if (temp.equals("degrees")) {
							System.out.print("Coordinate 1 - Please enter the radius: ");
							double r1 = Double.parseDouble(bufRead.readLine());
							System.out.print("Coordinate 1 - Please enter theta (degrees): ");
							double t1 = Double.parseDouble(bufRead.readLine());
							System.out.print("Coordinate 2 - Please enter the radius: ");
							double r2 = Double.parseDouble(bufRead.readLine());
							System.out.print("Coordinate 2 - Please enter theta (degrees): ");
							double t2 = Double.parseDouble(bufRead.readLine());
							
							// debug msg
							System.out.println("r1 = " + r1 + ", t1 = " + t1 + ", r2 = " + r2 + ", t2 = " + t2);
							
							Coordinate coord1 = new PolarCoordinate(r1, Math.toRadians(t1));
							Coordinate coord2 = new PolarCoordinate(r2, Math.toRadians(t2));
							
							while (true) {
								System.out.println("[convert] Convert to Cartesian coordinates");
								System.out.println("[distance] Find the distance between the two points");
								System.out.println("[slope] Find the slope of the line between the points");
								System.out.println("[equation] Find the equation of the line between the points");
								System.out.println("[menu] Return to main menu");
								
								System.out.print("What would you like to do?");
								
								temp = bufRead.readLine();
								if (temp.equals("convert")) {
									Coordinate coord1Cartesian = new CartesianCoordinate((PolarCoordinate) coord1);
									Coordinate coord2Cartesian = new CartesianCoordinate((PolarCoordinate) coord2);
									
									System.out.println("The Cartesian coordinate for (" + r1 + ", " + t1 + ") is (" + coord1Cartesian.getValue1() + ", " + coord1Cartesian.getValue2() + ")");
									System.out.println("The Cartesian coordinate for (" + r2 + ", " + t2 + ") is (" + coord2Cartesian.getValue1() + ", " + coord2Cartesian.getValue2() + ")");
									//break;
								}
								else if (temp.equals("distance")) {
									System.out.println("The distance between the Cartesian coordinates (" + r1 + ", " + t1 + ") and (" + r2 + ", " + t2 + ") is " + coord1.getDistance(coord2));
									//break;
								}
								else if (temp.equals("slope")) {
									System.out.println("The slope between the Cartesian coordinates (" + r1 + ", " + t1 + ") and (" + r2 + ", " + t2 + ") is " + coord1.getSlopeOfLine(coord2));
									//break;
								}
								else if (temp.equals("equation")) {
									System.out.println("The equation of the line between the points is y = " + coord1.getSlopeOfLine(coord2) + "x + " +coord1.getInterceptOfLine(coord2));
									//break;
								}
								else if (temp.equals("menu")) {
									break;
								}
								else {
									System.out.println("Please enter one of the options provided.");
								}
							}
							
							break;
						}
						else if (temp.equals("radians")) {
							System.out.print("Coordinate 1 - Please enter the radius: ");
							double r1 = Double.parseDouble(bufRead.readLine());
							System.out.print("Coordinate 1 - Please enter theta (radians): ");
							double t1 = Double.parseDouble(bufRead.readLine());
							System.out.print("Coordinate 2 - Please enter the radius: ");
							double r2 = Double.parseDouble(bufRead.readLine());
							System.out.print("Coordinate 2 - Please enter theta (radians): ");
							double t2 = Double.parseDouble(bufRead.readLine());
							
							// debug msg
							System.out.println("r1 = " + r1 + ", t1 = " + t1 + ", r2 = " + r2 + ", t2 = " + t2);
							
							Coordinate coord1 = new PolarCoordinate(r1, t1);
							Coordinate coord2 = new PolarCoordinate(r2, t2);
							
							while (true) {
								System.out.println("[convert] Convert to Cartesian coordinates");
								System.out.println("[distance] Find the distance between the two points");
								System.out.println("[slope] Find the slope of the line between the points");
								System.out.println("[equation] Find the equation of the line between the points");
								System.out.println("[menu] Return to main menu");
								
								System.out.print("What would you like to do?");
								
								temp = bufRead.readLine();
								if (temp.equals("convert")) {
									Coordinate coord1Cartesian = new CartesianCoordinate((PolarCoordinate) coord1);
									Coordinate coord2Cartesian = new CartesianCoordinate((PolarCoordinate) coord2);
									
									System.out.println("The Cartesian coordinate for (" + r1 + ", " + t1 + ") is (" + coord1Cartesian.getValue1() + ", " + coord1Cartesian.getValue2() + ")");
									System.out.println("The Cartesian coordinate for (" + r2 + ", " + t2 + ") is (" + coord2Cartesian.getValue1() + ", " + coord2Cartesian.getValue2() + ")");
									//break;
								}
								else if (temp.equals("distance")) {
									System.out.println("The distance between the Cartesian coordinates (" + r1 + ", " + t1 + ") and (" + r2 + ", " + t2 + ") is " + coord1.getDistance(coord2));
									//break;
								}
								else if (temp.equals("slope")) {
									System.out.println("The slope between the Cartesian coordinates (" + r1 + ", " + t1 + ") and (" + r2 + ", " + t2 + ") is " + coord1.getSlopeOfLine(coord2));
									//break;
								}
								else if (temp.equals("equation")) {
									System.out.println("The equation of the line between the points is y = " + coord1.getSlopeOfLine(coord2) + "x + " +coord1.getInterceptOfLine(coord2));
									//break;
								}
								else if (temp.equals("menu")) {
									break;
								}
								else {
									System.out.println("Please enter one of the options provided.");
								}
							}
							
							break;
						}
						else {
							System.out.println("Please enter one of the options provided.");
						}
					}
					//break;
				}
				else if (temp.equals("cartesian")) {
					System.out.print("Coordinate 1 - Please enter x: ");
					double x1 = Double.parseDouble(bufRead.readLine());
					System.out.print("Coordinate 1 - Please enter y: ");
					double y1 = Double.parseDouble(bufRead.readLine());
					System.out.print("Coordinate 2 - Please enter x: ");
					double x2 = Double.parseDouble(bufRead.readLine());
					System.out.print("Coordinate 2 - Please enter y: ");
					double y2 = Double.parseDouble(bufRead.readLine());
					
					Coordinate coord1 = new CartesianCoordinate(x1, y1);
					Coordinate coord2 = new CartesianCoordinate(x2, y2);
					
					while (true) {
						System.out.println("[convert] Convert to Cartesian coordinates");
						System.out.println("[distance] Find the distance between the two points");
						System.out.println("[slope] Find the slope of the line between the points");
						System.out.println("[equation] Find the equation of the line between the points");
						System.out.println("[menu] Return to main menu");
						
						System.out.print("What would you like to do?");
						
						temp = bufRead.readLine();
						if (temp.equals("convert")) {
							Coordinate coord1Polar = new PolarCoordinate((CartesianCoordinate) coord1);
							Coordinate coord2Polar = new PolarCoordinate((CartesianCoordinate) coord2);
							
							System.out.println("The Polar coordinate for (" + x1 + ", " + y1 + ") is (" + coord1Polar.getValue1() + ", " + coord1Polar.getValue2() + ")");
							System.out.println("The Polar coordinate for (" + x2 + ", " + y2 + ") is (" + coord2Polar.getValue1() + ", " + coord2Polar.getValue2() + ")");
							//break;
						}
						else if (temp.equals("distance")) {
							System.out.println("The distance between the Cartesian coordinates (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + coord1.getDistance(coord2));
							//break;
						}
						else if (temp.equals("slope")) {
							System.out.println("The slope between the Cartesian coordinates (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + coord1.getSlopeOfLine(coord2));
							//break;
						}
						else if (temp.equals("equation")) {
							System.out.println("The equation of the line between the points is y = " + coord1.getSlopeOfLine(coord2) + "x + " +coord1.getInterceptOfLine(coord2));
							//break;
						}
						else if (temp.equals("menu")) {
							break;
						}
						else {
							System.out.println("Please enter one of the options provided.");
						}
					}
					//break;
				}
				else if (temp.equals("file")) {
					System.out.print("Enter the input filename: ");
					String inputFilename = bufRead.readLine();
					System.out.print("Enter the output filename: ");
					String outputFilename = bufRead.readLine();
					
					FileReader fr = new FileReader(inputFilename);
					BufferedReader br = new BufferedReader(fr);
					
					FileWriter fw = new FileWriter(outputFilename);
					PrintWriter pw = new PrintWriter(fw);
					
					while (true) {
						String line = br.readLine();
						String delims = "[, ]+";
						String[] tokens = line.split(delims);
						
						if (tokens.length == 0) {
							pw.print("invalid input");
							continue;
						}
						else if (tokens[0].equals("Cartisian")) {
							
						}
						else if (tokens[0].equals("Polar")) {
							if (tokens.length != 2) {
								pw.print("invalid input");
								continue;
							}
							
						}
						else {
							pw.print("invalid input");
						}
						
					}
					
					pw.flush();
					pw.close();
					fw.close();
					br.close();
					fr.close();
					
					System.out.println("File was parsed and output generated.");
					//break;
				}
				else if (temp.equals("exit")) {
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
		catch (Exception e) {
			System.out.println("Generic exception caught");
		}
		
		
	}
	
}
