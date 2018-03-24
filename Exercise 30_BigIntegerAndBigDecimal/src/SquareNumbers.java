




import java.math.*;


public class SquareNumbers {

    // bigNum represents Long.MAX_VALUE
    final BigInteger MAXLONG = new BigInteger(Long.MAX_VALUE + "");
    BigInteger bigNum;
   
    
    /**
     * Constructor for now just make sure you have one that looks like this
     */
    public SquareNumbers() {
        super();
    }

    /**
     * Here is out work area for now
     */
    public void perform() {
            

    // Find the first five number such that number^2 is greater than
		// Long.MAX_VALUE
		
                long first = Integer.MAX_VALUE;
                
                
                  
                
                
                int count =0;
                bigNum = new BigInteger(first + "");
		while (count<10){
		     if (bigNum.multiply(bigNum).compareTo(MAXLONG) < 0){
			    bigNum = bigNum.add(BigInteger.ONE);
                            System.out.println(bigNum);
                     }
                     else{
                            System.out.println(bigNum);                         
                            bigNum = bigNum.add(BigInteger.ONE);
                            count++;
                     }
                }


                
    }

    /**
     * The main method is where a program starts. While you can write any code
     * that you want in the main method you should not. This method just gets
     * the ball rolling and waits for the program to end.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        // Instantiate the first or primary object
        SquareNumbers sn = new SquareNumbers();
        // Call the method that runs the show
        sn.perform();
        // End the program
        System.exit(0);
    }
}

