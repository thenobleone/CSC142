/*
 * Jo Narvaez-Jensen
 * CS142
 * 1/7/2016
 * Assignment #1
 * Chapter 1, Question #5, page 55
 * 
 * Program designed to illustrate the usage of escape characters within output 
 * lines. 
 * 
 * Reflection
 * Funny enough this is the first time I had to write a program about escape 
 * characters that I managed to knock out with minimal effort. The only 
 * difficulty came on line 24 with the triple \.
 */

public class MuchBetter {

	public static void main(String[] args) {
		System.out.println("A \"quoted\" String is ");
		System.out.println("'much' better is you learn");
		System.out.println("The rules of \"escape sequences.\"");
		System.out.println("Also, \"\" represents an empty String.");
		System.out.println("Don't forget: use \\\" instead of \"!" );
		System.out.println("' ' is not the same as \"");
	}

}
