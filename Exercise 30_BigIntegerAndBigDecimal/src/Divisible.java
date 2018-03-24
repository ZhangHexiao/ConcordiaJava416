


import java.math.*;


public class Divisible {

    // class variables go here
    // should always be private
    private BigInteger bigNum;
   
    
    /**
     * Constructor for now just make sure you have one that looks like this
     */
    public Divisible() {
        super();
    }

    /**
     * Here is out work area for now
     */
    public void perform() {
            // bigNum represents Long.MAX_VALUE
    bigNum = new BigInteger(
		"10000000000000000000000000000000000000000000000000");
    // bigNum is now larger than Long.MAX_VALUE
    bigNum.add(BigInteger.ONE);

    int count = 1;
    while (count <= 10) {
      if (bigNum.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
          bigNum.remainder(new BigInteger("3")).equals(BigInteger.ZERO)) {
        System.out.println(bigNum);
        count++;
      }

      bigNum = bigNum.add(BigInteger.ONE);
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
        Divisible d = new Divisible();
        // Call the method that runs the show
        d.perform();
        // End the program
        System.exit(0);
    }
}

