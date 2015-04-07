package assignment2.helper;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaIO {
	/*
	 * You can use any of the following based on the requirement:
	 * 1. Scanner class
	 * 2. BufferedReader and InputStreamReader classes
	 * 3. DataInputStream class
	 * 4. Console class
	 */
	
	public static void main(String[] args) {
		try {
			// using Scanner class:
			Scanner scan = new Scanner(System.in);
			String s = scan.next();
			int i = scan.nextInt();
			
			// using BufferedReader class:
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			s = br.readLine();
			i = Integer.parseInt(br.readLine());
			
			// using DataInputStream class:
			DataInputStream dis = new DataInputStream(System.in);
			/* String s = dis.readLine(); 
			 * DataInputStream.readLine() has been deprecated 
			 * to get String value you need to use BufferedReader class
			 */
			i = dis.readInt();
			
			// using Console class:
			Console console = System.console();
			s = console.readLine();
			i = Integer.parseInt(console.readLine());
			
			/*
			 * Note that DataInputStream is for reading binary data. Using readInt on System.in does not parse an integer from the character data, it will instead reinterpret the unicode values and return nonsense. See DataInput#readInt for details (DataInputStream implements DataInput). 
			 */
		}
		catch (Exception err) {
			System.out.println("Generic exception caught");
		}
	}
}
