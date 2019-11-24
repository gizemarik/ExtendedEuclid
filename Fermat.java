 
import java.math.BigInteger;
import java.util.Scanner;
  
public class Fermat { 
	public static void FermatForPrimalityTest(BigInteger number) {
		 // Boolean variable to store the result 
       boolean result; 
   
       // When certainty is one, 
       // it will check number for prime or composite 
       result = number.isProbablePrime(1); 
       System.out.println(number.toString() + " with certainty 1 " + result); 
 
       // When certainty is zero, 
       // it is always true 
       result = number.isProbablePrime(0); 
       System.out.println(number.toString() + " with certainty 0 " + result); 
 
       // When certainty is negative, 
       // it is always true 
       result = number.isProbablePrime(-1); 
       System.out.println(number.toString() + " with certainty -1 " + result); 
   }   
	
	   public static void main(String[] args) 
	    {   
		   	Scanner scn = new Scanner(System.in); 
	        System.out.println("Enter a number to test primality : ");
	        
	        BigInteger number = scn.nextBigInteger();  
	        
	        FermatForPrimalityTest(number);	        
	    }
   
} 
  