/*
 * Jo Narvaez-Jensen
 * 1/7/2016
 * Program is my solution to BJP3 Exercise 1.14: Lanterns
 * from the Practice-It website (http://tinyurl.com/jfvf42f)
 * 
 * Reflections:
 * In this practice problem I attempted to apply better usage
 * of control flow and conditionals in order to reduce the 
 * number of manual method calls needed in main.
 */

public class Lanterns {
	
	//This method creates the smallest row of asterisk 
	public static void baseRow (){
		drawLatern(' ', 4);
		drawLatern('*', 5);
		
	}
	
	/*
	 * This method creates the longer two rows in conjunction 
	 * with the baseRow method
	 */
	public static void topBase (){
		baseRow();
		drawLatern(' ', 2);
		drawLatern('*', 9);
		drawLatern('*', 13);
		
	}

	//This method creates the gap in the lantern for light
	public static void lightRow(){
		System.out.println("* | | | | | *");
	}
	
	//Method for creating new lines as needed
	public static void newLine (){
        System.out.println("");
        
    }
	/*
	 * This method takes in an individual character and how 
	 * many times it needs to be created in order to draw the 
	 * lines of the lantern   
	 */
	public static void drawLatern (char character, int n){
		for (int i = 0; i < n; i++){
			System.out.print(character);
		}
		
		/*
		 * Conditional test to limit the number of times the 
		 * newLine method has to be manually called when creating
		 * the asterisk rows
		 */
		if (character == '*'){
			newLine ();
		}
		
	}
	
	
	public static void main(String[] args) {
		topBase();
		newLine();
		
		topBase();
		lightRow();
		drawLatern('*', 13);
		topBase();
		newLine();
		
		topBase();
		baseRow();
		lightRow();
		lightRow();
		baseRow();
		baseRow();
	}

}
