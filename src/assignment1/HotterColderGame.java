package assignment1;
import java.io.*;
import java.util.Scanner;



public class HotterColderGame {
	private int numRow;
	private int numCol;
	private Cell dest;
	//private Cell dest = new Cell((int)(1 + Math.random() * numRow), (int)(1 + Math.random() * numCol));
	private boolean again = true;

	private double calcDist(Cell cell) {
		//System.out.println(cell.row);
		//System.out.println(cell.col);

		return Math.pow((Math.pow(cell.row - dest.row, 2) + Math.pow(cell.col - dest.col, 2)), 1.0/2);
	}

	private class Cell {	// public or private?
		private int row;
		private int col;

		private Cell(int x, int y) {	// public or private?
			row = x;
			col = y;
		}
	}

	//public HotterColderGame() {


	public static void main(String[] args) {
		HotterColderGame game = new HotterColderGame();

		InputStreamReader istream = new InputStreamReader(System.in);
		BufferedReader bufRead = new BufferedReader(istream);

		System.out.println("Welcome to the hotter/colder game!");
		
		try {
			while (game.again) {
				System.out.println("How many rows are in the grid?");
				game.numRow = Integer.parseInt(bufRead.readLine());
				// why do I have access to private vars here

				System.out.println("How many columns are in the grid?");
				game.numCol = Integer.parseInt(bufRead.readLine());
				
				game.dest = game.new Cell((int)(1 + Math.random() * game.numRow), (int)(1 + Math.random() * game.numCol));
					// but not here;

				System.out.println("Do you have anything else to tell me?");
				if (bufRead.readLine().equals("A")) {

					System.out.println("Ahh, you're an administrator. The random location is " + game.dest.row + ", " + game.dest.col);
				}


				double prevDist = -1;
				double newDist = -1;
				Cell cell = game.new Cell(0, 0);
				Scanner in = new Scanner(System.in);

				System.out.println("What is your first guess?");

				cell.row = in.nextInt();
				cell.col = in.nextInt();
				
				//System.out.println(cell.row);
				//System.out.println(cell.col);

				newDist = game.calcDist(cell);
				System.out.println("Distance = " + newDist);
				prevDist = newDist;



				while (newDist != 0) {
					System.out.println("What is your next guess?");

					cell.row = in.nextInt();
					cell.col = in.nextInt();
					
					//System.out.println(cell.row);
					//System.out.println(cell.col);

					newDist = game.calcDist(cell);
					System.out.println("Distance = " + newDist);
					if (newDist == 0) {
						break;
					}
					
					else if (newDist == 1.00) {
						System.out.println("You're on fire!");
					}
					else if (newDist < prevDist) {
						System.out.println("You're getting warmer.");
					}
					else if (newDist > prevDist) {
						System.out.println("You're getting colder.");
					}
					else {
						System.out.println("You're not getting warmer or colder");
					}
					prevDist = newDist;
				}
				
				// create just one Scanner so no need to close it
				//in.close();	// close Scanner linked to System.in will raise an IOException
				
				System.out.println("YOU FOUND IT!");

				System.out.println("Would you like to play again?");
				String str = bufRead.readLine();
				if (!(str.equals("Y") || str.equals("y"))) {
					game.again = false;
				}
			}
		}
		catch (IOException err) {
			System.out.println("Error reading line");
		}
		catch (NumberFormatException err) {
			System.out.println("Error Converting Number");
		}



	}
}
