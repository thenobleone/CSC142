/*
 * Jo Narvaez-Jensen
 * CS142
 * 1/7/2016
 * Assignment #1
 * Chapter 1, Question #11, pg. 56
 * 
 * What redundancy can be eliminated with static methods?
 * 	By using static methods I was able to break down the rockets into 4 
 * components: the rocket heads and flames, dividing lines, side body with 
 * text, and side body without text. This allowed me to only create the 
 * component once and simply invoke each method to replicated the piece I
 * needed.
 * 
 * What redundancy cannot be eliminated?
 * I attempted to use a for loop to further break down the components but ran 
 * into issues related to the variety of blank spaces and in ability to 
 * return back to a line level that had already had output printed on it. Thus 
 * the redundancy I had to accept was the need to manually draw each component
 * side by side.
 * 
 * Reflections
 * I really wanted to try and figure out how to make this using a loop of some
 * kind but I couldn't figure out how to deal with the spacing differences in a
 * way that wasn't more complicated than the method I used. A curiosity, need 
 * to look if there is a way to print to a line that has been previously used. 
 */

public class TwoRockets {
	
	//method creates the arrow like rocket heads and flames
	public static void arrow (){
		System.out.println("   /\\         /\\");
		System.out.println("  /  \\       /  \\");
		System.out.println(" /    \\     /    \\");
	}
	
	//method creates the rocket part divisions 
	public static void lid (){
		System.out.println("+------+   +------+");
		
	}
	
	
	//method creates the rocket body labels
	public static void namedBox (){
		System.out.println("|United|   |United|");
		System.out.println("|States|   |States|");
	}
	
	//method creates the unlabeled rocket body
	public static void blankBox (){
		System.out.println("|      |   |      |");
		System.out.println("|      |   |      |");
	} 
	
	//method 'draws' two rockets!
	public static void main(String[] args) {
		arrow();
		lid();
		blankBox();
		lid();
		namedBox();
		lid();
		blankBox();
		lid();
		arrow();

	}

}

