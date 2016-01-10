/*
 * Jo Narvaez-Jensen
 * CS142
 * 1/7/2016
 * Assignment #1
 * Chapter 1, Programming Project #2 (slightly modified), page 60
 * Create a program that will output 3 different letters mixing and matching
 * paragraphs using only 3 method calls within the main method.
 * 
 * Reflections
 * This was a fun program to analyze.  For me the main trick was to balance out
 * between variables and method calls and keeping each to the fewest repeats as 
 * I could think of.  Sometimes I think I get a little method happy instead of 
 * using the KISS approach and just making it easiest on myself. Maybe, I'm 
 * just thinking about scaling more than I really need to be.
 * 
 * In a updated versions I'd like adjust and make use of Apache Common's wrap
 * method (WordUtils) to make the output more readable. However it looks to 
 * be an additional library that needs to be added manually. While I know once I 
 * have the byte code compiled it would run anywhere, I'm worried that it's 
 * inclusion here would result in preventing it from compiling on Prof's system.
 * 
 * To try and make it a bit more readable I originally typed the paragraphs into 
 * my text editor(Atom).  This allowed me to place a \n after the ~80th character 
 * the standard length of a line. It's a hard-coded work around that is purely case
 * specific and not something I suspect to do normally.  
 */

public class letterCreator {
	
	//class variables
	//each variable design as individual paragraphs with full class scope.
	static String intro = "Just wanted to check in with an update and see how are things going with you.\nThe weather has turned a little bit cold but I’m staying warm and so far have\nmanaged to avoid this year’s death plague.  Also, new glasses look great but\nfeel a little weird on my face.\n ";
	static String classes = "The first week of classes have gone well and I’m excited about a couple of my\nprofessors.  This quarter is looking to be more assignment heavy than quiz\nexam heavy. It’s certainly nice to be programming again and trying my hand at\nmore creative projects than the basics. Also, intro to philosophy gained 20\ncool points in requiring me to watch the Matrix for the second paper. Such a\nhard thing to do! lol\n";
	static String relationship = "Things with Tracy are as good as every.  Still going to out to see movies on a\nregular basis. There’s also a plan to get a new cat to help Starbuck dealing\nwith the loss of Rusty.  Also, we might be getting a membership to a gym that\nhas an indoor rock wall which is awesome!\n";
	static String hobbies = "I have been enjoying the hell out of my X-One.  Fallout 4 is really fun but\nhard to play in quick burst so I’ve been saving that for weekends mostly.\nDuring the week it’s been mostly Forza 6, such a pretty game and I’m debating\nwith myself bout getting a wheel and pedal setup to take better advantage it’s\nvast driving/car customization.\n";
	static String questions = "How are things?  Were you able to catch up on your tv show?  Also, interested\nin catching a movie next week?\n";
	static String closing = "So yeah, no complaints and everything is going well and I’ll see you soon!\n";
	
	
	//method creates the start of the letter
	public static void greeting (String who){
		System.out.println("Hey " + who + "!");
		System.out.println(intro);
		System.out.println(questions);
		
	}
	
	//method creates the end of the letter
	public static void saluation (String msg){
		System.out.println(closing);
		System.out.println(msg);
		System.out.println("- Jo\n");
		
	}
	
	//method creates a letter to mom
	public static void momLetter (){
		greeting("mom");
		System.out.println(classes);
		System.out.println(relationship);
		saluation("Love you!");
		
	}
	
	//method creates a letter to a friend
	public static void chadLetter (){
		greeting("BEST MAN CHAD");
		System.out.println(classes);
		System.out.println(hobbies);
		saluation("Later bro!");
		
	}
	
	//method creates a letter to sister
	public static void sisterLetter (){
		greeting("sis");
		System.out.println(classes);
		System.out.println(relationship);
		System.out.println(hobbies);
		saluation("Love ya Steph =)"); 
		
	}
	
	//Invokes the 3 letters to be generated
	public static void main(String[] args) {
		momLetter();
		chadLetter();
		sisterLetter();
		
	}

}