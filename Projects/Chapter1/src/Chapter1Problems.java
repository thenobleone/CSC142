/*
 * This program solves some problems to illustrate concepts from Chapter 1.
 * Jo Narvaez-Jensen
 * 1/7/2016
 */

public class Chapter1Problems {
	
	/**
	 * @author TheNobleOne
	 * This comment created to showcase Java Documentation comments.
	 * Following methods created to showcase making multiple methods within a class 
	 */
	
	public static void method1(){
		System.out.println("This is method \"  ' \\ #1.");
		method2();
		
	}
	
	public static void method2(){
		System.out.println("This is method\t #2.");
		
	}
	
	/*
	 * Method outputs an egg designed to match Practice-It BJP3 Exercise 1.9:Egg - SUCCESSFUL!
	 */
	public static void Egg (){
		
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
        System.out.println("-\"-'-\"-'-\"-");
        System.out.println("\\         /");
        System.out.println(" \\_______/");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello Class!\n");
		method1();
		Egg(); //draws an egg
	}

}



// char canDrive = (fuelLevel > 0) ? 'Y' : 'N';

