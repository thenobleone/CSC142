/*
 * Jo Narvaez-Jensen
 * 1/7/2016
 * Program is my solution to BJP3 Exercise 1.13: StarFigures
 * from the Parctice-It website (http://tinyurl.com/jpwtdfx)
 * 
 * Update 1.2 Attempted to apply rule of three in order to keep 
 * clarity but reduce redundancy. 
 */


public class StarFigures {
    
	/*
	 * Method creates an output of double row of 5 asterisk 
	 */
    public static void row(){
    	String starline = "*****";
        System.out.println(starline + "\n" + starline);
    	
    }
    
    /*
     * Method creates an asterisk three line x pattern
     */
    public static void starX(){
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }
    
    public static void gap (){
        System.out.println("");
        
    }
    
    /*
     * Method creates a vertical three line run of asterisks
     */
    public static void verticalLine(){
    	String vLine = "  *  ";
        System.out.println(vLine + "\n" + vLine + "\n" + vLine);
  
    }
    
    /*
     * Main used to create the matching output as the pattern from the Just Practice-It Exercise
     */
    public static void main(String[] args){
        row();
        starX();
        gap();
        row();
        starX();
        row();
        gap();
        verticalLine();
        row();
        starX();
    }
}
