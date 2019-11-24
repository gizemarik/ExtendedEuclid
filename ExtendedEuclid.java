
import java.math.BigInteger;
import java.util.Scanner;

public class ExtendedEuclid {
	
	//Finding gcd for 2 big integer 
	public static BigInteger GCDForBigIntegers(BigInteger a, BigInteger b) {
		
		//holds the result
        BigInteger result;
        
        //Case that if the second number equals to zero
        if(b.compareTo(BigInteger.ZERO) == 0) {
        	System.out.println("The second number cannot be zero.Please try again!");
        	System.exit(0);
        }
        
        // Calculate gcd 
        result = a.gcd(b); 

        // Print result 
        System.out.println("The GCD of "
                           + a + " and "
                           + b + " is "
                           + result); 

        return(result);    
	}
	
	//Check whether these numbers are relatively prime or not
	public static boolean isRelativelyPrime(BigInteger result) {
		if(result.compareTo(BigInteger.ONE) == 0) {
			System.out.println("The Numbers Are Relatively Prime!");
			return true;
		} else {
			System.out.println("The Numbers ARE NOT Relatively Prime!");
			System.exit(0); //If numbers are not , extended euclidean algo. assumption is not hold!
			return false;
		}
	}
	
	//Finding multiplicative inverse of two big integer 
	public static BigInteger multInverse(BigInteger a, BigInteger b) 
    { 
        BigInteger b0 = b; 
        BigInteger y = BigInteger.ZERO;
        BigInteger x = BigInteger.ONE;
 
        if (b == BigInteger.ZERO) {
        	System.exit(0);
            return BigInteger.ZERO; 
        }
        while (a.compareTo(BigInteger.ONE) == 1)
        {              	
            // q is quotient 
            BigInteger q = a.divide(b);
            BigInteger t = b; 
  
            // m is remainder 
            b = a.mod(b); 
            a = t; 
            t = y; 
  
            // Update x and y 
            y = x.subtract(q.multiply(y)); 
            x = t; 
        } 
  
        //Case if x is non-positive number
        if (x.compareTo(BigInteger.ZERO) == -1) 
            x.add(b0); 
  
        System.out.println("Multiplicative "+ 
                "inverse is " + x); 
        
        return x;  
    } 
		
	   public static void main(String[] args) 
	    { 
		   	BigInteger checkPrime ;
		   	
		   	Boolean algoAssumption;
		   	
	        Scanner in = new Scanner(System.in); 
	        System.out.print("Enter the first big integer : ");
	        BigInteger a = in.nextBigInteger();  
	        
			System.out.print("Enter the second big integer : ");
	        BigInteger b = in.nextBigInteger();  
	        
	        checkPrime = GCDForBigIntegers(a,b);
	        algoAssumption = isRelativelyPrime(checkPrime);
	        
	        if(algoAssumption = true) {
	        	multInverse(a,b);
	        }	        
	    }

}