/******************************************************************************

	Money.java		Author: James Pratt

	Prompts for and reads a double value representing a monetary amount. Then 
	determines the fewest number of each bill and coin needed to represent
	that amount, starting with the highest. 

******************************************************************************/

import java.util.Scanner;

public class Money 
{
	// Prompts and reads a double value monetary amount.

	public static void main(String[] args)
	{
		double input, ten, five, one, quarter, dime, nickel, penny, remainder;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a double digit money value:");
		input = scan.nextDouble();
		System.out.println("You entered: " + input + ".");

		// Determines the fewest number of each bill and coin needed to 
		// represent that amount, starting with the highest. 

		// Calculations:

		ten = (input - (input % 10)) / 10;
		remainder = input - (ten * 10);
		five = (remainder - (remainder % 5)) / 5;
		remainder = remainder - (five * 5);
		one = (remainder - (remainder % 1)) / 1;
		remainder = remainder - (one * 1);
		quarter = (remainder - (remainder % .25)) / .25;
		remainder = remainder - (quarter * .25);
		dime = (remainder - (remainder % .1)) / .1;
		remainder = remainder - (dime * .1);
		nickel = (remainder - (remainder % .05)) / .05;
		remainder = remainder - (nickel * .05);
		penny = (remainder - (remainder % .01)) / .01;
		remainder = remainder - (penny * .01 + 1);

		// Outputs:

		System.out.println(ten + " ten dollar bills.");
		System.out.println(five + " five dollar bills.");
		System.out.println(one + " one dollar bills.");
		System.out.println(quarter + " quarters.");
		System.out.println(dime + " dimes.");
		System.out.println(nickel + " nickels.");
		System.out.println(penny + " pennies.");
	}

}
























